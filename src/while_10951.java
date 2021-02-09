import java.util.*;
public class while_10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
			
		while(sc.hasNext()) { // hasNext() => EOF 처리 : 몇줄의 입력이 들어올지 모르는경우 
			int a = sc.nextInt(); // 입력값을 변수 a에 저장한다
			int b = sc.nextInt(); // 입력값을 변수 b에 저장한다
			System.out.println(a+b); // a+b값을 출력한다
		}
		
	}

}


