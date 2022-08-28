package Ch03;

import java.util.Arrays;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 3-16. 래그드 배열
 * 
 */
public class _16 {

	public static void main(String[] args) {
		
		int[][] rarray = new int[3][];
		
		rarray[0] = new int[] {1, 2, 3, 4};
		rarray[1] = new int[] {5, 6, 7};
		rarray[2] = new int[] {8, 9};
		
		for (int[] row : rarray) {
			System.out.println(Arrays.toString(row));
		}
		
	}

}
