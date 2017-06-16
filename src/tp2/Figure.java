package tp2;

import tp1.Point;

public abstract class Figure {
	static int i;
	
	public abstract Figure getRandomFigure();
	public abstract String getType();
	protected abstract void affiche();
	public abstract Point[] getPoint();
	
	
	
}
