package algoritmosProgramacion;

import java.util.Random;

import solucionesClase.Entrada;

public class SumaProductoMatrices {

	public static void main(String[] args) {
	System.out.println("Suma de matrices crearemos matrices al azar y las sumaremos");
	System.out.println("***Nota***: Para que dos matrices se sumen necesitan ser de la misma dimension");
	System.out.println("Cuantas filas?");
	int filas=Entrada.entero();
	System.out.println("Columnas?");
	int cols=Entrada.entero();
	int [][]m=GenerarMatriz(filas,cols);
	System.out.println("Segunda matriz, ¿Cuantas filas?");
	int filasdos=Entrada.entero();
	System.out.println("Columnas?");
	int colsdos=Entrada.entero();
	int [][]n=GenerarMatriz(filasdos,colsdos);
	System.out.println("Rellenando matriz...");
	rellenarMatriz(m);
	rellenarMatriz(n);
	mostrarMatriz(m);
	System.out.println("");
	mostrarMatriz(n);
	System.out.println("");
	System.out.println("Verificando si son de la misma dimension para realizar la suma y la resta...");
	if(VerificarDimension(filas,cols,filasdos,colsdos)) {
		System.out.println("");
		System.out.println("Son de mismas dimensiones procederemos a sumarlas");
		int [][]sumaMatriz=sumarMatriz(m,n,filas,cols);
		mostrarMatriz(sumaMatriz);
		System.out.println("");
		System.out.println("Son de mismas dimensiones procederemos con la resta");
		int[][]restaMatriz=restarMatriz(m,n,filas,cols);
		mostrarMatriz(restaMatriz);
	}
	else {
		System.out.println("");
		System.out.println("No son de la misma dimensión, no obstante podemos multiplicarlas");
	}
	System.out.println("");
	System.out.println("Para que dos matrices se puedan multiplicar deben seguir una condicion.");
	System.out.println("");
	System.out.println("El numero de columnas de la primera matriz debe ser igual al numero de filas de la segunda matriz, teniendo esto presente... ");
	System.out.println("");
	System.out.println("Verificando si se pueden multiplicar...");
	if(VerificarDimensionMult(filas,colsdos)) {
		System.out.println("");
		System.out.println("Cumple el requisito procederemos a multiplicarlas");
		System.out.println("");
		System.out.println("La matriz producto sera de una dimension distinta a la anterior con una peculiaridad y es que contara con las filas de la primera y las columnas de la segunda");
		System.out.println("");
		int [][]productoMatriz=multiplicarMatriz(m,n,filas,colsdos,cols);
		mostrarMatriz(productoMatriz);
	}
	else {
		System.out.println("");
		System.out.println("No cumplen los requisitos para la multiplicación, ¡se acabó!");
	}
	}

	private static int[][] multiplicarMatriz(int[][] m, int[][] n, int filas, int colsdos, int cols) {
		int [][]productoMatriz= new int [filas][colsdos];
		for (int i = 0; i < productoMatriz.length; i++) {
			for (int j = 0; j < productoMatriz[0].length; j++) {
				for (int k = 0; k < cols; k++) {
					productoMatriz[i][j]=m[i][k]*n[k][j];  //Hemos creado una tercera variable (k) para que esta busque las posiciones en la otra matriz
				}
				
			}
		}
		return productoMatriz;
	}

	private static boolean VerificarDimensionMult(int cols, int filasdos) {
		// Tenemos que pensar que una matriz en verdad es array de arrays
		// Hemos puesto que va a recibir filas y colsdos porque en verdad es asi
		return cols==filasdos;
	}

	private static int[][] restarMatriz(int[][] m, int[][] n, int filas, int cols) {
		int [][] restaMatriz = new int [filas][cols];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < cols ; j++) {
				restaMatriz[i][j]=m[i][j]-n[i][j];
			}
		}
		return restaMatriz;
	}

	private static int[][] sumarMatriz(int[][] m, int[][] n, int filas , int cols) {
		int [][]sumaMatriz = new int [filas][cols];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < cols ; j++) {
				sumaMatriz[i][j]=m[i][j]+n[i][j];
			}
		}
		return sumaMatriz;
	}

	private static boolean VerificarDimension(int filas, int cols, int filasdos, int colsdos) {
		//Numero de filas del primero igual al de filas del segundo
		//Numero de columnas del primero igual al de columnas del segundo
		return filas==filasdos && cols==colsdos;
	}

	private static void mostrarMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" "); //Se muestra el espacio para que se muestre mas cuadrada
			}
			System.out.println();//Salto de linea tras escribir una fila
		}
	}

	private static void rellenarMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				Random r=new Random();
				int azar=r.nextInt(9);
				m[i][j]=azar+1;
			}
		
		}
	}

	private static int[][] GenerarMatriz(int filas, int cols) {
		int [][]Matriz = new int [filas][cols]; 
		return Matriz;
	}

}
