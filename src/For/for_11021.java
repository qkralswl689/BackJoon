package For;
import java.util.*;
public class for_11021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ����
		int n = sc.nextInt(); // �Է¹��� ���� n������ ����
		int a = 0; // n������ �Է¹��� �� ������  a������ ����
		int b = 0; // n������ �Է¹��� �� ������   b������ ����
		int count = 0; // �ݺ� Ƚ�� �� ������ count ���� ����
		for(int i =1; i<=n; i++) { // i�� n���� �۰ų� ������ n�� ����ŭ 1�� �����ϸ� a,b������ �Է¹��� ���� �����Ѵ�
			a = sc.nextInt();  
			b = sc.nextInt();
			count++; // �ݺ�Ƚ���� 1�� �����ϸ� �����Ѵ�
			System.out.printf("Case #%d: %d%n",count,a+b); 
			
		}

	}

}
