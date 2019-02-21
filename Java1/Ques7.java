import java.util.Scanner;
public class Ques7 {
    static String firstname="Amrendra";
    static String lastname="Singh";
    static int age=22;

    //static block
static {
        System.out.println("output from static block");
        System.out.println("firstname:"+firstname+"\nlastname:"+lastname+"\nage:"+age);
        }


        //static method
static void show_info(){
        System.out.println("output from static method");
        System.out.println("firstname:"+firstname+"\nlastname:"+lastname+"\nage:"+age);
        }

public static void main(String[] args) {
        Ques7.show_info();


        //static variables which are called by using class name
    System.out.println("output from static variable");
    System.out.println("firstname:"+Ques7.firstname+"\nlastname:"+Ques7.lastname+"\nage:"+Ques7.age);
}
}
