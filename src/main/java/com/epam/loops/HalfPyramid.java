package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength * 2; j++) {
                if ((j >= (cathetusLength - 1) - i) && (j <= (cathetusLength - 1) + i)) {
                    if (cathetusLength - j > 0) {
                        System.out.print("*");
                    }
                }else {
                    if (j < cathetusLength + i) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
