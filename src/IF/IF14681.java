package IF;

import java.util.Scanner;

public class IF14681 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=0) { // a�� 0�� ���ų� ũ��
			if(b>=0) { // b�� 0�� ���ų� ũ�ٸ�
				System.out.println(1); // 1���
			}else if(b<0) {// b�� 0���� �۴ٸ�
				System.out.println(4); // 4���
			}
		}else if(a<0) { // a�� 0���� �۰�
			if(b>=0) { // b�� 0���� ũ�ų� ������
				System.out.println(2); // 2���
			}else if(b<0) { // b�� 0���� �۴ٸ�
				System.out.println(3); // 3���
			}
		}		
	}
}
