package algoritmosProgramacion;

public class Punto {
		double x;
		double y;
	

	public Punto(double x, double y) {
			this.x=x;
			this.y=y;
		}
	public Punto() {
		this(0,0);
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}
