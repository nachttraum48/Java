package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : 변수의 주소 값 비교하기
 * 
 */
public class P195_2 {

	public static void main(String[] args) {
		
		P195_1 myCompany1 = P195_1.getInstance();
		P195_1 myCompany2 = P195_1.getInstance();
		
		System.out.println(myCompany1 == myCompany2);
		
	}

}
