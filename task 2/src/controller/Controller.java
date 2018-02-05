package controller;

import model.*;
import view.View;

public class Controller {
    public static void main(String[] args) {
        runTask21();
        runTask22();
        runTask23();
        runTask24();
        runTask25();
    }

    public static void runTask21(){
        View.printTaskTitle(1);
        int age = 245;
        View.print("Number of heads: " + Task21.getHeadsNumber(age));
        View.print("Number of eyes: " + Task21.getEyesNumber(age));
    }

    public static void runTask22(){
        View.printTaskTitle(2);
        char input1 = 's';
        View.print("Letter " + input1 + " is a " + Task22.getLetterType1(input1));
        char input2 = 'w';
        View.print("Letter " + input2 + " is a " + Task22.getLetterType2(input2));
        char input3 = 'a';
        View.print("Letter " + input3 + " is a " + Task22.getLetterType3(input3));
        char input4 = 'd';
        View.print("Letter " + input4 + " is a " + Task22.getLetterType4(input4));
        char input5 = 'o';
        View.print("Letter " + input5 + " is a " + Task22.getLetterType5(input5));
        char input6 = 'u';
        View.print("Letter " + input6 + " is a " + Task22.getLetterType6(input6));
    }

    public static void runTask23(){
        View.printTaskTitle(3);
        View.print(Task23.getMood());
    }

    public static void runTask24(){
        View.printTaskTitle(4);
        int day = 28;
        int month = 2;
        int year = 1900;
        View.print("1. Tomorrow's date is " + Task24.printTomorrowDate1(day, month, year));
        View.print("2. Tomorrow's date is " + Task24.printTomorrowDate2(day, month, year));
    }

    public static void runTask25(){
        View.printTaskTitle(5);
        int number = 742;
        View.print("Number: " + number);
        View.print("As string: " + Task25.getNumberAsString(number));
    }
}
