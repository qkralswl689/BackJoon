package Array;
import java.util.*;
public class array_2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 객체 Scanner 생성
		int[] arr = new int[9]; // 9길이의 배열변수 arr 생성
		
		for(int i=0; i<arr.length; i++) { // i는0부터 배열의 길이만큼 값을 입력받아 배열변수 arr 에 저장한다
			arr[i] = sc.nextInt();
			//System.out.println(arr[i]);
		}
		int max = arr[0]; // 큰수 저장할 변수 선언
		int count=0; // 반복횟수 저장할 변수 선언
		
		for(int j=0;j<arr.length;j++) { // j는 0부터 배열의 길이만큼 반복한다
			if(arr[j]>max) { // 만약에 배열에 저장된 값이 j보다 크다면
				max = arr[j]; // 변수 max에 배열의 값을 저장한다
			}
			
			}
			for(int i=0; i<arr.length;i++) { // i는 0부터 배열의 길이만큼 반복한다
				count++;
				if(arr[i] == max) { // 만약에 배열의 값과 max 변수가 같다면
					break; // 중지한다
				}
		}System.out.println(max);
		System.out.println(count); // 인덱스는 0부터 시작하여 -1을 해준다
		
	}

}
