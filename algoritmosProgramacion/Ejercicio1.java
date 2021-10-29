package algoritmosProgramacion;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Escribe dos numero: ");
		int n;
		int m;
		int suma;
		int producto;
		int resta;
		int division;

		n = Entrada.entero();
		m = Entrada.entero();
		suma = n + m;
		producto = n * m;
		resta = m - n;
		division = m / n;

		System.out.println("La suma es: " + suma);
		System.out.println("El producto es: " + producto);
		System.out.println("El resto es: " + resta);
		System.out.println("La divisin es: " + division);

	}

}
