package geometria.figurepiane;

/** Classe per modellare un quadrato, non usatelo per farlo rotolare */
public class Quadrato {
	private double lato;

	/**Costruisce un quadrato di lato passato come parametro
	 * @param lato double lato del quadrato double */
	public Quadrato(double lato) {
		this.lato = lato;
	}

	/**Costruisce un quadrato di lato unitario */
	public Quadrato() {
		this(1);
	}

	/** Restituisce il lato del quadrato 
	 * @return double lato del quadrato */
	public double getLato() {
		return this.lato;
	}

	/** Restituisce l'area del quadrato 
	* @return double Area del quadrato */
	public double calcolaArea() {
		return (this.lato * this.lato);
	}

	/** Raddoppia il lato del quadrato */
	public void raddoppiaLato() {
		this.lato += this.lato;
	}
}

	
