package by.epam.preTraining.task4.model;

/**
 * Created by karina on 13-02-2018.
 */
public class HanoiTower {
    private static StringBuilder resultRecursive = new StringBuilder();

    public static StringBuilder calculateHanoiRecursive(int rings, String from, String to, String middle) {
        if (rings == 1) {
            resultRecursive.append("\n" + from + "->" + to);
        } else {
            calculateHanoiRecursive(rings - 1, from, middle, to);
            resultRecursive.append("\n" + from + "->" + to);
            calculateHanoiRecursive(rings - 1, middle, to, from);
        }
        return resultRecursive;
    }

    public static StringBuilder calculateHanoi(int rings, String from, String to, String middle) {
        StringBuilder result = new StringBuilder();
        int bound = 1 << rings;
        if (rings % 2 == 0) {
            for (int i = 1; i < bound; i++) {
                result.append("\n" + getTowerName((i & i - 1) % 3, from, to, middle) + "->" +
                        getTowerName(((i | i - 1) + 1) % 3, from, to, middle));
            }
        } else {
            for (int i = 1; i < bound; i++) {
                result.append("\n" + getTowerName((i & i - 1) % 3, from, middle, to) + "->" +
                        getTowerName(((i | i - 1) + 1) % 3, from, middle, to));
            }

        }

        return result;
    }

    private static String getTowerName(int number, String from, String to, String middle) {
        String name = "";
        switch (number) {
            case 0:
                name = from;
                break;
            case 1:
                name = to;
                break;
            case 2:
                name = middle;
                break;
        }
        return name;
    }

}
