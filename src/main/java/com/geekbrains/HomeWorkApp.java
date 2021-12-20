package com.geekbrains;

import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {

        // Задача №1
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(binaryArray) + " после преобразования = ");
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0)
                binaryArray[i] = 1;
            else
                binaryArray[i] = 0;
        }
        System.out.println(Arrays.toString(binaryArray));
        System.out.println();


        // Задача №2
        int[] hundredArray = new int[100];
        for (int i = 0; i < hundredArray.length; i++) {
            hundredArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(hundredArray));
        System.out.println();


        // Задача №3
        int[] doublingArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(doublingArray) + " после преобразования = ");
        for (int i = 0; i < doublingArray.length; i++) {
            if (doublingArray[i] < 6)
                doublingArray[i] = doublingArray[i] * 2;
        }
        System.out.println(Arrays.toString(doublingArray));
        System.out.println();


        //Задача №4
        int[][] squareArray = new int[6][6];
        for (int i = 0; i < squareArray.length; i++)
            for (int j = 0; j < squareArray.length; j++) {
                if (i == j || j == squareArray.length - 1 - i)
                    squareArray[i][j] = 1;
            }
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[0].length; j++) {
                System.out.print(squareArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();


        //Задача №5
        System.out.println(Arrays.toString(giveArray(4, 5)));
        System.out.println();


        //Задача №6
        int[] maxMinArray = new int[20];
        for (int i = 0; i < maxMinArray.length; i++)
            maxMinArray[i] = (int) (Math.random() * 100); // Заполнение массива рандомными значениями от 0 до 99.
        int min = maxMinArray[0];
        int max = maxMinArray[0];
        for (int i = 0; i < maxMinArray.length; i++) {
            if (min > maxMinArray[i])
                min = maxMinArray[i];
            if (max < maxMinArray[i])
                max = maxMinArray[i];
        }
        System.out.println(Arrays.toString(maxMinArray) + " Макс. значение = " + max + "; Мин. значение = " + min);
        System.out.println();


        //Задача №7
        int[] array = {2,2,2,1,2,2,10,1};
        System.out.println("В массиве " + Arrays.toString(array) +
                " есть место, где левая и правые суммы равны? - " + equalLeftAndRightSum(array));
        System.out.println();


        //Задача №8



    }

    //Задача №5
    public static int[] giveArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++)
            array[i] = initialValue;
        return array;
    }


    //Задача №7
    public static boolean equalLeftAndRightSum(int[] array) {
        int left = 0, right = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            right = 0;
            for (int j = i + 1; j < array.length; j++) {
                right += array[j];
            }
            if (left == right)
               return true;
        }
        return false;
    }


    //Задача №8
    public static void shiftArray(int[] array, int n){

    }

}
