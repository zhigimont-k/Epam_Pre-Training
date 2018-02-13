package by.epam.pretraining.task3.controller;

import by.epam.pretraining.task3.view.View;
import by.epam.pretraining.task3.model.*;

public class Controller {
    public static void main(String[] args) {
        printTask31();
        printTask32();
        printTask33();
    }

    public static void printTask31() {
        View.print("--------Task 3.1");
        int tries = 1000;
        int heads = Coin.getHeads(tries);
        int tails = tries - heads;
        View.print("Number of heads: " + heads);
        View.print("Number of tails: " + tails);
    }

    public static void printTask32() {
        View.print("--------Task 3.2");
        int a = 16;
        int b = 20;
        int c = 123454321;
        int d = 59;
        View.print("The biggest digit of " + c + " is " + MathWorker.getBiggestDigit(c));
        View.print(c + " is palindrome: " + MathWorker.isPalindrome(c));
        View.print(d + " is a prime number: " + MathWorker.isPrimeNumber(d));
        View.print(b + "'s prime dividers are: " + MathWorker.getNumberPrimeDivisors(b));
        View.print("LCM of " + a + " and " + b + " is " + MathWorker.getLCM(a, b));
        View.print("GCD of " + a + " and " + b + " is " + MathWorker.getGCD(a, b));
        View.print(c + ": " + MathWorker.getDifferentDigitsNumber(c) + " different digit(s)");
    }

    public static void printTask33() {
        View.print("--------Task 3.3");
        int a = 6;
        int b = 7;
        int c = 28;
        View.print(a + " is perfect: " + PerfectNumber.isPerfectNumber(a));
        View.print(b + " is perfect: " + PerfectNumber.isPerfectNumber(b));
        View.print(c + " is perfect: " + PerfectNumber.isPerfectNumber(c));
    }


}
