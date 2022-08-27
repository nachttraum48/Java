package step08;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 이석중
 * 내용 : 백준 8단계 2번문제. 소수
 * 
 */
public class _02 {

	public static boolean prime[];
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int N = in.nextInt();
		
		prime = new boolean[N + 1];	// 배열 생성 
		get_prime();
		
		// 소수 합 및 최솟값 
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) {	// false = 소수 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임  
					min = i;
				}
			}
		}
		
		if(sum == 0) {	// 소수가 없다면 
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		in.close();
		
	}
 
	// 에라토스테네스 체 알고리즘 
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		
		
	}

}
