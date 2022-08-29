package Ch05;

/*
 * 날짜 : 2022/08/29
 * 이름 : 이석중
 * 내용 : 예제 5-1. 피자 크기 비교하기
 * 
 */
class Pizza {
	
	int radius;
	
	Pizza(int r) {
		radius = r;
	}
	
	Pizza whosLargest(Pizza p1, Pizza p2) {
		if (p1.radius > p2.radius) {
			return p1;
		} else {
			return p2;
		}
	}
	
}

public class _01 {

	public static void main(String[] args) {
		
		Pizza obj1 = new Pizza(14);
		Pizza obj2 = new Pizza(18);
		
		Pizza largest = obj1.whosLargest(obj1, obj2);
		System.out.println(largest.radius + "인치 피자가 더 큼.");
		
	}

}
