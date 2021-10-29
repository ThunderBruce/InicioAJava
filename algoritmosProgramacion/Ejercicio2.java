package algoritmosProgramacion;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("Introduzca dos numeros");
		int n, m;
		n = Entrada.entero();
		m = Entrada.entero();
		if (m > n) {
			System.out.println(m);
			System.out.println(n);
		} else {
			System.out.println(n);
			System.out.println(m);
		}
	}
}
