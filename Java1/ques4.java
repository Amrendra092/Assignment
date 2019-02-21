import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a string : ");
        String string=sc.nextLine();
        string=string.replaceAll(" ","");

        int Upper=0, Lower=0, Digit=0, Special=0;
        int total=string.length();
        for(int i=0; i<string.length(); i++)
        {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                Upper++;
            else if (ch >= 'a' && ch <= 'z')
                Lower++;
            else if (ch >= '0' && ch <= '9')
                Digit++;
            else
                Special++;
        }
        System.out.println("Lower case letters : " + Lower);
        System.out.println("Upper case letters : " + Upper);
        System.out.println("Number : " + Digit);
        System.out.println("Special characters : " + Special);
        System.out.println("total length of string is: "+total);
        System.out.println("Percentage of upper case letters: "+(float)(Upper*100)/total);
        System.out.println("Percentage of lower case letters: "+(float)(Lower*100)/total);
        System.out.println("Percentage of digit : "+(float)(Digit*100)/total);
        System.out.println("Percentage of special characters: "+(float)(Special*100)/total);

    }
}
