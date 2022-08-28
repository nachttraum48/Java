package Ch04;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 4-2. Box 클래스 정의하고 객체 생성하기
 * 
 */
public class _02 {

	int width;
	int length;
	int height;
	double getVoume() {
		return (double) width * height * length;
	}
	
	public static void main(String[] args) {
		
		_02 b;
		b = new _02();
		b.width = 20;
		b.length = 20;
		b.height = 30;
		System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length + ", " + b.height + "입니다.");
		System.out.println("상자의 부피는 " + b.getVoume() + "입니다.");
		
	}

}
