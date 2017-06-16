package tp2;

import tp1.Point;
import tp1.Rectangle;

public class CarreHeritage extends Rectangle {

	public CarreHeritage(Point p, int x1, int y1) {
		super(p, x1, y1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CarreHeritage [toString()=" + super.toString() + ", getType()=" + getType() + "]";
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		super.affiche();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CARRE";
	}

}
