import java.util.Scanner;

public class RestoreArray {
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

        array = restoreArray(array);

        System.out.print("Result: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }

    public static int[] restoreArray(int[] array) {
        int[] restoredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                restoredArray[i] = array[i];
            } else {
                restoredArray[i] = (array[i - 1] + array [i + 1]) / 2;
            }
        }
        return restoredArray;
    }
}