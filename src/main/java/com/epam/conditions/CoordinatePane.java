package com.epam.conditions;

public class CoordinatePane {

    public static void main(String[] args) {
        CoordinatePane coordinatePane = new CoordinatePane();
        coordinatePane.printQuadrant(-32,0);
    }
    public void printQuadrant(int x, int y) {
        if (x >0 && y > 0){
            System.out.println("first");
        } else if (x > 0 && y < 0){
            System.out.println("fourth");
        } else if (x < 0 && y < 0){
            System.out.println("third");
        } else if (x < 0 && y > 0){
            System.out.println("second");
        } else {
            System.out.println("zero");
        }
    }

}

