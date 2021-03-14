package IF;
import java.util.*;

public class if_2753 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String result = "";
		if(year%4 == 0 && year%100 !=0 || year%400 == 0) {
			result = "1";
		}else{
			result = "0";
		}
		System.out.println(result);
	}

}
