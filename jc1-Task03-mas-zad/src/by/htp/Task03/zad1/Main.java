package by.htp.Task03.zad1;
import java.util.*;

//� ������ A[N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� K.
public class Main {
	public static void main(String[] args) {
		int K=1;
		double kr;
		int N =1;
		int sum = 0;
		
		System.out.println("����� ���������� �������� �������: ");
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()) {
			sc.next();
		}
		N = sc.nextInt();
		System.out.println("����� K: ");
		K = sc.nextInt();
		
		Random rd = new Random();
		
		int A[] = new int[N];
		for (int j =0; j<N; j++) {
			A[j] = rd.nextInt(100);
			System.out.println("\\ "+A[j]);
		}
		
		for(int i=0;i<N; i++) {
			kr = A[i]% K;
			if (kr== 0) {
				sum = sum + A[i];
			}
		}
		System.out.println("����� ���������, ������� "+K+" = "+sum);
	}

}
