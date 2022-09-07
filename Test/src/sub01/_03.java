package sub01;

/*
 * 날짜 : 2022/09/07
 * 이름 : 이석중
 * 내용 : 수행평가 문제 3번
 * 
 */
public class _03 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("☆");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	
}
