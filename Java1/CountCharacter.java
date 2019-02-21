import java.util.Scanner;
public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter string : ");
        String string1 = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter character : ");
        String word = sc2.next();

        //System.out.println(string1);
       // System.out.println(word);

        //System.out.println("Length Of String:" + string1.length());
        //System.out.println("Length Of String Without character:" + string1.replace(word, "").length());
        int charcount = string1.length() - string1.replaceAll(word, "").length();
        System.out.println("Occurrence Of given Char In String: " + charcount);
    }
}