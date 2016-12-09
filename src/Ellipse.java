/**
 * Definiert Ellipsen Objekte
 * @author jacob
 * @verison 1.1
 * @Aufgabe 4.1
 */
public class Ellipse extends FigMZLA {
	
	/**
	 * Konstruktor für Ellipsen-Objekte
	 * @param x X-Achsenposition
	 * @param y Y-Achsenposition
	 * @param z Z-Achsenposition
	 * @param a senkrechter Radius der Ellipse
	 * @param b waagerechter Radius der Ellipse
	 * figurenTyp wird auf "Ellipse" gesetzt
	 */
	public Ellipse(int x, int y, int z, int a, int b) {
		super(x, y, z, a, b);
		this.figurenTyp = "Ellipse";
	}

	/**
	 * Methode zur Berechnung der Ellipsenflaeche.
	 * Die zugehoerige abstrakte Methode liegt in FigMZLA.
	 * @return Flaeche der Ellipse
	 */
	public double berechneFlaeche() {
		return Math.PI * A * B;
	}
}