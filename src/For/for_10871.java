package For;
import java.util.*;
public class for_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner ��ü ����
		int n = sc.nextInt(); // �Է¹��� �� ������ ���� n����
		int x = sc.nextInt(); // �Է¹��� �� ������ ���� x����
		int[]arr = new int[n]; // �Է¹��� �� ���̸�ŭ ������ �迭 arr ����
		for(int i=0;i<n;i++) { // i�� 0���� �Է¹��� �� n ���� 1�� �����ϸ� �ݺ��鼭
			arr[i] = sc.nextInt(); // �Է¹��� ���� �迭 arr�� �����Ѵ�
			if(arr[i]<x) { // ���࿡ �迭�� �� �� x��(������ �ι�°�� �Է¹�����)���� �۴ٸ�
				System.out.println(arr[i]); // �� ���� ����Ѵ�
			}
		}
				
	}

}
