package Ch04;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 4-1. DeskLamp 클래스 작성하고 객체 생성해보기
 * 
 */
public class _01_1 {

	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
	}

}
