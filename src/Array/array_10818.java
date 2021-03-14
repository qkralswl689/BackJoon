package Array;
import java.util.*;
public class array_10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		int n = sc.nextInt(); //  입력받은 값 저장할 변수 n 선언
		int[] arr = new int[n]; // 입력받은값 n 길이만큼의 배열 arr 선언
		
		for(int i=0; i<n;i++) { // i는 입력값 n만큼 1씩 증가하면서 반복하면서
			arr[i] = sc.nextInt(); // 배열 arr에 입력받은 값을 저장한다
		}
		int min = arr[0],max = arr[0]; // min,max 변수 선언과 동시에 arr 배열 0번쨰 값으로 초기화
		for(int i=0;i<arr.length; i++) { //i 는 0부터 배열의 길이만큼 1씩 증가하면서 반복한다
			if(arr[i]<min) { // 만약에 배열의 값이 min(배열의 초기값 )보다 작다면 
				min = arr[i]; // min 변수에 배열의 값을 저장하고 
			}else if(arr[i]>max) { // 배열의 값이 max(배열의 초기값)보다 크다면
				max= arr[i]; // max 변수에 배열의 값을 저장한다
			}
		}System.out.printf("%d %d",min,max);
			
	}
}
		

		

		

	
        	
			

