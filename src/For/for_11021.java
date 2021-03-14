package For;
import java.util.*;
public class for_11021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성
		int n = sc.nextInt(); // 입력받은 값을 n변수에 저장
		int a = 0; // n변수에 입력받은 값 저장할  a변수에 저장
		int b = 0; // n변수에 입력받은 값 저장할   b변수에 저장
		int count = 0; // 반복 횟수 값 저장할 count 변수 선언
		for(int i =1; i<=n; i++) { // i는 n보다 작거나 같으면 n의 값만큼 1씩 증가하며 a,b변수에 입력받은 값을 저장한다
			a = sc.nextInt();  
			b = sc.nextInt();
			count++; // 반복횟수를 1씩 증가하며 저장한다
			System.out.printf("Case #%d: %d%n",count,a+b); 
			
		}

	}

}
