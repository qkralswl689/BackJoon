import java.util.*;
public class for_2439_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ���� 
		int n = sc.nextInt(); // �Է¹��� �� ���� n�� ����
		
		for(int i=1; i<=n; i++) {
			System.out.print("*");
			for(int j = n-i; j>0; j--) {
				System.out.print("+");
				}
			
			for(int j=i; j>0; j--) {
				System.out.print("&");//System.out.println();
			}System.out.println();
		}
	}

}
