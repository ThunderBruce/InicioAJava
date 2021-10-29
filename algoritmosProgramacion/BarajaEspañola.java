package algoritmosProgramacion;

import java.util.Random;

public class BarajaEspañola {

	public static void main(String[] args) {

		String[] baraja = new String[40];

		rellenarBaraja(baraja);

		mostrarBaraja(baraja);

		do {

			System.out.println("\n");

			System.out.println("Dime cuantas cartas quieres:");

			int n = Entrada.entero();

			String mano[] = repartirBaraja(n, baraja);

			mostrarBaraja(mano);

		} while (true);

	}

	private static String[] repartirBaraja(int numero, String[] b) {

		String mano[] = new String[numero];

		for (int i = 0; i < numero; i++) {

			if (b[generarAleatorios()].equals(" ")) {

			} else {

				mano[i] = b[generarAleatorios()];

				b[generarAleatorios()] = " ";

			}

		}

		return mano;
	}

	public static int generarAleatorios() {
		Random r = new Random();
		int n = r.nextInt(40);
		return n;

	}

	private static void mostrarBaraja(String[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	private static void rellenarBaraja(String[] b) {

		for (int i = 0; i < 40; i++) {

			if (i <= 10) {

				if (i >= 7) {

					b[i] = i + 3 + "O";

				} else {

					b[i] = i + 1 + "O";

				}
			}

			if (i >= 10 && i < 20) {

				if (i >= 17) {

					b[i] = i - 7 + "C";

				} else {

					b[i] = i - 9 + "C";

				}

			}

			if (i >= 20 && i < 30) {

				if (i >= 27) {

					b[i] = i - 17 + "E";

				} else {

					b[i] = i - 19 + "E";

				}
			}

			if (i >= 30 && i < 40) {

				if (i >= 37) {

					b[i] = i - 27 + "B";

				} else {

					b[i] = i - 29 + "B";

				}
			}

		}
	}

}
