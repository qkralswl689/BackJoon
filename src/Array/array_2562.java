package Array;
import java.util.*;
public class array_2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է� ��ü Scanner ����
		int[] arr = new int[9]; // 9������ �迭���� arr ����
		
		for(int i=0; i<arr.length; i++) { // i��0���� �迭�� ���̸�ŭ ���� �Է¹޾� �迭���� arr �� �����Ѵ�
			arr[i] = sc.nextInt();
			//System.out.println(arr[i]);
		}
		int max = arr[0]; // ū�� ������ ���� ����
		int count=0; // �ݺ�Ƚ�� ������ ���� ����
		
		for(int j=0;j<arr.length;j++) { // j�� 0���� �迭�� ���̸�ŭ �ݺ��Ѵ�
			if(arr[j]>max) { // ���࿡ �迭�� ����� ���� j���� ũ�ٸ�
				max = arr[j]; // ���� max�� �迭�� ���� �����Ѵ�
			}
			
			}
			for(int i=0; i<arr.length;i++) { // i�� 0���� �迭�� ���̸�ŭ �ݺ��Ѵ�
				count++;
				if(arr[i] == max) { // ���࿡ �迭�� ���� max ������ ���ٸ�
					break; // �����Ѵ�
				}
		}System.out.println(max);
		System.out.println(count); // �ε����� 0���� �����Ͽ� -1�� ���ش�
		
	}

}
