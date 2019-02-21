//main class to get details of every class
public class Ques11 {

    public static void main(String[] args) {
        Ques11 bank=new Ques11();
        SBI_bank sbi=new SBI_bank();
        ICICI_bank icici=new ICICI_bank();
        BOI_bank boi=new BOI_bank();
        sbi.getDetails();
        icici.getDetails();
        boi.getDetails();
    }

    private void getDetails() {
        System.out.println("\t\tbank name: default ");
        System.out.println("rate ");
        System.out.println("ifsc");
    }

}
