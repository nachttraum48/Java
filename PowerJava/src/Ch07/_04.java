package Ch07;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : 예제 7-4. 디폴트 메서드 예제
 * 
 */
interface Drawable_2 {
	
	void draw();
	
	public default void getSize() {
		System.out.println("1024X768 해상도");
	}
	
}

class Circle_3 implements Drawable_2 {

	int radius;
	
	@Override
	public void draw() {
		System.out.println("Circle draw");
	}

	@Override
	public void getSize() {
		System.out.println("3000X2000 해상도");
	}
	
}

public class _04 {
	
	public static void main(String[] args) {
		
		Drawable_2 d = new Circle_3();
		d.getSize();
		d.draw();
		
	}
	
}
