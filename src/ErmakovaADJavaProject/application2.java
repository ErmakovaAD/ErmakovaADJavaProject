package ErmakovaADJavaProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class application2 {
    public static void main(String[] args) {
        int[] numberArray1;
        int[] numberArray2;
        int arrayLength;
        int numToFind;
        int iterationsCount = 0;
        System.out.println("Введите размер массивов");
        Scanner scan = new Scanner(System.in);
        arrayLength = scan.nextInt();
        numberArray1 = new int[arrayLength];
        numberArray2 = new int[arrayLength];

        Random random = new Random();
        for(int i = 0; i < numberArray1.length; i++) {

            numberArray1[i] = random.nextInt(-100, 100);
            numberArray2[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));
        boolean found = false;
        for (int i = 0; i < numberArray1.length; i++) {
            for (int j = 0; j < numberArray2.length; j++) {
                if (numberArray1[i] == numberArray2[j]) {
                System.out.print(numberArray1[i] + " ");
                found = true;
                break;
                }
            }
        }
        if (!found) {

            System.out.println("Нет одинаковых значений.");
        }
    }
}

