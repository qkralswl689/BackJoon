import java.util.*;
public class array_10818_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; //n의 길이만금 배열변수 arr 선언
				
			for(int i= 0; i<n; i++) {
        	arr[i] = sc.nextInt(); // i를 배열변수의 값으로 입력받는다
        		
			}//System.out.println(Arrays.toString(arr));

        	Arrays.sort(arr);
        	System.out.println(arr[0]);
        	System.out.println(arr[arr.length-1]);
	}

}
        	
			

