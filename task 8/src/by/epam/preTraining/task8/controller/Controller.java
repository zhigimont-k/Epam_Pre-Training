package by.epam.preTraining.task8.controller;

import by.epam.preTraining.task8.model.*;
import by.epam.preTraining.task8.view.View;

import java.util.Arrays;
import java.util.Random;

public class Controller {
    public static void main(String[] args) {
        test();
    }

    private static void test(){
        Random rand = new Random();
        Integer arr[] = new Integer[rand.nextInt(8) + 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(99) + 1;
        }
        int key = arr[rand.nextInt(arr.length - 1)];
        Searcher search = new Searcher();
        Sorter sort = new Sorter();
        View.print("Initial array: " + Arrays.toString(arr));
        View.print("----------SORTING:");
        View.print("Bubble sorted array: " + Arrays.toString(sort.bubbleSort(arr)));
        View.print("Insertion sorted array: " + Arrays.toString(sort.insertionSort(arr)));
        View.print("Selection sorted array: " + Arrays.toString(sort.selectionSort(arr)));
        View.print("Merge sorted array: " + Arrays.toString(sort.mergeSort(arr)));
        View.print("Quicksorted array: " + Arrays.toString(sort.quickSort(arr)));
        View.print("----------SEARCHING:");
        View.print("Key: " + key);
        View.print("Linear search: " + search.linearSearch(arr, key));
        View.print("Sorted array: " + Arrays.toString(sort.quickSort(arr)));
        View.print("Binary iterative search: " + search.binarySearchIterative(sort.quickSort(arr), key));
        View.print("Binary recursive search: " + search.binarySearchRecursive(sort.quickSort(arr), key));
    }
}
