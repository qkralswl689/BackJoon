import java.util.*;
public class array_10818_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; //n�� ���̸��� �迭���� arr ����
				
			for(int i= 0; i<n; i++) {
        	arr[i] = sc.nextInt(); // i�� �迭������ ������ �Է¹޴´�
        		
			}//System.out.println(Arrays.toString(arr));

        	Arrays.sort(arr);
        	System.out.println(arr[0]);
        	System.out.println(arr[arr.length-1]);
	}

}
        	
			

