package IF;
import java.util.*;
public class if_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h >=0 || h<=23 && m>=0 || m<=59) { 
			// h�� 0�����ų� ũ�� 23�����ų� ������ m�� 0�� ���ų� ũ�� 59���� �۰ų� ���� ��
			if(m > 45 || m==45) {// m�� 45���� ũ�ų� 45�� ������
				m -= 45; // m���� 45�� ���ش�				
			}else if(m<45) { // m�� 45���� ũ�ٸ�
				if(h==0) { // h�� 0�� ���� ��
					h+=23; // h�� 23�� �����ְ�
					int k = m-45; // ���� k�� m -45���� �����Ѵ�
					m = 60+k; // ���� m���� 60 + k���� �����Ѵ�
				}else if(h>0) { // h�� 0���� ũ�ٸ�
					h--; // h���� 1�� ���ְ�
					int k = m-45; //���� k�� m -45���� �����Ѵ�
					m = 60+k; // ���� m���� 60 + k���� �����Ѵ�
				}
			}System.out.printf("%d %d",h,m);
		}		
	}
}
