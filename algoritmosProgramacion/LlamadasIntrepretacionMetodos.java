package algoritmosProgramacion;

import solucionesClase.Entrada;

public class LlamadasIntrepretacionMetodos {

	public static void main(String[] args) {
		//Primer Metodo "length"
		String b=Entrada.cadena();
		String c="acidodesoxiribonucleico";
		int n=b.length();
		System.out.println(n);
		//Segundo Metodo "charAt"
		char PalabraDividida=b.charAt(2);  //Recordemos que empieza por la posicion 0
		System.out.println(PalabraDividida);
		//Tercer Metodo "subString"
		String tercerMetodo=b.substring(5); //Este metodo nos devuelve una la palabra que ha sido dividida desde una posicion 
											//introducida hasta el final de la palabra
		System.out.println(tercerMetodo);
		//Cuarto Metodo "substring" distinto
		String cuartoMetodo=b.substring(5,11); //Hace lo mismo que el anterior pero pones un limite final de la palabra
		System.out.println(cuartoMetodo);
		//Quinto Metodo "equals"
		if (b.equals(c)) { //Puedes introducir un string o un char, un int, al final y al cabo se puede introducir un objeto
						   //Lo que incluye todo lo anterior mencionado
			System.out.println("Es del mismo tamaño");
		}
		else {
			System.out.println("No es del mismo tamaño");
		}
		//Sexto Metodo "compareTo"
		int sextoMetodo=b.compareTo(c); //Segun entendi compara dos String, si son del mismo tamaño devuelve un 0, si es menor
										//devuelve un numero negativo y si es mayor un numero positivo (se puede utilizar 
										// incluso como parte de una condicion, es decir si ese valor es mayor que 0 haz esto.
		System.out.println(sextoMetodo);
		//Septimo Metodo "replace"
		String septimoMetodo="capullo";
		String septimoMetodoDos=septimoMetodo.replace("cap","org"); //Puedes cambiar una parte de la palabra (por eso es un char)
		//y sustituirla por otro definido
		System.out.println(septimoMetodoDos);
		septimoMetodoDos=septimoMetodoDos.replaceAll("o","a"); //En este caso cambiar todo los char que la contengan y las cambia
		System.out.println(septimoMetodoDos);
		//Octavo Metodo "toLowerCase"
		String octavoMetodo="PRINGAO";
		String octavoMetodoDos=octavoMetodo.toLowerCase(); //Lo unico que hace es poner los caracteres en mayuscula a minuscula
		System.out.println(octavoMetodoDos);
		//Noveno Metodo "toUpperCase"
		String novenoMetodo="pringao";
		String novenoMetodoDos=novenoMetodo.toUpperCase(); //Hace lo mismo que la anterior pero de manera inversa
		System.out.println(novenoMetodoDos);
		//Decimo Metodo "trim"
		String DecimoMetodo="        amigdalas        "; //Quita los espacios en blanco no obstante los espacios entre medias
		String DecimoMetodoDos=DecimoMetodo.trim();      //de las letras no las quita
		System.out.println(DecimoMetodo);
		System.out.println(DecimoMetodoDos);
		//Undecimo Metodo "indexOf"
		int UndecimoMetodo=c.indexOf("a");
		System.out.println(UndecimoMetodo);
	}

}
