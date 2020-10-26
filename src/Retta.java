package geometria.piano;
import geometria.piano.Punto;

public class Retta {
	public static double calcolaCoefAng (Punto a, Punto b) {
		if (a.getX() == b.getX()) return Double.NaN;
		else if (a.getY() == b.getY()) return 0.0;
		return (b.getY() - a.getY())/(b.getX() - a.getX());
	}
}


	
