import App.typingmaster.SessionTimerModule.TimerListener;

import java.util.Scanner;

public class TimerSession extends Thread {

    private int totalSeconds;
    private volatile boolean running = true;
    private volatile boolean paused = false;
    private volatile long lastTypingTime;

    private final int inactivityLimit = 5000; // 5 seconds idle
    private final TimerListener listener;

    public TimerSession(int minutes, TimerListener listener) {
        this.totalSeconds = minutes * 60;
        this.lastTypingTime = System.currentTimeMillis();
        this.listener = listener;
    }

    // Call this when user types something
    public void userTyped() {
        lastTypingTime = System.currentTimeMillis();

        if (paused) {
            paused = false;
            if (listener != null) {
                listener.onResume();
            }
        }
    }

    public void stopTimer() {
        running = false;
    }

    @Override
    public void run() {

        while (running && totalSeconds >= 0) {

            long currentTime = System.currentTimeMillis();

            // Check inactivity
            if (!paused && currentTime - lastTypingTime >= inactivityLimit) {
                paused = true;
                if (listener != null) {
                    listener.onIdlePause();
                }
            }

            // Only decrease time if not paused
            if (!paused) {
                if (listener != null) {
                    listener.onTick(totalSeconds);
                }
                totalSeconds--;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (totalSeconds < 0 && listener != null) {
            listener.onSessionFinished();
        }
    }

    public static void main(String[] args) {

        // Implement listener to handle timer events
        TimerListener listener = new TimerListener() {
            @Override
            public void onTick(int remainingSeconds) {
                int minutes = remainingSeconds / 60;
                int seconds = remainingSeconds % 60;
                System.out.printf("\rTime Remaining: %02d:%02d", minutes, seconds);
            }

            @Override
            public void onIdlePause() {
                System.out.print("\rTimer Paused (No typing...)     ");
            }

            @Override
            public void onResume() {
                System.out.print("\rTimer Resumed!                 ");
            }

            @Override
            public void onSessionFinished() {
                System.out.println("\nTime's up! Lesson Finished!");
            }
        };

        // Create the timer
        TimerSession timer = new TimerSession(1, listener); // 1 minute
        timer.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nStart typing... (Press ENTER to simulate typing)");

        while (true) {
            scanner.nextLine(); // user types something
            timer.userTyped();  // notify timer
        }
    }
}