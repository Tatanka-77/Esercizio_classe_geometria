package geometria.figurepiane;
import geometria.piano.Punto;
import geometria.piano.Retta;

/**Classe che modella un quadrato */
public class Quadrato extends Rettangolo { 
		
	/** Metodo che verifica se i punti formano un rettangolo controllando che sia un parallelepipedo e che lati adiacenti siano perpendicolari
	 * @return boolean Vero se il trapezio è valido falso altrimenti */
	@Override protected boolean verificaValidita() {
		if (super.verificaValidita() == false) return false;
		if (this.lato01==this.lato12) return true;
		return false;
	}
	
	/**Costruttore della classe Rettangolo.
	 * @param ax double ascissa del vertice 1
	 * @param ay double ordinata del vertice 1
	 * @param bx double ascissa del vertice 2
	 * @param by double ordinata del vertice 2
	 * @param cx double ascissa del vertice 3
	 * @param cy double ordinata del vertice 3
	 * @param dx double ascissa del vertice 4
	 * @param dy double ordinata del vertice 4 */ 
	public Quadrato (double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		super(ax, ay, bx, by, cx, cy, dx, dy);
		if (!this.verificaValidita()) {
			this.valido = false;
		for (int i = 0 ; i < 4 ; i++) { 
			this.vertici[i].impostaX(Double.NaN);
			this.vertici[i].impostaY(Double.NaN);
			}
		}
	}
	
	/** Metodo che restituisce una rappresentazione stampabile del quadrato
	 * @return String Rappresentazionde dell'oggetto */
	@Override public String toString() {
		if (this.valido == true) 	
	 		return String.format("Il quadrato di vertici %s %s %s %s ha perimetro %.2f e area %.2f", this.vertici[0].toString(),
			this.vertici[1].toString(), this.vertici[2].toString(), this.vertici[3].toString(),this.calcolaPerimetro(),this.calcolaArea());
		else return ("Quadrato non valido");
	}
}
