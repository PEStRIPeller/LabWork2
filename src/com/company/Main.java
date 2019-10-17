package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int n = -1;
        final int weight = 30;
        Scanner in = new Scanner(System.in);
        LuggageInfo info = new LuggageInfo("Nikita", 1, 11, 1, 15);
        LuggageBranch array = new LuggageBranch(1);
        array.setLuggageAt(0, info);
        array.resize(5);
        array.setLuggageAt(1, new LuggageInfo("Vitalik", 2, 22, 2, 25));
        array.setLuggageAt(2, new LuggageInfo("Valera", 3, 33, 3, 35));
        array.setLuggageAt(3, new LuggageInfo("Oleg", 4, 44, 4, 45));
        array.setLuggageAt(4, new LuggageInfo("Jora", 5, 55, 5, 65));

        System.out.println(array);

        System.out.println("Luggage which weight more than 30kg");
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i].getLuggageWeight() > weight)
                System.out.println(array.getArray()[i]);
        }
        System.out.println("Overall luggage weight =" + array.getWeightSum());
        boolean next = true;
        do {
            try {
                System.out.println("Please enter a luggage Check Number: ");
                String number = in.nextLine();
                n = Integer.parseInt(number);
                if (n > 0)
                    next = false;
            } catch (InputMismatchException exc) {
                System.out.println(exc.getLocalizedMessage());
            } catch (Exception exc) {
                System.out.println(exc.getLocalizedMessage());
            }
        } while (next);

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i].getLuggageCheckNumber() == n) {
                System.out.println("Flight number : " + array.getArray()[i].getFlightNumber());
            }
        }

        System.out.println("\n----------------- Before removing ---------------------");
        System.out.println(array);
        System.out.println(array.remove(4));
        System.out.println("\n------------------After removing --------------------");
        System.out.println(array);
    }
}
