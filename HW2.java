package HomeWork;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
 */

public class HW2 {
    public static void main(String[] args) {
        String[][] array0 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };

        String[][] array = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "3"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };
        System.out.println(sum2d(array));
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ext) {
            System.err.println("Выход за пределы массива");
        }
        return sum;
    }
}
