package Ch07;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : 예제 7-1. 추상 메서드의 예
 * 
 */
abstract class Shape_1 {
	
	int x, y;
	
	public void translate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
	
}

class Rectangle extends Shape_1 {
	
	int width, height;

	@Override
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
	
}

class Circle_1 extends Shape_1 {
	
	int radius;

	@Override
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
	
}

public class _01 {

	public static void main(String[] args) {
		
		// Shape s1 = new Shape();
		Shape_1 s2 = new Circle_1();
		s2.draw();
		
	}

}
