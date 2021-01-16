package by.htp.Task03.zad9;

import java.util.*;

/**
 * 9. ƒан массив действительных чисел, размерность которого N.
 * ѕодсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Main {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("¬ведите количество чисел N:");
    	int n = scan.nextInt();
    	
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
        	array[i] = scan.nextInt();
        	}
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(flipMinMax(array)));
    }

    public static int[] flipMinMax(int[] array) {
        if (array != null) {
            int minIndex = 0;
            int maxIndex = 0;
            // define indexes of min and max elements
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            // flip min and max elements
            int temp = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = temp;
        }
        return array;
    }
}