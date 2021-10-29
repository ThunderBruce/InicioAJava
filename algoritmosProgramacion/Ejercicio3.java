package algoritmosProgramacion;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Introduzca dos numeros:");
		int m, n, p;
		m = Entrada.entero();
		n = Entrada.entero();
		if (m >= n && m % n == 0) {
			p = m / n;
			System.out.println("El resultado es " + p);
		} else {
			System.out.println("El numero no es divisor del otro");
		}
	}

}
