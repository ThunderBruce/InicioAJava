package algoritmosProgramacion;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println("Introduzca dos numeros: ");

		int n,m;

		n=Entrada.entero();
		m=Entrada.entero();

		if (m==n) {
			System.out.println("Los númeroso son iguales el cociente es 1");
		}
		else {
			if (m>n) {
				System.out.println(m+" es mayor que "+n);
				System.out.println("No son divisibles");
			}
			else {
				System.out.println(n+" es mayor que "+m);
			}
			if (n%m==0) {
				System.out.println("Los numeros son divisibles");
			}
		}

	}

}
