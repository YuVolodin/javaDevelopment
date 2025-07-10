package JavaDevelopment.Lesson04v2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1, 6, 1, 9, 0, 3};
       Lab04.sixthTask(array);
       Lab04.changeArrayElements(array);
       Lab04.firstUnique(array);
        Random rand = new Random();
       int [] arrayToSort = new int[10];
       for (int i = 0; i< arrayToSort.length; i++){
           arrayToSort[i] = rand.nextInt(100);
       }
       System.out.println("Исходный массив: " + Arrays.toString(arrayToSort));
       System.out.println("Отсортированный массив: " + Arrays.toString(Lab04.arraySort(arrayToSort)));
        }
    }

