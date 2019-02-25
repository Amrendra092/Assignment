import java.util.Scanner;

   public class Ques1 implements Runnable{
        @Override
        public void run()
        {
            System.out.println("New thread using runnable");
        }


        public static void main(String[] args)
        {
           Thread t1 = new Thread(new Ques1());
                    t1.start();
        }
    }

