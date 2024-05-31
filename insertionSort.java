public class InsertionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] numbers = {85, 12, 59, 45, 72, 51};
        performInsertionSort(numbers);
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

    public static void performInsertionSort(int[] numbers) {
        int length = numbers.length;
        for (int index = 1; index < length; ++index) {
            int currentValue = numbers[index];
            int previousIndex = index - 1;

            while (previousIndex >= 0 && numbers[previousIndex] > currentValue) {
                numbers[previousIndex + 1] = numbers[previousIndex];
                previousIndex = previousIndex - 1;
            }
            numbers[previousIndex + 1] = currentValue;
        }
    }

}
