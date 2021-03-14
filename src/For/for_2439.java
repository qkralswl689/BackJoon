package For;
import java.util.*;
public class for_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner 객체 생성 
		int n = sc.nextInt(); // 입력받은 값 변수 n에 저장
		
		for(int i =0; i<n; i++) { // i는0에서  n 까지 1씩 증가하면서 반복한다
			for(int j = n-i; j>1; j--) { // j 는 4-i 이 0이 될때 까지 1씩 감소하면서 반복한다
				System.out.print(" ");
			}for(int j = 0; j<=i;j++) { // j는 0에서 i의 값과 같아질 떄까지 1씩 증가하면서 반복한다
				System.out.print("*");
				
			}System.out.println();
		}
	}
			
}


