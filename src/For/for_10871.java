package For;
import java.util.*;
public class for_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		int n = sc.nextInt(); // 입력받은 수 저장할 변수 n생성
		int x = sc.nextInt(); // 입력받은 수 저장할 변수 x생성
		int[]arr = new int[n]; // 입력받은 수 길이만큼 저장할 배열 arr 생성
		for(int i=0;i<n;i++) { // i는 0부터 입력받은 수 n 까지 1씩 증가하며 반복면서
			arr[i] = sc.nextInt(); // 입력받은 값을 배열 arr에 저장한다
			if(arr[i]<x) { // 만약에 배열의 값 이 x값(위에서 두번째로 입력받은값)보다 작다면
				System.out.println(arr[i]); // 그 값을 출력한다
			}
		}
				
	}

}
