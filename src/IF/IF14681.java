package IF;

import java.util.Scanner;

public class IF14681 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=0) { // a가 0과 같거나 크고
			if(b>=0) { // b가 0과 같거나 크다면
				System.out.println(1); // 1출력
			}else if(b<0) {// b가 0보다 작다면
				System.out.println(4); // 4출력
			}
		}else if(a<0) { // a가 0보다 작고
			if(b>=0) { // b가 0보다 크거나 같으면
				System.out.println(2); // 2출력
			}else if(b<0) { // b가 0보다 작다면
				System.out.println(3); // 3출력
			}
		}		
	}
}
