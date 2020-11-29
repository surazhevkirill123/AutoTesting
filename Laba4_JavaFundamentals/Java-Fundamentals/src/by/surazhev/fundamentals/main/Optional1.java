package by.surazhev.fundamentals.main;

import java.util.Arrays;
import java.util.Scanner;


public class Optional1 {
    public static int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static void main(String[] args) {
        System.out.println("Введите число элементов в массиве:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }

        //Task1
        //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        int countsOfDigits=0;
        int longestNumber=0;
        int shortestNumber=0;
        int longestNumberCount=0;
        int shortestNumberCount=0;

        for (int i=0;i<n;i++){
            if (getCountsOfDigits(array[i])>countsOfDigits)
            {
                countsOfDigits=getCountsOfDigits(array[i]);
                longestNumber=array[i];
                longestNumberCount=getCountsOfDigits(array[i]);
            }
        }

        for (int i=0;i<n;i++){
            if (getCountsOfDigits(array[i])<countsOfDigits)
            {
                countsOfDigits=getCountsOfDigits(array[i]);
                shortestNumber=array[i];
                shortestNumberCount=getCountsOfDigits(array[i]);
            }
        }

        System.out.println("Самое короткое число: " + shortestNumber + " \tЕго длина: " + shortestNumberCount);
        System.out.println("Самое длинное число: " + longestNumber + " \tЕго длина: " + longestNumberCount);

        //Task2
        //Вывести числа в порядке возрастания (убывания) значений их длины.
        int[] sortedArray=new int[n];
        for (int i=0;i<n;i++){
            sortedArray[i]=array[i];
        }
        Arrays.sort(sortedArray);
        String sortedArrayString=" ";
        for (int i=0;i<n;i++) {
            sortedArrayString+=array[i];
            sortedArrayString+=" ";
        }
        System.out.println("По возрастанию: " + sortedArrayString);
        StringBuffer strBuffs= new StringBuffer(sortedArrayString);
        strBuffs.reverse();
        System.out.println("По убыванию: " + strBuffs);

    }
}
