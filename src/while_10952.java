import java.util.*;
public class while_10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է� Scanner ��ü ����
		
		while(true) { // ���� true���
			int a = sc.nextInt(); // �Է��� �޾� ���� a�� ���� �Ѵ�
			int b = sc.nextInt(); // �Է��� �޾� ���� b�� ���� �Ѵ�
			if(a==0 && b==0) { // ���࿡ a �� b�� ���� 0 �̸� �ݺ��� �����Ѵ�
				break; 
			}else {
			 System.out.println(a+b); // �ƴϸ� a��b�� ���� ����Ѵ�
			}
			
		}
	}

}
