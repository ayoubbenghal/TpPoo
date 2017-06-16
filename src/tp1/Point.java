package tp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import tp2.Figure;

public class Point extends Figure {
	private int x, y;
	private Point[] points;
	private Collection<Point> pointsCollection;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.points = new Point[1];
		this.pointsCollection = new ArrayList<>();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}

	public boolean isEgal(Point point) {
		if (this.x == point.getX() && this.y == point.getY())
			return true;
		else
			return false;
	}

	@Override
	public Figure getRandomFigure() {
		Random rd = new Random();
		// TODO Auto-generated method stub
		return new Point(rd.nextInt(), rd.nextInt());
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "POINT";
	}

	@Override
	public void affiche() {
		System.out.println(this.toString());
		// TODO Auto-generated method stub

	}

	@Override
	public Point[] getPoint() {
		this.points[0] = this;
		return points;
	}

	@Override
	public Collection<Point> getPointsCollection() {
		pointsCollection.add(this);
		// TODO Auto-generated method stub
		return pointsCollection;
	}

	@Override
	public boolean couvre(Point p) {

		// TODO Auto-generated method stub
		return p.isEgal(this);
	}

	@Override
	protected boolean estEgal(Figure figure) {
		if(figure instanceof Point){
			Point point=(Point)figure;
			if(this.getX()==point.getX() && this.getY()==point.getY())
				return true;
			else return false;
		}
		
		// TODO Auto-generated method stub
		return false;
	}

}
