import javax.swing.*;
public class Clock implements Runnable {
	private int min;
	private int sec;
	private int hr;
	
	
	public void run() {
		hr = 00;
		min = 00;
		sec = 00;
		while (true) {
			System.out.println(hr + ":" + min + ":" + sec);
			sec++;
			if (sec == 60) {
				sec =00;
				min++;
			}
			if (min == 60) {
				min = 00;
				hr++;
			}

			try {
				Thread.sleep(+1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

