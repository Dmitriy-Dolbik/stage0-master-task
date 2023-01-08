package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        Scanner scanner = new Scanner(System.in);

        int numberTableToPrint = scanner.nextInt();

        multiplicationTable.printTable(numberTableToPrint);
    }

    public void printTable(int numberTableToPrint)
    {
        for (int j = 1; j <= 10; j++)
        {
            System.out.println(j + " x " + numberTableToPrint + " = " + (j * numberTableToPrint));
        }
    }
}
