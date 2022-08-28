package Ch04;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 4-1. DeskLamp 클래스 작성하고 객체 생성해보기
 * 
 */
public class _01_2 {

	public static void main(String[] args) {
		
		_01_1 myLamp = new _01_1();
		
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
		
	}

}
