package algoritmosProgramacion;

public class Persona {
		// Atributos 
		String dni;
		public Persona(String dni, String nombre, String apellido, int edad, boolean gafas) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.gafas = gafas;
		}
		public Persona() {
			//Como vemos no hace falta poner de nuevo el nombre de los atributos ya que con this estamos llamando desde este constructor al anterior
		this("1K","Pepe","Lopez",30,false);
		}
		public Persona(String dni) {
		this(dni,"","",1,false);
		}
		public Persona(boolean b) {
		this("7668313","Bruce","Ramirez",20,b);
		}
		String nombre;
		String apellido;
		int edad;
		boolean gafas;    //True si tiene gafas, false si no tiene
		// Atributos
	public static void main(String[] args) {
		Persona p1= new Persona ("303K");
//		p1.setDni("1A");
//		p1.setNombre("Julia");
//		p1.setApellido("Gutierrez");
//		p1.setEdad(38);
//		p1.setGafas(true);
		Persona p2= new Persona ("1K","Pepe","Lopez",30,false);
//		p2.setDni("2B");
//		p2.setNombre("Antonia");
//		p2.setApellido("Lopez");
//		p2.setEdad(41);
//		p2.setGafas(false);
		Persona p3= new Persona ();
		p3.setDni("334HK");
		p3.setNombre("Ramon");
		p3.setApellido("Perez");
		p3.setEdad(27);
		p3.setGafas(false);
		Persona p4 = new Persona ();
		Persona p5 = new Persona (true);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
	@Override
	public String toString() {
		String T ="Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ";
			if (gafas) {
			T= T + "Lleva gafas]";
			} else {
					T= T + "No lleva gafas]";
		}
		return T;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isGafas() {
		return gafas;
	}
	public void setGafas(boolean gafas) {
		this.gafas = gafas;
	}

}
