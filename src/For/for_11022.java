package For;
import java.util.*;
public class for_11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 클래스 Scanner 객체 생성
		int t = sc.nextInt(); // 입력값을 변수 t에 저장
		int a = 0;
		int b = 0;
		int count = 0;
		
		for(int i=1; i<=t; i++) { // i가 t의 값보다 작거나 크다면 1씩 증가하면서 반복한다
			a = sc.nextInt();
			b = sc.nextInt();
			count++;
			System.out.printf("Case #%d: %d + %d = %d%n",count,a,b,a+b);
		}

	}

}
