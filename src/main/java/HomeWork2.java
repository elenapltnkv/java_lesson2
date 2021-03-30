public class HomeWork2 {
    public static void main(String args[]) {
        System.out.println(wthin10and20(5, 6));
        //wthin10and20(5, 6);
        isPositiveOrNegative(0);
        isNegative(-25);
        printWordNTimes(12, 5);
    }
//Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
// в противном случае – false.
    public static boolean wthin10and20(int x1, int x2) {
        int y = x1 + x2;

        if ((y >= 10) || (y <= 20)) {
            return true;
        } else {
            return false;
        }
    }
//Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }
//Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }
//Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWordNTimes(int word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(word);
        }
    }
}