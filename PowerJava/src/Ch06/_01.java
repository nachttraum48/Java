package Ch06;

/*
 * 날짜 : 2022/09/01
 * 이름 : 이석중
 * 내용 : 예제 6-1. Animal 클래스와 Dog 클래스 만들어보기
 * 
 */
class Animal {
	
	int age;
	
	void eat() {
		System.out.println("먹고 있음...");
	}
	
}

class Dog extends Animal {
	
	void bark() {
		System.out.println("짖고 있음...");
	}
	
}

public class _01 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
	}

}
