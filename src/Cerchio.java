package geometria.figurepiane;
/** La classe Cerchio consente di definire un cerchio e calcolarne l'area
 */
	public class Cerchio {
	final static double PI_GRECO = 3.14159;
	private double raggio;
	
	/** Costruisce un cerchio col raggio ricevuto come parametro
	 *  @param raggio double raggio del cerchio */
	public Cerchio (double raggio) {
		this.raggio=raggio;
	}

	/** Costruisce un cerchio di raggio unitario */
	public Cerchio () {
		this(1d);
	}

	/** Restituisce il raggio del cerchio
	 * @return double Raggio del cerchio */
	public double getRaggio() {
		return (this.raggio);
	}

	/** Restituisce l'area del cerchio
	 * @return double Area del cerchio */
	public double calcolaArea() {
		return (this.raggio * this.raggio * PI_GRECO);
	}	
}
			
