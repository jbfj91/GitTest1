/**
 * Definiert Quadrat Objekte.
 * @author jacob
 * @verision 1.0
 * @Aufgabe 3.2
 */
public class Quadrat extends Rechteck {
	
	/**
	 * Konstruktor für Quadrat Objekte
	 * @param x X-Achenposition
	 * @param y Y-Achsenposition
	 * @param z Z-Achsenposition
	 * @param a Kantenlaenge
	 * "figurenTyp" wird auf "Quadrat" gesetzt
	 */
	public Quadrat(int x, int y, int z, int a) {
		super(x, y, z, a, a);
		this.figurenTyp = "Quadrat";
		
		//die Flaechenberechnung erfolgt in der Klasse Rechteck
	}
}
