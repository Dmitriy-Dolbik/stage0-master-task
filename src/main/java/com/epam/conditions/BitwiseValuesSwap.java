package com.epam.conditions;

public class BitwiseValuesSwap {

    public static void main(String[] args) {
        BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(34,3);
    }
    public void swap(int first, int second) {
        first = first ^ second;
        second = second ^ first;
        first = first ^ second;
        System.out.println(first);
        System.out.println(second);
    }

}
