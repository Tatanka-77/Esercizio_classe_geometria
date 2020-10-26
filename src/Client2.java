import geometria.figurepiane.Quadrilatero;
import geometria.figurepiane.Trapezio;
import geometria.figurepiane.Parallelogramma;
import geometria.figurepiane.Rettangolo;
import geometria.figurepiane.Quadrato;

public class Client2 {
	public static void main (String[] args) {
		Quadrilatero prova = new Quadrilatero (0, 0, 1, 0, 1, 1, 0, 1);
		Quadrilatero prova2 = new Quadrilatero (0, 0, 2, 0, 2, 2, 0, 2);
		Trapezio prova3 = new Trapezio (0, 0, 4, 0, 3, 1, 1, 1);
		Trapezio prova4 = new Trapezio (0, 0, 1, 1, 1, 3, 0, 4);
		Parallelogramma prova5 = new Parallelogramma (0, 0, 4, 0, 3, 1, 1, 1);
		Parallelogramma prova6 = new Parallelogramma (0, 0, 4, 0, 5, 1, 1, 1);
		Rettangolo  prova7 = new Rettangolo (0, 0, 4, 0, 3, 1, 1, 1);
		Rettangolo  prova8 = new Rettangolo (0, 0, 4, 0, 4, 2, 0, 2);
		Quadrato prova9 = new Quadrato (0, 0, 5, 0, 5, 5, 0, 5);
		Quadrato prova10 = new Quadrato (0, 0, 1, 0, 1, 1, 0, 1);
		Quadrato  prova11 = new Quadrato (0, 0, 4, 0, 4, 2, 0, 2);
		System.out.println (prova.toString());
		System.out.println (prova2.toString());
		System.out.println (prova3.toString());
		System.out.println (prova4.toString());
		System.out.println (prova5.toString());
		System.out.println (prova6.toString());
		System.out.println (prova7.toString());
		System.out.println (prova8.toString());
		System.out.println (prova9.toString());
		System.out.println (prova10.toString());
		System.out.println (prova11.toString());
	}
}
