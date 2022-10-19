
public class sinalAmarelo extends Thread {
	public void run() {
		try {
			Thread.sleep(30000);
			System.out.println("Amarelo");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
