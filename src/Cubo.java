package geometria.figuresolide;
import geometria.figurepiane.Quadrato;
/** Classe che modella un cubo 
 * @see geometria.figurepiane.Quadrato */
public class Cubo {
	private Quadrato base;

	/** Costruisce un cubo di spigolo dato in ingresso
	 * @param spigolo double spigolo del cubo */
	public Cubo (double spigolo){
		this.base = new Quadrato(spigolo);
	}

	/** Costruisce un cubo di vertice unitario */
	public Cubo () {
		this(1);
	}

	/** Restituisce lo spigolo del cubo
	 * @return double Spigolo del cubo */
	public double getSpigolo() {
	       return this.base.getLato();
	}

	/** Restituisce la superficie di base del cubo
	 * @return double Superficie di base del cubo */
	public double calcolaSupBase() {
		return this.base.calcolaArea();
	}

	/** Restituisce il volume del cubo
	 * @return double volume del cubo */
	public double calcolaVolume() {
		return this.base.calcolaArea() * this.base.getLato();
	}

	/** Raddoppia lo spigolo del quadrato */
	public void raddoppiaSpigolo() {
		this.base.raddoppiaLato();
	}

}
