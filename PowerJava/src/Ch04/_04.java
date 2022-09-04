package Ch04;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 4-4. 생성자 만들어 보기
 * 
 */
public class _04 {

	private int channel;
	private int volume;
	private boolean onOff;
	
	_04(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	
	public static void main(String[] args) {
		
		_04 myTv = new _04(7, 10, true);
		myTv.print();
		
		_04 yourTv = new _04(11, 20, true);
		yourTv.print();
		
	}

}
