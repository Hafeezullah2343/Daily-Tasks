import java.util.Scanner;

class SessionTimer extends Thread {

    private int totalSeconds;
    private volatile boolean running = true;
    private volatile boolean paused = false;
    private volatile long lastTypingTime;

    private final int inactivityLimit = 5000; // 5 seconds

    public SessionTimer(int minutes) {
        this.totalSeconds = minutes * 60;
        this.lastTypingTime = System.currentTimeMillis();
    }

    // Call this when user types something
    public void userTyped() {
        lastTypingTime = System.currentTimeMillis();
        paused = false;
    }

    public void stopTimer() {
        running = false;
    }

    @Override
    public void run() {

        while (running && totalSeconds >= 0) {

            long currentTime = System.currentTimeMillis();

            // Check inactivity
            if (currentTime - lastTypingTime >= inactivityLimit) {
                paused = true;
            }

            if (!paused) {
                int minutes = totalSeconds / 60;
                int seconds = totalSeconds % 60;

                System.out.printf("\rTime Remaining: %02d:%02d", minutes, seconds);
                totalSeconds--;
            } else {
                System.out.print("\rTimer Paused (No typing...)     ");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (totalSeconds < 0) {
            System.out.println("\nTime's up!");
        }
    }
    public static void main(String[] args) {

        SessionTimer timer = new SessionTimer(5); // 5 minutes
        timer.start();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nStart typing... (Press ENTER to simulate typing)");

        while (true) {
            scanner.nextLine(); // user types something
            timer.userTyped();  // notify timer
        }
    }
}
