import geometria.figurepiane.Cerchio;
import geometria.figurepiane.Quadrato;
import geometria.figuresolide.Cubo;

public class Client {
	public static void main (String args[]) {
		Cerchio cerchio = new Cerchio(Double.parseDouble(args[0]));
		Cerchio cerchioUnitario = new Cerchio();
		System.out.println("Il cerchio di raggio " + cerchio.getRaggio() + " ha un area di " + cerchio.calcolaArea());
		System.out.println("Il cerchio di raggio " + cerchioUnitario.getRaggio() + " ha un area di " + cerchioUnitario.calcolaArea());
		Quadrato quadrato = new Quadrato(Double.parseDouble(args[1]));
		Quadrato quadratoUnitario = new Quadrato(1d);
		System.out.println("il quadrato di lato " + quadrato.getLato() + " ha un area di " + quadrato.calcolaArea());
		quadrato.raddoppiaLato();
		System.out.println("Lo stesso quadrato ora ha lato " + quadrato.getLato() + " ed ha un area di " + quadrato.calcolaArea());
		System.out.println("il quadrato di lato " + quadratoUnitario.getLato() + " ha un area di " + quadratoUnitario.calcolaArea());
		Cubo cubo = new Cubo(Double.parseDouble(args[2]));
		Cubo cuboUnitario = new Cubo();
		System.out.println("Il cubo di spigolo " + cubo.getSpigolo() + " ha una superficie di base di " + cubo.calcolaSupBase() + " ed un volume di " + cubo.calcolaVolume());
		cubo.raddoppiaSpigolo();
		System.out.println("Lo stesso cubo ora ha spigolo " + cubo.getSpigolo() + " , una superficie di base di " + cubo.calcolaSupBase() + " ed un volume di " + cubo.calcolaVolume());
		System.out.println("Il cubo di spigolo " + cuboUnitario.getSpigolo() + " ha una superficie di base di " + cuboUnitario.calcolaSupBase() + " ed un volume di " + cuboUnitario.calcolaVolume());
	}
}
