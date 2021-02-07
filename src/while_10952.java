import java.util.*;
public class while_10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 Scanner 객체 생성
		
		while(true) { // 값이 true라면
			int a = sc.nextInt(); // 입력을 받아 변수 a에 저장 한다
			int b = sc.nextInt(); // 입력을 받아 변수 b에 저장 한다
			if(a==0 && b==0) { // 만약에 a 와 b의 값이 0 이면 반복을 중지한다
				break; 
			}else {
			 System.out.println(a+b); // 아니면 a와b의 합을 출력한다
			}
			
		}
	}

}
