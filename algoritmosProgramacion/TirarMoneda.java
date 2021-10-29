package algoritmosProgramacion;

import java.util.Random;

public class TirarMoneda {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			switch (tirarDado()) {
			case 0:
				System.out.println("Cara");
				break;
			case 1:
				System.out.println("Cruz");
				break;
			case 2:
				System.out.println("Canto");
				break;
			}

		}

	}

	private static int tirarDado() {
		Random r = new Random();
		int n = r.nextInt(3);
		return n;
	}

}
