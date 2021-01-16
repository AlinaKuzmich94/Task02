package by.htp.Task03.zad4;

import java.util.Arrays;

/**
 * 4. ���� ������������������ ����������� ����� a1, a2, ..., an.
 * ������� ������ �� ������ ����� ���� ������������������.
 * ���� ����� ����� ���, �� ������� ��������� �� ���� �����.
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
            System.out.println("��� ������ �����");
        }
        return result;
    }

    public static int[] arrayOfEvens(int[] array) {

        // ������� ����� ��������������� �������
        int evenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCounter++;
            }
        }

        // ������ ������ ������ 
        int[] result = new int[evenCounter];

        // ��������� ������� �������
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[j++] = array[i];
            }
        }

        if (result.length == 0) {
            System.out.println("��� ������ �����");
        }

        return result;
    }

}
