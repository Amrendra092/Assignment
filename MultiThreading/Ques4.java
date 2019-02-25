//Try shutdown() and shutdownNow() and observe the difference
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("last Thread");
                }
            });
        } finally {
            executorService.shutdown();
        }

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
