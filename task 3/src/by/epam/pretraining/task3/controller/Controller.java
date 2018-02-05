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
        View.printTaskTitle(1);
        int tries = 1000;
        int heads = Coin.getHeads(tries);
        int tails = tries - heads;
        View.printMessage("Number of heads: " + heads);
        View.printMessage("Number of tails: " + tails);
    }

    public static void printTask32() {
        View.printTaskTitle(2);
        int a = 16;
        int b = 20;
        int c = 123454321;
        int d = 59;
        View.printMessage("The biggest digit of " + c + " is " + MathWorker.getBiggestDigit(c));
        View.printMessage(c + " is palindrome: " + MathWorker.isPalindrome(c));
        View.printMessage(d + " is a prime number: " + MathWorker.isPrimeNumber(d));
        View.printMessage(b + "'s prime dividers are: " + MathWorker.getNumberPrimeDivisors(b));
        View.printMessage("LCM of " + a + " and " + b + " is " + MathWorker.getLCM(a, b));
        View.printMessage("GCD of " + a + " and " + b + " is " + MathWorker.getGCD(a, b));
        View.printMessage(c + ": " + MathWorker.getDifferentDigitsNumber(c) + " different digit(s)");
    }

    public static void printTask33() {
        int n = 28;
        View.printTaskTitle(3);
        View.printMessage(n + " is perfect: " + PerfectNumber.isPerfectNumber(n));
    }


}
