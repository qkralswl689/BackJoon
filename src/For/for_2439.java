package For;
import java.util.*;
public class for_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ���� 
		int n = sc.nextInt(); // �Է¹��� �� ���� n�� ����
		
		for(int i =0; i<n; i++) { // i��0����  n ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
			for(int j = n-i; j>1; j--) { // j �� 4-i �� 0�� �ɶ� ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print(" ");
			}for(int j = 0; j<=i;j++) { // j�� 0���� i�� ���� ������ ������ 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print("*");
				
			}System.out.println();
		}
	}
			
}


