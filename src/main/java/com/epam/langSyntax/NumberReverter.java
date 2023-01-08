package com.epam.langSyntax;

public class NumberReverter {

    public static void main(String[] args) {
        NumberReverter nr = new NumberReverter();
        nr.revert(536);

    }
    public void revert(int number) {
        int reversedNumber = 0;
        while (number != 0 ){
            reversedNumber = reversedNumber*10 + number%10;
            number = number/10;
        }
        System.out.println(reversedNumber);
    }

}
