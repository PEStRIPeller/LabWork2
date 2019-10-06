package com.company;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int n;
        final int weight=30;
        Scanner in = new Scanner(System.in);
        luggageInfo info=new luggageInfo("Nikita",1,11,1,15);
	    luggageBranch array=new luggageBranch(1);
        array.setLuggageAt(0,info);
        array.resize(5);
        array.setLuggageAt(1,new luggageInfo("Vitalik",2,22,2,25));
        array.setLuggageAt(2,new luggageInfo("Valera",3,33,3,35));
        array.setLuggageAt(3,new luggageInfo("Oleg",4,44,4,45));
        array.setLuggageAt(4,new luggageInfo("Jora",5,55,5,65));
        for (int i = 0; i <array.getArray().length ; i++) {
            System.out.println(array.getArray()[i]);
        }
        System.out.println("Luggage which weight more than 30kg");
        for (int i = 0; i <array.getArray().length ; i++) {
           if (array.getArray()[i].getLuggageWeight()>weight)
            System.out.println(array.getArray()[i]);
        }
        System.out.println("Overall luggage weight ="+ array.getWeightSum());
        do {
            System.out.println("Please enter a luggage Check Number : ");
            while (!in.hasNextInt()) {
                System.out.println("That not a number!");
                in.next();
            }
            n=(in.nextInt());
        } while (n <= 0 );
        for (int i = 0; i <array.getArray().length ; i++) {
            if (array.getArray()[i].getLuggageCheckNumber() == n) {
                System.out.println("Flight number : " + array.getArray()[i].getFlightNumber());
            }
        }
    }
}
