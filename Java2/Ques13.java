public class Ques13 extends Exception {

    //constructor
    public Ques13(String s) {
        super(s);
    }
}
class main{
    public static void main(String[] args) {
        try {
            //user defined exception
            throw new Ques13("exception in class main");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
