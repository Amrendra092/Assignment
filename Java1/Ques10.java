public class Ques10 {
    public static void main(String[] args) {
        double double1=100.9d,double2=101.65d;
        String string1="Amren",string2="dra",string3="Singh";
        int int1=16,int2=12;
        float float1=96.4f,float2=93.5f;
        Ques10 object=new Ques10();
        System.out.println("addition of two int number:"+object.add(int1,int2));
        System.out.println("addition of two double number:"+object.add(double1,double2));
        System.out.println("multiplication of two integer numbers:"+object.multiply(int1,int2));
        System.out.println("multiplication of two float numbers:"+object.multiply(float1,float2));
        System.out.println("concatenation of two string :"+ object.concatenate(string1,string2));

        System.out.println("concatenation of two string :"+ object.concatenate(string1,string2,string3));
    }

    private String concatenate(String string1, String string2, String string3) {

        return string1.concat(string2).concat(string3);

    }

    private String concatenate(String string1, String string2) {
        return string1.concat(string2);
    }

    private float multiply(float float1, float float2) {
        return (float1*float2);
    }
    private int multiply(int int1, int int2) {
        return (int1*int2);

    }

    private double add(double double1, double double2) {
        return (double1+double2);

    }
    private int add(int int1, int int2) {
        return (int1+int2);

    }

}
