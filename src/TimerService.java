import java.util.Timer;
import java.util.TimerTask;

public class TimerService {
    private boolean timeUp = false;

    public void startTimer(int seconds) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int time = seconds;

            public void run() {
                if (time <= 0) {
                    timeUp = true;
                    timer.cancel();
                }
                time--;
            }
        }, 0, 1000);
    }

    public boolean isTimeUp() {
        return timeUp;
    }
}
