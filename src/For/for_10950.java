package For;
import java.util.*;
public class for_10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹��� Scanner ��ü ����
		int t = sc.nextInt(); // �Է¹��� ���� t ������ ����
		int a = 0; // �Է¹��� �� ���� �� a���� ����
		int b = 0; // �Է¹��� �� ���� ��  b���� ����
		for(int i=1;i<=t; i++) { // i�� �Է¹��� t�� ������ŭ 1�� �����ϸ�ݺ��Ѵ�
			a = sc.nextInt(); // t�� �Էµ� ����ŭ a������ ���� �Է¹޴´������Ѵ�
			b = sc.nextInt(); // t�� �Էµ� ����ŭ b������ ���� �Է¹޴´������Ѵ�
			System.out.println(a+b); // a,b ������ ���� ����Ѵ�
		}
	
	}

}
