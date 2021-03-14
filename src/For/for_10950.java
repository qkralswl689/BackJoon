package For;
import java.util.*;
public class for_10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성
		int t = sc.nextInt(); // 입력받은 값을 t 변수에 저장
		int a = 0; // 입력받은 값 저장 할 a변수 선언
		int b = 0; // 입력받은 값 저장 할  b변수 선언
		for(int i=1;i<=t; i++) { // i는 입력받은 t의 갯수만큼 1씩 증가하며반복한다
			a = sc.nextInt(); // t에 입력된 값만큼 a변수에 값을 입력받는다저장한다
			b = sc.nextInt(); // t에 입력된 값만큼 b변수에 값을 입력받는다저장한다
			System.out.println(a+b); // a,b 변수의 합을 출력한다
		}
	
	}

}
