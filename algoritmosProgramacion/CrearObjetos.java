package algoritmosProgramacion;

public class CrearObjetos {

	public static void main(String[] args) {
		//Como vemos podemos hacer referencia a cualquier objeto siempre y cuando esté dentro del paquete en el que ha sido creada
		//No obstante supongo que podemos hacer referencia a otros objetos que esten en paquetes diferentes siempre y cuando hagamos referencia al
		//nombre del paquete del cual queremos hacer la referencia a ese objeto
		//Pongamos un ejemplo en estos comentarios. Imaginemos que el objeto Persona haya sido creado en el paquete solucionesClase
		//Entonces con estos datos podriamos hacer lo siguiente
		//Import solucionesClases
		//Persona p = solucionesClases. new Persona     			NO OBSTANTE PREGUNTAR EN CLASE EL DIA SIGUIENTE
		Persona p=new Persona ();
		System.out.println(p);
		p.setNombre("Carlos");
		System.out.println(p);
		Persona cualquierPersona=new Persona (true);
		System.out.println(cualquierPersona);
		cualquierPersona.setGafas(false);
		System.out.println(cualquierPersona);
	}

}
