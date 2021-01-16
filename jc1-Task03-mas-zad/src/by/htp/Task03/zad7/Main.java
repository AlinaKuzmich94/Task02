package by.htp.Task03.zad7;

/**
 * 7. ���� �������������� ����� a1, a2, �, an. 
 * �������� ������� ���������� � ���������� ��������..
 */

public class Main {
	public static void changeMinMax(double[] array) {
        if (array.length == 0)
            throw new IllegalArgumentException("������ ������� �����!");
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = i;
            if (array[i] < min)
                min = i;

        }

        double tmp = array[max];
        array[max] = array[min];
        array[min] = tmp;

    }

}
