package by.htp.Task03.zad3;

/**
 * 3. ���� ������������������ �������������� ����� a1, a2, ..., an.
 * ��������, ����� �� ��� ������������.
 */
public class Main {

    public static boolean Array(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {0, 8, 5};
        System.out.println(Array(array));
    }

}