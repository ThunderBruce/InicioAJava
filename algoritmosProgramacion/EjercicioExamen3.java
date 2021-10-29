package algoritmosProgramacion;

import java.util.Arrays;

public class EjercicioExamen3 {
	//Se desea un programa que, cuando introduzcas un numero lo muestre por pantalla como se lee
	//Son numeros desde el 1 al 999.
	public static void main(String[] args) {
	System.out.println("Introduzca un numero");
	int n= Entrada.entero();
	int numeroDigitos=numeroDigitos(n);
	int[]dig=extraerDigitos(n);
	System.out.println(numeroDigitos);
	System.out.println(Arrays.toString(dig));
	String texto=convertirNumeroEnTexto(n);
	
	System.out.println(texto);
	
	}
	private static String textoNumeroEspecial (int n) {
		String texto="";
		switch (n) {
		case 10: texto="diez";
		case 11: texto="once";
		case 12: texto="doce";
		case 13: texto="trece";
		case 14: texto="catorce";
		case 15: texto="quince";
			
			break;

		default: 
			break;
		}
		return texto;
	}

	private static String convertirNumeroEnTexto(int n) {
		//String []centena= {"ciento","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
		String texto="";
			if (n<0 ||n>999) {
				return "No se leer este numero";}
				else {
					int []dig=extraerDigitos(n);
					for (int i=0; i < dig.length+1; i++) {
						if (dig.length-i==3)
						texto=textoCentena(dig[dig.length-3]);
						if (dig.length-i==2) 
						texto=texto+ " " +textoDecena(dig[dig.length-2]);
						if (dig.length-i==1) {
						texto=texto+" y ";
						texto=texto+textoUnidad(dig[dig.length-1]);
					}
			}
		}
			
				return texto;
			}
		
	private static String textoUnidad(int uni) {
		
		String texto="";
		switch (uni) {
		case 0: texto="cero";
		break;
		case 1: texto="uno";
		break;
		case 2: texto="dos";
		break;
		case 3: texto="tres";
		break;
		case 4: texto="cuatro";
		break;
		case 5: texto="cinco";
		break;
		case 6: texto="seis";
		break;
		case 7: texto="siete";
		break;
		case 8: texto="ocho";
		break;
		case 9: texto="nueve";
		break;
		default: 
			break;
		}
		return texto;
	}

	private static String textoDecena(int dec) {
		
		String texto="";
		switch (dec) {
		case 1: texto="dieci";
		break;
		case 2: texto="veinti";
		break;
		case 3: texto="treinta";
		break;
		case 4: texto="cuarenta";
		break;
		case 5: texto="cincuenta";
		break;
		case 6: texto="sesenta";
		break;
		case 7: texto="setenta";
		break;
		case 8: texto="ochenta";
		break;
		case 9: texto="noventa";
		break;
		default: 
			break;
		}
		return texto;
	}

	private static String textoCentena (int cent) {
		String texto="";
		switch (cent) {
		case 1: texto="ciento";
		break;
		case 2: texto="doscientos";
		break;
		case 3: texto="trescientos";
		break;
		case 4: texto="cuatrocientos";
		break;
		case 5: texto="quinientos";
		break;
		case 6: texto="seiscientos";
		break;
		case 7: texto="setecientos";
		break;
		case 8: texto="ochocientos";
		break;
		case 9: texto="novecientos";
		break;
		default: 
			break;
		}
		return texto;
	}

	private static int numeroDigitos(int n) {
		int cnt=0;
		int cociente = n;
		do {
			cociente=cociente/10;
			cnt++;
		}while (cociente!=0);
		return cnt;
		}
	

	private static int[] extraerDigitos(int n) {
		int digitos[]=new int [numeroDigitos(n)];
		int cnt=0;
		int cociente=n;
		do {
			int digito=cociente%10;
			cociente=cociente/10;
			cnt++;
			digitos[digitos.length-cnt]=digito;
		}while(cociente!=0);
			return digitos;
		}
		
	}


