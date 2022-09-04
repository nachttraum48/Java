package Ch05;

/*
 * 날짜 : 2022/08/29
 * 이름 : 이석중
 * 내용 : 예제 5-3. 정적 변수 사용하기
 * 
 */
public class _03_2 {
	
	public static void main(String[] args) {
		
		_03_1 p1 = new _03_1("Super Supreme");
		_03_1 p2 = new _03_1("Cheese");
		_03_1 p3 = new _03_1("Pepperoni");
		
		int n = _03_1.count;
		System.out.println("지금까지 판매된 피자 개수 = " + n);
		
	}

}
