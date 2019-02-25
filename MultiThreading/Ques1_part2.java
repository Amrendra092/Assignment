public class Ques1_part2 extends Thread {
    public void run()
    {
        System.out.println("New thread starts");
    }

    public static void main(String[] args) {
        Ques1_part2 thread = new Ques1_part2();
        thread.start();
    }
}
