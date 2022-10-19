
public class sinalVermelho extends Thread {
	public void run() {
		try {
			Thread.sleep(6000);
			System.out.println("Vermelho");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}