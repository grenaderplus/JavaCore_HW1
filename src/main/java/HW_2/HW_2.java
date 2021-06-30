package HW_2;

import java.util.Arrays;
import java.util.Random;

public class HW_2 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[8];
        arr1[0] = 0;
        for (int i = 0; i < (arr1.length - 1); i++) {
            arr1[i + 1] = arr1[i] + 3;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr2));

        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int k = 0; k < arr3[i].length; k++) {
                if (i == k || (i + k) == (arr3.length - 1)) {
                    arr3[i][k] = 1;
                } else {
                    arr3[i][k] = 0;
                }
            }
        }
        printArr3(arr3);

        int[] arr4 = new int[20];
        for (int i = 0; i < arr4.length; i++) {
            Random random = new Random();
            arr4[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr4));
        int max = arr4[0];
        int min = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (max < arr4[i]) {
                max = arr4[i];
            } else if (min > arr4[i]) {
                min = arr4[i];
            } else {
                max = max;
                min = min;
            }
        }
        System.out.println("Максимальный элемент - " + max);
        System.out.println("Минимальный элемент - " + min);

    }

    static void printArr3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2s", arr[i][j]);
            }
            System.out.println();
        }
    }
}
