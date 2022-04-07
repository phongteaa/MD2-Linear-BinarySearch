package binarysearch;

public class BinarySearchWithRecursion {
    public int binarySearch(int[] array, int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] > value) {
                return binarySearch(array, low, mid - 1, value);
            }
            return binarySearch(array, mid + 1, high, value);
        }
        return -1;
    }
}
