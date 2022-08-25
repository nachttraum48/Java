package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이석중
 * 내용 : 백준 4단계 2번문제. 최댓값
 * 
 */
public class _02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt() };
		in.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);
		
	}

}
