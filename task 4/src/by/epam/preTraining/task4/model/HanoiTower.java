package by.epam.preTraining.task4.model;

public class HanoiTower {

    public static StringBuilder calculateHanoiRecursive(StringBuilder resultRecursive, int rings, String from, String to, String middle) {
        if (rings > 0) {
            calculateHanoiRecursive(resultRecursive,rings - 1, from, middle, to);
            resultRecursive.append("\n" + from + "->" + to);
            calculateHanoiRecursive(resultRecursive,rings - 1, middle, to, from);
        }
        return resultRecursive;
    }

    public static StringBuilder calculateHanoi(int rings, String from, String to, String middle) {
        StringBuilder result = new StringBuilder();
        int bound = 1 << rings;
        boolean isEven = rings % 2 == 0;
        if (!isEven){
            String buf = middle;
            middle = to;
            to = buf;
        }
        for (int i = 1; i < bound; i++) {
            result.append("\n" + computeTowerName((i & i - 1) % 3, from, to, middle) + "->" +
                        computeTowerName(((i | i - 1) + 1) % 3, from, to, middle));
        }

        return result;
    }

    private static String computeTowerName(int number, String from, String to, String middle) {
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
