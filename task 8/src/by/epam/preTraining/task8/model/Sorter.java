package by.epam.preTraining.task8.model;

import java.lang.reflect.Array;

public class Sorter<T extends Comparable<T>> {

    //worst case complexity: O(n^2)
    //best case complexity: O(n)
    public T[] bubbleSort(T[] src) {
        T[] arr = (T[]) Array.newInstance(src.getClass().getComponentType(), src.length);
        System.arraycopy(src, 0, arr, 0, arr.length);
        int i = 0;
        int size = arr.length;
        boolean flag = true;
        while (i < size - 1 && flag) {
            flag = false;
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }
        return arr;
    }

    //worst case complexity: O(n^2)
    public T[] insertionSort(T[] src) {
        T[] arr = (T[]) Array.newInstance(src.getClass().getComponentType(), src.length);
        System.arraycopy(src, 0, arr, 0, arr.length);
        T temp;
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    //complexity: O(n^2)
    public T[] selectionSort(T[] src) {
        T[] arr = (T[]) Array.newInstance(src.getClass().getComponentType(), src.length);
        System.arraycopy(src, 0, arr, 0, arr.length);
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            T smallerValue = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerValue;
        }
        return arr;
    }

    //worst case complexity: O(n*logn)
    public T[] mergeSort(T[] src) {
        T[] arr = (T[]) Array.newInstance(src.getClass().getComponentType(), src.length);
        System.arraycopy(src, 0, arr, 0, arr.length);
        sortMerge(arr, 0, arr.length - 1);
        return arr;
    }

    private void merge(T arr[], int l, int m, int r) {
        // subarrays sizes
        int size1 = m - l + 1;
        int size2 = r - m;

        T temp1[] = (T[]) Array.newInstance(arr.getClass().getComponentType(), size1);
        T temp2[] = (T[]) Array.newInstance(arr.getClass().getComponentType(), size2);

        for (int i = 0; i < size1; ++i)
            temp1[i] = arr[l + i];
        for (int j = 0; j < size2; ++j)
            temp2[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        // initial index of merged subarray array
        int k = l;
        while (i < size1 && j < size2) {
            if (temp1[i].compareTo(temp2[j]) <= 0) {
                arr[k] = temp1[i];
                i++;
            } else {
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            arr[k] = temp1[i];
            i++;
            k++;
        }
        while (j < size2) {
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }

    private void sortMerge(T arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sortMerge(arr, l, m);
            sortMerge(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    //worst case complexity: O(n^2)
    public T[] quickSort(T[] src) {
        T[] arr = (T[]) Array.newInstance(src.getClass().getComponentType(), src.length);
        System.arraycopy(src, 0, arr, 0, arr.length);
        sortQuick(arr, 0, arr.length - 1);
        return arr;
    }

    private int partition(T arr[], int low, int high) {
        T pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            //if (arr[j] <= pivot) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    private void sortQuick(T arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            sortQuick(arr, low, partitionIndex - 1);
            sortQuick(arr, partitionIndex + 1, high);
        }
    }
}
