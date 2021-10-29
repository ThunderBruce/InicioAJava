package algoritmosProgramacion;

public class ConvetirDeGrados {

	public static void main(String[] args) {

		System.out.println("Introduce la temperatura");
                
                double Celsius = Entrada.real();

		System.out.println("Fahrenheit: "+ConvertirAFahrenheit(Celsius));
		System.out.println("Reamur: "+ConvertirAReamur(Celsius));
		System.out.println("Kelvin: "+ConvertirAKelvin(Celsius));

	}

	static private double ConvertirAFahrenheit(double Celsius) {
		return (1.8 * Celsius) + 32.0;
	}

	static private double ConvertirAReamur(double Celsius) {
		return 0.8 * Celsius;
	}

	static private double ConvertirAKelvin(double Celsius) {
		return Celsius + 273.0;
	}

}
