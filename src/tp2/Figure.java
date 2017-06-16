package tp2;

import java.util.Collection;

import tp1.Point;

public abstract class Figure {
	static int i;
	
	public abstract Figure getRandomFigure();
	public abstract String getType();
	protected abstract void affiche();
	public abstract Point[] getPoint();
	public abstract Collection<Point>getPointsCollection();
	public abstract boolean couvre(Point p);
	protected abstract boolean estEgal(Figure figure);
	
	
	
}
