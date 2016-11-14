package rajeshwari.codes.thread.codelab;

import java.util.List;

public class NewThread extends Thread {
	public int summationValue = 0;
	private List<Integer> numbers;

	public NewThread(List<Integer> numList) {
		numbers = numList;
	}
	
	@Override
	public void run() {
		int sum2 = 0;
		for (int i=5;i<100;i++) {
			sum2 += numbers.get(i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		summationValue = sum2;
	}
}
