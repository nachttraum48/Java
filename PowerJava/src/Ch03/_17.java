package Ch03;

import java.util.ArrayList;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 3-17. ArrayList 사용
 * 
 */
public class _17 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("철수");
		list.add("영희");
		list.add("순신");
		list.add("자영");
		
		for (String obj : list) {
			System.out.print(obj + " ");
		}
		
	}

}
