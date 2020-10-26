package geometria.piano;
import java.lang.Math;

/** Classe che modella un punto del piano cartesiano */
public class Punto {
	private double x;
	private double y;

	/** Verifica se tre punti del piano cartesiano sono allineati tra loro
	 * @param a primo punto da verificare
	 * @param b secondo punto da verificare
	 * @param c terzo punto da verificare
	 * @return boolean True se i tre punti sono allineati altrimenti false */ 
	public static boolean sonoAllineati (Punto a, Punto b, Punto c) {
		if (((a.x == b.x) && (a.x == c.x)) || ((a.y == b.y) && (a.y == c.y))) return true;
		if (((c.y - a.y)/(b.y - a.y)) == ((c.x - a.x)/(b.x - a.x))) return true;
		return false;
	}

	/** Restituisce il modulo del segmento di estremi a e b 
	 * @param a Punto Estremo a del segmento
	 * @param b Punto Estremo b del segmento
	 * @return double Modulo del segmento */
	public static double calcolaModuloSegmento (Punto a, Punto b) {
		return Math.sqrt(Math.pow(a.x - b.x,2) + Math.pow(a.y - b.y,2));
	}	

	/**Costruttore che resituisce un punto posizionato all'origine degli assi */
	public Punto() {
		this(0,0);
	}

	/**Definisce un punto di coordinate (x,y) fornite come parametro
	 * @param x Ascissa del punto
	 * @param y Ordinata del punto */ 
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/** Metodo che fornisce una rappresentazione stampabile del punto */
	@Override public String toString () {
		return ("(" + this.x +"," + this.y +")");
	}

	/** Imposta la coordinata x del punto
	 * @param x double nuova coordinata x */
	public void impostaX(double x) {
		this.x = x;
	}

	/** Imposta la coordinata y del punto
	 * @param y double nuova coordinata y */
	public void impostaY(double y) {
		this.y = y;
	}

	/** Restituisce il valore di x del punto
	 * @return double valore di x */
	public double getX() {
		return this.x;
	}

	/** Restituisce il valore di y del punto
	 * @return double valore di y */
	public double getY() {
		return this.y;
	}
}
