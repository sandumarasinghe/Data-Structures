public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        selectionSort(array);

        System.out.println("\nSorted array in ascending order:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
