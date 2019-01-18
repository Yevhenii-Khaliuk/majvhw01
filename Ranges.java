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

        StringBuilder result = new StringBuilder();
        int minRange = array[0];
        int maxRange;
        for (int i = 1; i < arrayLength; i++) {
            if (array[i] - array[i - 1] > 1) {
                maxRange = array[i - 1];
                if (maxRange == minRange) {
                    result.append("[").append(minRange).append("]");
                } else {
                    result.append("[").append(minRange).append(" ").append(maxRange).append("]");
                }
                minRange = array[i];
            }            
        }
        if (array[arrayLength - 1] - array[arrayLength - 2] == 1) {
            result.append("[").append(minRange).append(" ").append(array[arrayLength - 1]).append("]");
        } else {
            result.append("[").append(array[arrayLength - 1]).append("]");
        }

        System.out.println("Result:");
        System.out.println(result.toString());

        scanner.close();
    }
}