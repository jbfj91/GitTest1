/**
 * Definiert Kreis Objekte. 
 * @author jacob
 * @version 1.0
 * @Aufgabe 3.2
 * 
 */
public class Kreis extends Ellipse {

	/**
	 * Konstruktor für Kreis Objekte
	 * 
	 * @param x X-Achenposition
	 * @param y Y-Achsenposition
	 * @param z Z-Achsenposition
	 * @param r Radius des Kreises
	 * figurenTyp wird auf "Kreis" gesetzt
	 */
	public Kreis(int x, int y, int z, int r) {
		super(x, y, z, r, r);
		this.figurenTyp = "Kreis";
		
		//die Flaechenberechnung erfolgt in der Klasse Ellipse
	}
}
