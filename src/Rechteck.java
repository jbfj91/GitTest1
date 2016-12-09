/**
 * Definiert Rechteck Objekte.
 * @author jacob
 * @version 1.0
 * @Aufgabe 3.2
 */
public class Rechteck extends FigMZLA  {

	/**
	 * Konstruktor für Rechteck-Objekte. 
	 * @param x X-Achenposition
	 * @param y Y-Achsenposition
	 * @param z Z-Achsenposition
	 * @param a Kantenlaenge senkrecht
	 * @param b  Kantenlaenge waagerecht
	 * figurenTyp wird auf "Rechteck" gesetzt
	 */
	public Rechteck(int x, int y,int z, int a, int b) {
		super(x, y, z, a, b);
		this.figurenTyp = "Rechteck";
	}

	/**
	 * Methode zur Berechnung der Rechteckfläche.
	 * Die zugehoerige abstrakte Methode liegt in FigMZLA.
	 * @return Flaeche des Rechtecks
	 */
	public double berechneFlaeche() {
		return A * B;
	}
}
