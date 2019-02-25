import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Ques4_part2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread1");
                }
            });
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("thread2");
                    }
                });
                    executorService.submit(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Thread 3");
                        }
                    });
                }
                finally {
                    executorService.shutdownNow();
                }

        System.out.println("End");
            }
    }