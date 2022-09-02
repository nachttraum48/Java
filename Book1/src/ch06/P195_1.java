package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : public 메서드 만들기
 * 
 */
public class P195_1 {

	private static P195_1 instance = new P195_1();
	private P195_1() {}
	
	public static P195_1 getInstance() {
		if (instance == null) {
			instance = new P195_1();
		}
		return instance;
	}

}
