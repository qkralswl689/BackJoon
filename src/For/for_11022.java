package For;
import java.util.*;
public class for_11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է� Ŭ���� Scanner ��ü ����
		int t = sc.nextInt(); // �Է°��� ���� t�� ����
		int a = 0;
		int b = 0;
		int count = 0;
		
		for(int i=1; i<=t; i++) { // i�� t�� ������ �۰ų� ũ�ٸ� 1�� �����ϸ鼭 �ݺ��Ѵ�
			a = sc.nextInt();
			b = sc.nextInt();
			count++;
			System.out.printf("Case #%d: %d + %d = %d%n",count,a,b,a+b);
		}

	}

}
