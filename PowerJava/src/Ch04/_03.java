package Ch04;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 4-3. Television 클래스 작성하고 객체 생성해보기
 * 
 */
public class _03 {

	int channel;
	int volume;
	boolean onOff;
	
	public static void main(String[] args) {
		
		_03 myTv = new _03();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		
		_03 yourTv = new _03();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");
		System.out.println("너의 텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");
		
	}

}
