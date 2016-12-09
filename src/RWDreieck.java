/**
 * Definiert RW(rechtwinklige)Dreieck Objekte.
 * @author jacob
 * @version 1.1
 * @Aufgabe 4.1
 */
public class RWDreieck extends FigMZLA {

	/**
	 *  Konstruktor für Rechteck Objekte.
	 * @param x X-Achenposition
	 * @param y Y-Achsenposition
	 * @param z Z-Achsenposition
	 * @param a Kantenlaenge senkrecht
	 * @param b Kantenlaenge waagerecht
	 * figurenTyp wird auf "RWDreieck" gesetzt
	 */
	public RWDreieck(int x, int y, int z, int a, int b) {
		super(x, y, z, a, b);
		this.figurenTyp = "RWDreieck";
	}

	/**
	 * Methode zur Berechnung der Recheckflaeche.
	 * Die zugehoerige abstrakte Methode liegt in FigMZLA.
	 * @return Flaeche des RWDechtecks
	 */
	public double berechneFlaeche() {
		return A * B / 2.0;
	}
}
