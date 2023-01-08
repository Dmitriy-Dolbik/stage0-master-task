package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int sum = numberToPrint;
        for (int i = 0; i < power-1; i++) {
            sum *= numberToPrint;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
