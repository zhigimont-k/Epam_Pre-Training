package by.epam.pretraining.task3.controller;

import by.epam.pretraining.task3.view.View;
import by.epam.pretraining.task3.model.*;

/**
 * Created by karina on 03-02-2018.
 */
public class Controller {
    public static void main(String[] args) {
        printTask31();
        printTask32();
        printTask33();
    }

    public static void printTask31() {
        View.printTaskTitle(1);
        int heads = Task31.getHeads();
        int tails = Task31.getTails(heads);
        View.printMessage("Number of heads: " + heads);
        View.printMessage("Number of tails: " + tails);
    }

    public static void printTask32() {
        View.printTaskTitle(2);
        int a = 16;
        int b = 20;
        int c = 123454321;
        int d = 59;
        View.printMessage("The biggest digit of " + c + " is " + Task32.getBiggestDigit(c));
        View.printMessage(c + " is palindrome: " + Task32.isPalindrome(c));
        View.printMessage(d + " is a prime number: " + Task32.isPrimeNumber(d));
        View.printMessage(b + "'s prime dividers are: " + Task32.getNumberPrimeDivisors(b));
        View.printMessage("LCM of "+a+" and "+b+" is "+Task32.getLCM(a, b));
        View.printMessage("GCD of "+a+" and "+b+" is "+Task32.getGCD(a, b));
        View.printMessage(c+": "+Task32.getDifferentDigitsNumber(c)+" different digit(s)");
    }

    public static void printTask33() {
        int n = 28;
        View.printTaskTitle(3);
        View.printMessage(n+" is perfect: "+Task33.isPerfectNumber(n));
    }


}
