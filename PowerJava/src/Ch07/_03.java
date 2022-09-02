package Ch07;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : 예제 7-3. 다중 상속 예제
 * 
 */
class Shape_2 {
	protected int x, y;
}

interface Drawable_1 {
	void draw();
}

class Circle_2 extends Shape_2 implements Drawable_1 {

	int radius;
	
	@Override
	public void draw() {
		System.out.println("Circle Drw at (" + x + ", " + y + ")");
	}
	
}

public class _03 {
	
	public static void main(String[] args) {
		
		Drawable_1 obj = new Circle_2();
		obj.draw();
		
	}
	
}
