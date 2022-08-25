package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이석중
 * 내용 : 백준 4단계 4번문제. 평균
 * 
 */
public class _04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		 
		double arr[] = new double[in.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextDouble();
		}
		in.close();
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
		
	}

}
