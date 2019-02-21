import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,0,3,4,5};
        int result=array[0];
        for(int i=1;i<array.length;i++)
        {
            result=result ^ array[i];
        }
        System.out.println("Element that does not appear twice is :" +result);
    }
}
