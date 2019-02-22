public class Ques3 {
    public static void main(String[] args) {
        try {
            Class.forName("anyclass");
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
