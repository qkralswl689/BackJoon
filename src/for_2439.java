import java.util.*;
public class for_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성 
		int n = sc.nextInt(); // 입력받은 값 변수 n에 저장
		
		for(int i=1; i<=n; i++) {
			System.out.println("*");
			for(int j = n; j<=1; j++) {
				System.out.print("+");
			}
		}
	}

}
