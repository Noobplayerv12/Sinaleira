
public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread svThread = new Thread(new sinalVerde());
		Thread sveThread = new Thread(new sinalVermelho());
		Thread saThread = new Thread(new sinalAmarelo());
		svThread.run();
		saThread.run();
		sveThread.run();
	}

}
