public class Ques11 {
    int count;
    synchronized public void incrementCount() {
        count++;
    }

    public void job1() {
        for (int i=1;i<=1000;i++){
            incrementCount();
        }
    }

    public void job2() {
        for (int i=1;i<=1000;i++){
            incrementCount();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Ques11 safe = new Ques11();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                safe.job1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                safe.job2();
            }});
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(safe.count);
    }

}
