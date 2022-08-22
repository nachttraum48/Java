package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 이석중
 * 내용 : 백준 1단계 12번문제. 곱셈
 * 
 */
public class _12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		
		String c = b.substring(0,1);
		String d = b.substring(1,2);
		String e = b.substring(2,3);
		
		String i = Integer.toString(Integer.parseInt(a) * Integer.parseInt(e));
		String j = Integer.toString(Integer.parseInt(a) * Integer.parseInt(d));
		String k = Integer.toString(Integer.parseInt(a) * Integer.parseInt(c));
		String result = Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(result);

		sc.close();
		
	}

}
