import  java.util.Scanner;

public class Ques9{
    enum houses
    {
        HOUSE1(10000),HOUSE2(11000);
        private int price;
        houses(int p)
        {
            this.price=p;
        }
        int getPrice()
        {
            return this.price;
        }
    }
    public static void main(String[] args) {

        System.out.println("prices are:");
        for(houses h: houses.values()){
            System.out.println("house name:"+h+"\tcost:"+h.getPrice());

        }

    }
}

