package HomeWork;

import java.util.Scanner;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */
public class HW1 {
    public static void main(String[] args) {
        //System.err.println(DivByZero(10,0));
        //System.err.println(ArrayOverflow());
        array();
    }
    public static int DivByZero(int a, int b) {
        return a/b;
    }
    public static int[] ArrayOverflow() {
        int count = 0;
        while (true) {
            count += 1000;
            ArrayOverflow();
        }
    }
    private static void array() {
        int[] array = new int[]{1,2,3,4,5};
        System.out.println(array[6]);
    }

}
