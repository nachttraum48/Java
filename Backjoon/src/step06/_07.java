package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : 백준 6단계 7번문제. 상수
 * 
 */
public class _07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
		
	}

}
