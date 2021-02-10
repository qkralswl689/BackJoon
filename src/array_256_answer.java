import java.util.*;
public class array_256_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			//System.out.println(arr[i]);
		}
		int max = arr[0];
		int count =0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
					
		}
		for(int i=0; i<arr.length; i++) {
			count++;
			if(arr[i] == max) {
				break;
			}
		}
		System.out.println(max);
		System.out.println(count);


	}

}
