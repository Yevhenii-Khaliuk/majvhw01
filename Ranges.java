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
                checkMiddleElems(result, minRange, maxRange);
                minRange = array[i];
            }
        }
        checkLastElem(result, array, minRange);
        return result.toString();
    }

    private static void checkMiddleElems(StringBuilder sb, int minRange, int maxRange) {
        if (maxRange == minRange) {
            sb.append("[").append(minRange).append("]");
        } else {
            sb.append("[").append(minRange).append(" ").append(maxRange).append("]");
        }
    }

    private  static  void  checkLastElem(StringBuilder sb, int[] arr, int minRange) {
        if (arr[arr.length - 1] - arr[arr.length - 2] == 1) {
            sb.append("[").append(minRange).append(" ").append(arr[arr.length - 1]).append("]");
        } else {
            sb.append("[").append(arr[arr.length - 1]).append("]");
        }
    }
}