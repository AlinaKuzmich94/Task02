package by.htp.Task03.zad10;

/**
 * 10. Даны действительные числа а1, а2, ..., аn. 
 * Найти max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).
 */

public class Main {
    public static void main(String [] args) {
        double[] array = {1, 1, 20, 1, 45, 6, 7, 40, 30};
        System.out.println(maxSumArray(array));
    }
    public static double maxSumArray(double[] array){
        double maxSum = array[0] + array[array.length-1];
        for(int i = 1; i < array.length / 2; i++){
            if((array[i] + array[array.length - i - 1]) > maxSum){
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        return maxSum;
    }
}