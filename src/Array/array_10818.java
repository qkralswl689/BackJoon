package Array;
import java.util.*;
public class array_10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner ��ü ����
		int n = sc.nextInt(); //  �Է¹��� �� ������ ���� n ����
		int[] arr = new int[n]; // �Է¹����� n ���̸�ŭ�� �迭 arr ����
		
		for(int i=0; i<n;i++) { // i�� �Է°� n��ŭ 1�� �����ϸ鼭 �ݺ��ϸ鼭
			arr[i] = sc.nextInt(); // �迭 arr�� �Է¹��� ���� �����Ѵ�
		}
		int min = arr[0],max = arr[0]; // min,max ���� ����� ���ÿ� arr �迭 0���� ������ �ʱ�ȭ
		for(int i=0;i<arr.length; i++) { //i �� 0���� �迭�� ���̸�ŭ 1�� �����ϸ鼭 �ݺ��Ѵ�
			if(arr[i]<min) { // ���࿡ �迭�� ���� min(�迭�� �ʱⰪ )���� �۴ٸ� 
				min = arr[i]; // min ������ �迭�� ���� �����ϰ� 
			}else if(arr[i]>max) { // �迭�� ���� max(�迭�� �ʱⰪ)���� ũ�ٸ�
				max= arr[i]; // max ������ �迭�� ���� �����Ѵ�
			}
		}System.out.printf("%d %d",min,max);
			
	}
}
		

		

		

	
        	
			

