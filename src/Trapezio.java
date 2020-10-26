package geometria.figurepiane;
import geometria.piano.Retta;

/**Classe che modella un trapezio */
public class Trapezio extends Quadrilatero { 
	boolean base01 = false;
	double m01;
	double m12;
	double m23;
	double m30;
	
	
	/** Metodo che verifica se i punti formano un trapezio controllando che sia un quadrilatero e che due lati siano paralleli
	 * @return boolean Vero se il trapezio è valido falso altrimenti */
	@Override protected boolean verificaValidita() {
		if (super.verificaValidita() == false) return false;
		this.m01 = Retta.calcolaCoefAng(this.vertici[0],this.vertici[1]);
		this.m12 = Retta.calcolaCoefAng(this.vertici[1],this.vertici[2]);
		this.m23 = Retta.calcolaCoefAng(this.vertici[2],this.vertici[3]);
		this.m30 = Retta.calcolaCoefAng(this.vertici[3],this.vertici[0]);
		this.base01 = (m01 == m23) || (Double.isNaN(m01) && Double.isNaN(m23));
		if (this.base01 || (m12 == m30) || (Double.isNaN(m12) && Double.isNaN(m30))) return true;
		return false;	
	}

			
	
	 /**Costruttore della classe Trapezio.
	 * @param ax double ascissa del vertice 1
	 * @param ay double ordinata del vertice 1
	 * @param bx double ascissa del vertice 2
	 * @param by double ordinata del vertice 2
	 * @param cx double ascissa del vertice 3
	 * @param cy double ordinata del vertice 3
	 * @param dx double ascissa del vertice 4
	 * @param dy double ordinata del vertice 4 */ 
	public Trapezio(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		super(ax, ay, bx, by, cx, cy, dx, dy);
		if (!this.verificaValidita()) {
			this.valido = false;
			for (int i = 0 ; i < 4 ; i++) { 
				this.vertici[i].impostaX(Double.NaN);
				this.vertici[i].impostaY(Double.NaN);
			}
			this.diag1=Double.NaN;
			this.diag2=Double.NaN;
		}
	}

	
	
	/** Metodo che restituisce una rappresentazione stampabile del trapezio
	 * @return String Rappresentazionde dell'oggetto */
	@Override public String toString() {
		if (this.valido == true) 	
	 		return String.format("Il trapezio di vertici %s %s %s %s ha perimetro %.2f e area %.2f", this.vertici[0].toString(),
			this.vertici[1].toString(), this.vertici[2].toString(), this.vertici[3].toString(),this.calcolaPerimetro(),this.calcolaArea());
		else return ("Trapezio non valido");
	}
}
