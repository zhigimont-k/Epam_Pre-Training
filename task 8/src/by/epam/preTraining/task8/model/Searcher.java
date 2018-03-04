package by.epam.preTraining.task8.model;

public class Searcher<T extends Comparable<T>> {

    //worst case complexity: O(n)
    public int linearSearch(T[] arr, T key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    //complexity: O(logn)
    public int binarySearchIterative(T[] arr, T key) {
        return binarySearchIter(arr, key, 0, arr.length - 1);
    }

    private int binarySearchIter(T[] arr, T key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = Math.round((low + high) / 2);
            if (arr[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (arr[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else if (arr[mid].compareTo(key) == 0) {
                index = mid;
                break;
            }
        }
        return index;
    }


    public int binarySearchRecursive(T[] arr, T key) {
        return binarySearchRec(arr, key, 0, arr.length - 1);
    }

    private int binarySearchRec(T[] arr, T key, int low, int high) {
        int middle = Math.round((low + high) / 2);

        if (high < low) {
            return -1;
        }
        if (key.compareTo(arr[middle]) == 0) {
            return middle;
        } else if (key.compareTo(arr[middle]) < 0) {
            return binarySearchRec(arr, key, low, middle - 1);
        } else {
            return binarySearchRec(arr, key, middle + 1, high);
        }
    }
}
