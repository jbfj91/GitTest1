/**
 * Definiert FigMZLA Objekte (Figuren mit zwei Laengeneinheiten).
 * 
 * @author jacob
 * @version 1.1
 * @aufgabe 4.1
 */
abstract class FigMZLA extends Figur {

	/**
	 * Datenfelder der Klasse FigMZLA
	 */
	protected int A = 0;
	protected int B = 0;
	protected String figurenTyp = "";

	/**
	 * Konstruktor zum Erstellen eines Objekts der Klasse FigMZLA.
	 * 
	 * @param x X-Achsenposition
	 * @param y Y-Achsenposition
	 * @param z Z-Achsenposition
	 * @param a  Laenge 1
	 * @param b  Laenge 2
	 */
	public FigMZLA(int x, int y, int z, int a, int b) {
		super(x, y, z);
		this.A = a;
		this.B = b;
	}

	// weitere Methoden

	/**
	 * abstrakte Methode, die die Flaechenberechnung vorbereitet
	 * 
	 * @return Wert des Typs double
	 */
	public abstract double berechneFlaeche();

	/**
	 * toString (Damit Inhalte und nicht die Speicherstelle ausgeg. werden) für
	 * FigMZLA Objekte.
	 */
	public String toString() {

		return this.figurenTyp + " an Position (" + this.X + ", " + this.Y
				+ ", " + this.Z + ") mit einer Fläche von " + this.berechneFlaeche()
				+ " Flächeneinheiten";
	}
}
