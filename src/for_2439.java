import java.util.*;
public class for_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ���� 
		int n = sc.nextInt(); // �Է¹��� �� ���� n�� ����
		
		for(int i=1; i<=n; i++) {
			System.out.println("*");
			for(int j = n; j<=1; j++) {
				System.out.print("+");
			}
		}
	}

}
