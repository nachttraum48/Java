package ch07;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : ArrayList 클래스 사용하기
 * 
 */
public class P224 {

	public static void main(String[] args) {
		
		ArrayList<P207> library = new ArrayList<P207>();
		
		library.add(new P207("태백산맥", "조정래"));
		library.add(new P207("데미안", "헤르만 헤세"));
		library.add(new P207("어떻게 살 것인가", "유시민"));
		library.add(new P207("토지", "박경리"));
		library.add(new P207("어린왕자", "생텍쥐페리"));
		
		for (int i = 0; i < library.size(); i++) {
			P207 book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for (P207 book : library) {
			book.showBookInfo();
		}
		
	}

}
