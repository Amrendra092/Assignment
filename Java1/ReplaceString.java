import java.util.Scanner;
public class ReplaceString {
    public static void main(String[] args)
    {

        Scanner main_string = new Scanner(System.in);
        System.out.print("Enter main string : ");
        String a=main_string.nextLine();

        Scanner sub_string = new Scanner(System.in);
        System.out.print("Enter substring to be replaced: ");
        String b=sub_string.nextLine();

        Scanner new_string = new Scanner(System.in);
        System.out.print("Enter string which will replace substring: ");
        String c=new_string.nextLine();

        String str=a.replace(b,c);
        System.out.println(str);

    }
}
