package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : 백준 6단계 4번문제. 문자열 반복
 * 
 */
public class _04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
	
			int R = in.nextInt();
			String S = in.next();	// nextLine() 을 쓰면 error!
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
		
		in.close();
		
	}

}
