package geometria.figurepiane;
import geometria.piano.Punto;
import geometria.piano.Retta;

/**Classe che modella un parallelogramma */
public class Parallelogramma extends Trapezio { 
		
	/** Metodo che verifica se i punti formano un parallelogramma controllando che sia un trapezio e che gli altri due lati siano paralleli
	 * @return boolean Vero se il parallelogramma è valido falso altrimenti */
	@Override protected boolean verificaValidita() {
		if (super.verificaValidita() == false) return false;
		if (this.base01==true) {
			if ((this.m12 == this.m30) || (Double.isNaN(this.m12) && Double.isNaN(this.m30))) return true;
		}
		else {
			if ((this.m01 == this.m23) || (Double.isNaN(this.m01) && Double.isNaN(this.m23))) return true;
		}
		return false;	
	}
	
	/**Costruttore della classe Parallelogramma.
	 * @param ax double ascissa del vertice 1
	 * @param ay double ordinata del vertice 1
	 * @param bx double ascissa del vertice 2
	 * @param by double ordinata del vertice 2
	 * @param cx double ascissa del vertice 3
	 * @param cy double ordinata del vertice 3
	 * @param dx double ascissa del vertice 4
	 * @param dy double ordinata del vertice 4 */ 
	public Parallelogramma(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		super(ax, ay, bx, by, cx, cy, dx, dy);
		if (!this.verificaValidita()) {
			this.valido = false;
		for (int i = 0 ; i < 4 ; i++) { 
			this.vertici[i].impostaX(Double.NaN);
			this.vertici[i].impostaY(Double.NaN);
			}
		}
	}

	/** Metodo che restituisce una rappresentazione stampabile del Parallelogramma
	 * @return String Rappresentazionde dell'oggetto */
	@Override public String toString() {
		if (this.valido == true) 	
	 		return String.format("Il parallelogramma di vertici %s %s %s %s ha perimetro %.2f e area %.2f", this.vertici[0].toString(),
			this.vertici[1].toString(), this.vertici[2].toString(), this.vertici[3].toString(),this.calcolaPerimetro(),this.calcolaArea());
		else return ("Parallelogramma non valido");
	}
}
