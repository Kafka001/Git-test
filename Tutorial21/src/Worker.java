
public class Worker implements Runnable {

	
	public void run() {
		for (int i=0;i<2000;i++){
			Main.increaseNumber();
		}

	}

}
