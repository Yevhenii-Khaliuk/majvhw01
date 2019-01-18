import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length and k:");
        int arrayLength = scanner.nextInt();
        int k = scanner.nextInt();
        if (arrayLength <= 0 || k <= 0) {
            System.out.println("Array length and k has to be greater than 0.");
            scanner.close();
            return;
        }
        System.out.println("Enter array values:");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        
        // If k greater than or equal to array length, result is done.
        if (k >= arrayLength) {      
            System.out.print("Result: ");
            for (int i = 0; i < arrayLength; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            // Here comes main logic.
            int[] result = new int[arrayLength];
            int remainingElems = arrayLength - k;
            for (int i = 0; i < remainingElems; i++) {
                result[i] = array[i + k];
            }
            for (int i = 0; i < k; i++) {
                result[i + remainingElems] = array[i];
            }
            System.out.print("Result: ");
            for (int i = 0; i < arrayLength; i++) {
                System.out.print(result[i] + " ");
            }
        }

        scanner.close();
    }
}