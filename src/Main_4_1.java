/**
 * Berechnet die Loesungen zur VOoP Aufgabe 4.1
 * 
 * @author jacob
 * @version 1.0
 * @aufgabe 4.1
 */
public class Main_4_1 {

	/**
	 * Beginn des Programms<br>
	 * <br>
	 * 5 Objekte mit Positions- und Laengenangaben initialisiert:<br>
	 * 
	 * Ausgaben:<br>
	 */
	public static void main(String[] args) {

		new Rechteck(5, 5, 3, 10, 20);
		new RWDreieck(30, 2, 4, 3, 4);
		new Ellipse(4, 10, 5, 10, 20);
		new Kreis(10, 10, 6, 5);
		new Quadrat(100, 200, -10, 35);
		
		for (Figur f : Figur.getAlleFiguren()) {
			System.out.println(f);
		}

	}

}
