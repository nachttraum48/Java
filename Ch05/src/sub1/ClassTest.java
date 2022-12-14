package sub1;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이석중
 * 내용 : Java 클래스 실습하기
 * 
 * 클래스와 객체
 *  - 클래스는 객체를 생성하는 구조체이고 속성(필드)과 기능(메서드)으로 구성
 *  - 객체는 클래스의 실제 인스턴스이고 new 연산으로 생성
 * 
 */
public class ClassTest {

	public static void main(String[] args) {

		// 객체 생성
		Car sonata = new Car();
		
		// 객체 속성 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 10;
		
		// 객체 기능
		sonata.speedUp(80);
		sonata.speedDown(30);
		sonata.show();
		
		// 객체 생성
		Car avante = new Car();
		
		// 객체 속성 초기화
		avante.name = "아반테";
		avante.color = "은색";
		avante.speed = 10;
		
		// 객체 기능
		avante.speedUp(70);
		avante.speedDown(40);
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account();
		
		kb.bank = "국민은행";
		kb.id = "101-12-1011";
		kb.name = "홍길동";
		kb.balance = 1000;
		
		kb.deposit(50000);
		kb.withdraw(7000);
		kb.show();
		
	}

}
