package algoritmosProgramacion;

public class Ej20 {

	public static void main(String[] args) {
		int opcion;
		do {

			mostrarMenu();
			opcion = Entrada.entero();
			if (opcionCorrecta(opcion)) {

				switch (opcion) {

				case 1:
					calcularLongitud();
					break;
				case 2:
					calcularArea();
					break;
				case 3:
					calcularVolumen();
					break;
				case 0:
					break;

				}

			} else {
				System.out.println("Opcion Incorrecta");
			}

		} while (opcion != 0);

	}

	private static void calcularVolumen() {
		System.out.println("Introduzca el radio");
		double radio = Entrada.real();
		System.out.println((4 / 3) * radio * radio * radio);

	}

	private static void calcularArea() {
		System.out.println("Introduzca el radio");
		double radio = Entrada.real();
		System.out.println(Math.PI * radio * radio);
	}

	private static void calcularLongitud() {
		System.out.println("Introduzca el radio: ");
		double radio = Entrada.real();
		System.out.println(2 * Math.PI * radio);

	}

	private static boolean opcionCorrecta(int opcion) {
		boolean bien = (opcion >= 0 && opcion <= 3);
		return bien;
	}

	private static void mostrarMenu() {

		System.out.println("\n1-Calcular la longitud");
		System.out.println("2-Calcular la area");
		System.out.println("3-Calcular el volumen");
		System.out.println("0-Para salir");

	}

}
