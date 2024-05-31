
import java.util.Arrays;

public class EnhancedInsertionSort {

    public static void main(String[] args) {

        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(data));
        optimizedInsertionSort(data);
        System.out.println("Sorted array: " + Arrays.toString(data));

    }

    static void optimizedInsertionSort(int[] data) {
        int length = data.length;
        for (int index = 1; index < length; ++index) {
            int currentElement = data[index];
            int position = index - 1;

            while (position >= 0 && data[position] > currentElement) {
                data[position + 1] = data[position];
                position = position - 1;
            }
            data[position + 1] = currentElement;
        }
    }

}