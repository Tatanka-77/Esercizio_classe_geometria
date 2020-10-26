package geometria.figurepiane;
import geometria.piano.Punto;
import geometria.piano.Retta;
import java.awt.geom.Line2D;

/**Classe che modella un quadrilatero */
public class Quadrilatero { 
	protected Punto[] vertici = new Punto[4];
	protected boolean valido = false;
	protected double lato01, lato12, lato23, lato30, diag1, diag2;
	
	
	/** Metodo che verifica se i punti formano un quadrilatero controllando che 3 punti non siano allineati e che i lati opposti non si intersechino
	 * @return boolean Vero se il quadrilatero è valido falso altrimenti */
	protected boolean verificaValidita() {
		if (Punto.sonoAllineati(this.vertici[0],this.vertici[1],this.vertici[2])
		 || Punto.sonoAllineati(this.vertici[0],this.vertici[1],this.vertici[3])
		 || Punto.sonoAllineati(this.vertici[0],this.vertici[2],this.vertici[3])
		 || Punto.sonoAllineati(this.vertici[1],this.vertici[2],this.vertici[3])) return false;
		if (Line2D.linesIntersect(this.vertici[0].getX(), this.vertici[0].getY(), 
					 this.vertici[1].getX(), this.vertici[1].getY(),
					 this.vertici[2].getX(), this.vertici[2].getY(),
					 this.vertici[3].getX(), this.vertici[3].getY())
		 || Line2D.linesIntersect(this.vertici[1].getX(), this.vertici[1].getY(),
					 this.vertici[2].getX(), this.vertici[2].getY(),
					 this.vertici[3].getX(), this.vertici[3].getY(),
					 this.vertici[0].getX(), this.vertici[0].getY())) return false;
		return true;
	}

	/**Metodo per leggere la variabile valido dell'oggetto
	 * @return boolean valore di this.valido */ 
	public boolean getValidita() {
		return this.valido;
	}

	/**Metodo per leggere la lunghezza della diagonale 1
	 * @return double Lunghezza della diagonale 1 */
	public double getDiag1() {
		return this.diag1;
	}

	/**Metodo per leggere la lunghezza della diagonale 2
	 * @return double Lunghezza della diagonale 2 */
	public double getDiag2() {
		return this.diag2;
	}
	
	
	/**Metodo che restituisce il perimetro di un quadrilatero valido, altrimenti NaN
	 * @return double Perimetro del quadrilatero se questo è valido altrimenti NaN */
	public double calcolaPerimetro () {
		if (this.valido == true) {
			return this.lato01 + this.lato12 + this.lato23 + this.lato30;
		}	
		else return Double.NaN;
	}
	/**Metodo che calcola l'area del quadrilatero dividendolo in due triangoli
	 * @return double Area del quadrilatero */
	public double calcolaArea () {
		if (this.valido == true) {
			double semiperimetro = (this.lato01 + this.lato12 + this.diag1)/2;
			double area1 =  Math.sqrt(semiperimetro * ( semiperimetro - this.lato01) * ( semiperimetro - this.lato12) * ( semiperimetro - this.diag1));
			semiperimetro = (this.diag1 + this.lato23 + this.lato30)/2;
			area1+=Math.sqrt(semiperimetro * ( semiperimetro - this.lato23) * ( semiperimetro - this.lato30) * ( semiperimetro - diag1));
			semiperimetro = (this.lato01 + this.diag2 + this.lato30)/2;
			double area2 =  Math.sqrt(semiperimetro * ( semiperimetro - this.lato01) * ( semiperimetro - this.lato30) * ( semiperimetro - this.diag2));
			semiperimetro = (this.lato12 + this.diag2 + this.lato23)/2;
			area2+=Math.sqrt(semiperimetro * ( semiperimetro - this.lato12) * ( semiperimetro - this.diag2) * ( semiperimetro - this.lato23));

			return Math.min(area1,area2);
		}
		return Double.NaN;
	}
			
	
	/**Costruttore della classe Quadrilatero.
	 * @param ax double ascissa del vertice 1
	 * @param ay double ordinata del vertice 1
	 * @param bx double ascissa del vertice 2
	 * @param by double ordinata del vertice 2
	 * @param cx double ascissa del vertice 3
	 * @param cy double ordinata del vertice 3
	 * @param dx double ascissa del vertice 4
	 * @param dy double ordinata del vertice 4 */ 
	public Quadrilatero(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		this.vertici[0] = new Punto(ax, ay);
		this.vertici[1] = new Punto(bx, by); 
		this.vertici[2] = new Punto(cx, cy);
		this.vertici[3] = new Punto(dx, dy);
		if (this.verificaValidita()) {
			this.valido = true;
			lato01 = Punto.calcolaModuloSegmento(this.vertici[0],this.vertici[1]);
			lato12 = Punto.calcolaModuloSegmento(this.vertici[1],this.vertici[2]);
			lato23 = Punto.calcolaModuloSegmento(this.vertici[2],this.vertici[3]);
			lato30 = Punto.calcolaModuloSegmento(this.vertici[3],this.vertici[0]);
			diag1 = Punto.calcolaModuloSegmento(this.vertici[0],this.vertici[2]);
			diag2 = Punto.calcolaModuloSegmento(this.vertici[1],this.vertici[3]);
		}
		else {
			for (int i = 0 ; i < 4 ; i++) { 
				this.vertici[i].impostaX(Double.NaN);
				this.vertici[i].impostaY(Double.NaN);
			}
			this.diag1=Double.NaN;
			this.diag2=Double.NaN;
		}
	}

	/** Metodo che restituisce una rappresentazione stampabile del quadrilatero
	 * @return String Rappresentazionde dell'oggetto */
	@Override public String toString() {
		if (this.valido == true) 	
	 		return String.format("Il quadrilatero di vertici %s %s %s %s ha perimetro %.2f e area %.2f", this.vertici[0].toString(),
			this.vertici[1].toString(), this.vertici[2].toString(), this.vertici[3].toString(),this.calcolaPerimetro(),this.calcolaArea());
		else return ("Quadrilatero non valido");
	}


}
	
