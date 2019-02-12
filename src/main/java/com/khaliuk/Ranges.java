package com.khaliuk;

import java.util.Scanner;

public class Ranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length:");
        int arrayLength = scanner.nextInt();
        if (arrayLength <= 0) {
            System.out.println("Array length has to be greater than 0.");
            scanner.close();
            return;
        }
        System.out.println("Enter array values:");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Result:");
        System.out.println(arrayRanges(array));

        scanner.close();
    }

    public static String arrayRanges(int[] array) {
        StringBuilder result = new StringBuilder();
        int minRange = array[0];
        int maxRange;
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] > 1) {
                maxRange = array[i - 1];
                makeRanges(result, minRange, maxRange);
                minRange = array[i];
            }
        }
        makeRanges(result, minRange, array[array.length - 1]);
        return result.toString();
    }

    private static void makeRanges(StringBuilder sb, int minRange, int maxRange) {
        sb.append("[").append(minRange);
        if (maxRange != minRange) {
            sb.append(" ").append(maxRange);
        }
        sb.append("]");
    }
}