import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String a=input.nextLine();
        String str=a.toLowerCase();

        str = str.replaceAll("[$&+,:;=?@#|'<>.^*()%!-]", " ");
        String[] words = str.split(" ");

        int count_repeating_word = 1;

        for(int i=0; i<words.length; i++)
        {
            for(int j=i+1; j<words.length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    count_repeating_word=count_repeating_word+1;
                    words[j]="0";
                }
            }
            if(words[i]!="0" )
                System.out.println(words[i]+"--"+count_repeating_word);
            count_repeating_word=1;
        }
    }
}
