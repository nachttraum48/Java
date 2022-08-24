package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 2단계 6번문제. 오븐 시계
 * 
 */
public class _06 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		 
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        in.close();

        int min = 60 * A + B; // 시 -> 분
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
		
	}

}
