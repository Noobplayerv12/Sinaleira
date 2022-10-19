import java.util.Scanner;

public class main {

	private static String sair;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread svThread = new Thread(new sinalVerde());
		Thread sveThread = new Thread(new sinalVermelho());
		Thread saThread = new Thread(new sinalAmarelo());
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite 'exit' para sair da aplicação.");
			System.out.println("Vermelho");
			do {
				svThread.run();
				saThread.run();
				sveThread.run();
				System.out.println("Aperte enter para continuar.");
			 	sair = sc.nextLine();
				if(sair != ""){
					sc.close();
					System.out.println("Digitou: "+sair);
					break;
				}
			} while (sair != "exit");
			sc.close();
			System.out.println("Saiu do Programa");
		}
	}

}
