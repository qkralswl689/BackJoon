package IF;
import java.util.*;
public class if_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h >=0 || h<=23 && m>=0 || m<=59) { 
			// h가 0과같거나 크고 23과같거나 작으며 m이 0과 같거나 크고 59보다 작거나 같을 때
			if(m > 45 || m==45) {// m이 45보다 크거나 45와 같으면
				m -= 45; // m에서 45을 빼준다				
			}else if(m<45) { // m이 45보다 크다면
				if(h==0) { // h가 0과 같을 때
					h+=23; // h에 23을 더해주고
					int k = m-45; // 변수 k에 m -45값을 저장한다
					m = 60+k; // 변수 m에는 60 + k값을 저장한다
				}else if(h>0) { // h가 0보다 크다면
					h--; // h에서 1을 빼주고
					int k = m-45; //변수 k에 m -45값을 저장한다
					m = 60+k; // 변수 m에는 60 + k값을 저장한다
				}
			}System.out.printf("%d %d",h,m);
		}		
	}
}
