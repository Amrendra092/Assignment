public class Ques3{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Runnable() {
            @Override
            public void run()
            {
                try{
                    Thread.sleep(1000);
                    System.out.println("1st Thread");
                }
            }
        }

    }
}