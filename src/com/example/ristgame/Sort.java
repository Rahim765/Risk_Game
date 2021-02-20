package com.example.ristgame;

import java.util.Random;

public class Sort {
    public int[] sort(int x )
    {
        int[] grade;
        grade= new int[x];
        int temp;
        Random random = new Random();
        for (int i = 0; i <x ; i++) {
            grade[i]=random.nextInt(6)+1;
        }
        for (int i = x-2; i >=0; i--)
        {
            for (int j = 0; j <=i; j++)
            {
                if (grade[j] < grade[j+1])
                {
                    temp =  grade[j];
                    grade[j]  =  grade[j+1];
                    grade[j+1] = temp;
                }

            }

        }
        return grade;
    }
}
