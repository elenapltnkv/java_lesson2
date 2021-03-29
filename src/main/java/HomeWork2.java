public class HomeWork2 {
    public static void main(String args[]) {
        System.out.println(wthin10and20(5, 6));
        //wthin10and20(5, 6);
        isPositiveOrNegative(0);
        isNegative(-25);
        printWordNTimes(12, 5);
    }

    public static boolean wthin10and20(int x1, int x2) {
        int y = x1 + x2;

        if ((y >= 10) || (y <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes(int word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(word);
        }
    }
}