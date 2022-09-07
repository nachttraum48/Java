package sub01;

/*
 * 날짜 : 2022/09/07
 * 이름 : 이석중
 * 내용 : 수행평가 문제 4번
 * 
 */
public class _04 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 8; j++) {
				if (j < 4-i || i+5 < j+1) {
				System.out.print("☆");
				} else {
				System.out.print("★");
				}
			}
			System.out.println("");
		}
		
	}
	
}
