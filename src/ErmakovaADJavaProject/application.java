package ErmakovaADJavaProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class application {
    public static void main(String[] args){
        int[] numberArray;
        int arrayLength;
        int numToFind;
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        arrayLength = scan.nextInt();
        numberArray = new int[arrayLength];
        Random random = new Random();
        for(int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(-100, 100);        }
        System.out.println(Arrays.toString(numberArray));
        Arrays.sort(numberArray);
        Mymethod(numberArray, scan);
    }

    private static void Mymethod(int[] numberArray, Scanner scan) {
        int numToFind;
        System.out.println(Arrays.toString(numberArray));
        System.out.println("Введите число для поиска:");
        numToFind = scan.nextInt();
        int low = 0;
        int high = numberArray.length - 1;
        int middle;
        int iteration = 0;
        while(low <= high) {            iteration++;
            middle = (low + high) / 2;
            int num = numberArray[middle];
            System.out.println("Итерация: "+iteration );
            if(num == numToFind){
                System.out.println("Значение найдено под индексом "+middle);
                return;
            }
            else if(num > numToFind){
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
        System.out.println("Искомого значения в массиве нет");
    }
}

