package com.epam.loops;

public class Pyramid
{

    public void printPyramid(int cathetusLength)
    {
        for (int i = 0; i < cathetusLength; i++)
        {
            for (int j = 0; j < cathetusLength * 2; j++)
            {
                if ((j >= (cathetusLength - 1) - i) && (j <= (cathetusLength - 1) + i))
                {
                    if (cathetusLength - j > 0)
                    {
                        System.out.print(cathetusLength - j);
                    }
                    else
                    {
                        System.out.print(j - cathetusLength + 2);
                    }
                }
                else
                {
                    if (j < cathetusLength + i)
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        new Pyramid().printPyramid(7);
    }

}
