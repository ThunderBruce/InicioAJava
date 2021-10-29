package algoritmosProgramacion;

public class queSignificaPorcentaje {

	public static void main(String[] args) {
		int primerNumero=Entrada.entero();
		int segundoNumero=Entrada.entero();
		if (primerNumero%segundoNumero==0) {
			System.out.println("Es multiplo ");
		}else {System.out.println("No es multiplo");}
		int resto=primerNumero%segundoNumero;
		System.out.println(resto);
		int array[]=new int[5];
		System.out.println(array.length + "Esto significa cuanto tamaño tiene el array");
		for (int i = 0; i == 5 ; i++) {
			
		}
	}

}
