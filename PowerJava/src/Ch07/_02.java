package Ch07;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : 예제 7-2. 원격 제어 인터페이스
 * 
 */
interface RemoteControl {
	
	void turnOn();
	void turnOff();
	
	public default void printBrand() {
		System.out.println("Remote Control 가능 TV");
	}
	
}

class Television implements RemoteControl {

	boolean on;
	
	@Override
	public void turnOn() {
		on = true;
		System.out.println("TV가 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		on = false;
		System.out.println("TV가 꺼졌습니다.");
	}

	@Override
	public void printBrand() {
		System.out.println("Power Java TV입니다.");
	}
	
}

public class _02 {

	public static void main(String[] args) {
		
		RemoteControl obj = new Television();
		obj.turnOn();
		obj.turnOff();
		obj.printBrand();
		
	}

}
