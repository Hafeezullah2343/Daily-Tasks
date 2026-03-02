package App.typingmaster.SessionTimerModule;

public interface TimerListener {
    void onTick(int remainingSeconds);      // called every second
    void onIdlePause();                     // called when timer auto-pauses
    void onResume();                        // called when user types and resumes
    void onSessionFinished();               // called when time ends
}