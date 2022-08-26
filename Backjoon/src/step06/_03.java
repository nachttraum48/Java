package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : 백준 6단계 3번문제. 알파벳 찾기
 * 
 */
public class _03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = in.nextLine();
		
		for(int i = 0; i < S.length(); i++) {
			
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
		
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
		
		in.close();
		
	}

}
