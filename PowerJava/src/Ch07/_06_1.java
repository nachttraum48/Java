package Ch07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : 예제 7-6. 액션 이벤트 처리
 * 
 */
class MyClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("beep");
	}
	
}

public class _06_1 {
	
	public static void main(String[] args) {
		
		ActionListener listener = new MyClass();
		Timer t = new Timer(1000, listener);
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
}
