package by.htp.Task03.zad4;

import java.util.Arrays;

/**
 * 4. ƒана последовательность натуральных чисел a1, a2, ..., an.
 * —оздать массив из четных чисел этой последовательности.
 * ≈сли таких чисел нет, то вывести сообщение об этом факте.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 6, 2, 17, -6, 0};
        System.out.println(Arrays.toString(arrayOfEvens(array)));
        System.out.println(Arrays.toString(funcArrayOfEvens(array)));
    }

    public static int[] funcArrayOfEvens(int[] array) {
        int[] result = Arrays.stream(array).filter(n -> (n % 2) == 0).toArray();
        if (result.length == 0) {
            System.out.println("Ќет четных чисел");
        }
        return result;
    }

    public static int[] arrayOfEvens(int[] array) {

        // находим длину результирующего массива
        int evenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCounter++;
            }
        }

        // создем пустой массив 
        int[] result = new int[evenCounter];

        // заполн€ем четными числами
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[j++] = array[i];
            }
        }

        if (result.length == 0) {
            System.out.println("Ќет четных чисел");
        }

        return result;
    }

}
