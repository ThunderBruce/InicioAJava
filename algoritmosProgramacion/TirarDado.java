package algoritmosProgramacion;

import java.util.Random;

public class TirarDado {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			System.out.print(tirarDado());

		}

	}

	private static int tirarDado() {
		Random r = new Random();
		int n = r.nextInt(6);
		return n + 1;
	}

}
