import java.util.concurrent.Executors;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ques8 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.schedule(new Runnable() {
                                     @Override
                                     public void run() {
                                         System.out.println("Task executed after ten second");
                                     }
                                 },
                10,
                TimeUnit.SECONDS);
        executorService.shutdown();
    }
}
