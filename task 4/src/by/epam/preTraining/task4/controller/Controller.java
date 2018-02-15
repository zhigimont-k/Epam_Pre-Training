package by.epam.preTraining.task4.controller;

import by.epam.preTraining.task4.model.*;
import by.epam.preTraining.task4.view.View;

public class Controller {

    public static void main(String[] args) {
        runTask1(8911);
        runTask2(2, 10);
        runTask3(11234, 11);
        runTask4(9);
        runTask5(3, "A", "B", "C");
    }

    private static void runTask1(int n) {
        View.print("-------Task 4.1");
        View.print("Input: "+n);
        View.print("Recursive digit sum: " + DigitSum.calculateDigitSumRecursive(n));
        View.print("Non-recursive digit sum: " + DigitSum.calculateDigitSum(n));
    }

    private static void runTask2(double x, int n) {
        View.print("-------Task 4.2");
        View.print("Input: "+x+", "+n);
        View.print("Recursive pow: " + Power.powRecursive(x, n));
        View.print("Non-recursive pow: " + Power.pow(x, n));
    }

    private static void runTask3(int N, int S) {
        View.print("-------Task 4.3");
        View.print("Input: "+N+", "+S);
        View.print("Recursive equals: " + DigitSumEquation.equalsRecursive(N, S));
        View.print("Non-recursive equals: " + DigitSumEquation.equals(N, S));
    }

    private static void runTask4(int n) {
        View.print("-------Task 4.4");
        View.print("Input: "+n);
        View.print("Recursive fibonacci: " + Fibonacci.calculateFibonacciRecursive(n));
        View.print("Non-recursive fibonacci: " + Fibonacci.calculateFibonacci(n));
    }

    private static void runTask5(int n, String from, String to, String middle) {
        View.print("-------Task 4.5");
        View.print("Input: "+n);
        View.print("Recursive Hanoi towers: " + HanoiTower.calculateHanoiRecursive(n, from, to, middle));
        View.print("Non-recursive Hanoi towers: " + HanoiTower.calculateHanoi(n, from, to, middle));
    }
}
