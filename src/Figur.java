import java.util.LinkedList;
import java.util.List;

/**
 * Definiert Objekte mit x,y und z Achsenposition.
 * 
 * @author jacob
 * @version 1.1
 * @aufgabe 4.1
 */
public class Figur {

	/**
	 * Datenfelder der Klasse Figur
	 */
	protected int X = 0;
	protected int Y = 0;
	protected int Z = 0;

	// statische Datenfelder

	private static List<Figur> figuren = new LinkedList<Figur>();

	/**
	 * Konstruktor zum Erstellen eines Objekts der Klasse Figur.
	 * 
	 * @param x
	 *            X-Achsenposition
	 * @param y
	 *            Y-Achsenposition
	 * @param z
	 *            Z-Achsenposition
	 */
	public Figur(int x, int y, int z) {
		this.X = x;
		this.Y = y;
		this.Z = z;
		Figur.figuren.add(this);
		// fuegt akt. Objekt der Liste figuren hinzu, die für die Ausgabe
		// aufgerufen wird.
	}

	/**
	 * Gibt alle in der Liste figuren vorh. Figuren in einer Liste wieder
	 * 
	 * @return Liste aller Figuren
	 */
	public static final List<Figur> getAlleFiguren() {

		return Figur.figuren;
	}

	/**
	 * Methode zur Berechnung der Gesamtflaeche aller Objekte
	 * 
	 * @return Gesamtflaeche der Figuren
	 */
	public static final double gesamtFlaeche() {
		double res = 0;

		for (Figur f : Figur.getAlleFiguren()) {
			res += ((FigMZLA) f).berechneFlaeche();
			// Expliziter Cast für f muss eingebaut werden
		}

		return res;
	}
	
	/**
	 * Gibt die Anzahl der Objekte in der Liste figuren wieder.
	 * 
	 * @return Anzahl Objekte in "figuren"
	 */
	public static final int anzFiguren() {
		return Figur.figuren.size();
	}

	/**
	 * Methode zur Berechnung der Durchschnittsobjektflaeche
	 * 
	 * @return Durchschnittsfläche der Figuren
	 */
	public static final double durchschnittFlaeche() {
		double res = 0;

		res += gesamtFlaeche();
		res /= Figur.anzFiguren();
		return res;
	}
}
