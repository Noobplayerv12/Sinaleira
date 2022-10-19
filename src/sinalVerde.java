
public class sinalVerde extends Thread {
	public void run() {
		try {
			Thread.sleep(12000);
			System.out.println("Verde");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
