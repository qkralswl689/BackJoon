import java.util.*;
public class for_2439_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성 
		int n = sc.nextInt(); // 입력받은 값 변수 n에 저장
		
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
