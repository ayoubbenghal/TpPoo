package tp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import tp2.Carre;
import tp2.Figure;
import tp2.Surfacable;

public class Rectangle extends Figure implements Surfacable {
	private Point p;
	private int x1, y1;
	private Point[] points;
	private Collection<Point> pointsCollection;

	public Rectangle(Point p, int x1, int y1) {
		this.p = p;
		this.x1 = x1;
		this.y1 = y1;
		this.points = new Point[4];
		this.pointsCollection = new ArrayList<>();
		/*
		 * for (int i = 0; i < points.length; i++)
		 * this.pointsCollection.add(points[i]);
		 */

	}

	public Point getP() {
		return p;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public Point getPointBasGauche() {
		if (this.x1 < 0 && this.y1 < 0)
			return new Point(this.x1 + p.getX(), this.y1 + p.getY());
		else if (this.x1 < 0)
			return new Point(this.x1 + p.getX(), p.getY());
		else if (this.y1 < 0)
			return new Point(p.getX(), p.getY() + this.y1);
		return p;

	}

	public Point getPointBasDroit() {
		if (this.x1 < 0 && this.y1 < 0)
			return new Point(p.getX(), this.y1 + p.getY());
		else if (this.x1 < 0)
			return p;
		else if (this.y1 < 0)
			return new Point(p.getX() + this.x1, p.getY() + this.y1);
		return new Point(p.getX() + this.x1, p.getY());

	}

	public Point getPointHautDroit() {
		if (this.x1 < 0 && this.y1 < 0)
			return p;
		else if (this.x1 < 0)
			return new Point(p.getX(), p.getY() + this.y1);
		else if (this.y1 < 0)
			return new Point(p.getX() + this.x1, p.getY());
		return new Point(p.getX() + this.x1, p.getY() + this.y1);
	}

	public Point getPointHautGauche() {
		if (this.x1 < 0 && this.y1 < 0)
			return new Point(this.x1 + p.getX(), p.getY());
		else if (this.x1 < 0)
			return new Point(this.x1 + p.getX(), p.getY() + this.y1);
		else if (this.y1 < 0)
			return p;
		return new Point(p.getX(), p.getY() + this.y1);
	}

	@Override
	public String toString() {
		return "Rectangle [" + getPointBasGauche().toString() + getPointBasDroit().toString()
				+ getPointHautGauche().toString() + getPointHautDroit().toString() + "]";
	}

	public void affiche() {
		System.out.println(this.toString());
	}

	public String getType() {
		return "RECTANGLE";
	}

	@Override
	public Figure getRandomFigure() {
		Random rd = new Random();
		// TODO Auto-generated method stub
		return new Rectangle(new Point(rd.nextInt(), rd.nextInt()), rd.nextInt(), rd.nextInt());
	}

	@Override
	public double surface() {

		// TODO Auto-generated method stub
		return Math.abs(this.x1 * this.y1);
	}

	@Override
	public Point[] getPoint() {
		this.points[0] = getPointBasDroit();
		this.points[1] = getPointBasGauche();
		this.points[2] = getPointHautDroit();
		this.points[3] = getPointHautGauche();
		// TODO Auto-generated method stub
		return points;
	}

	@Override
	public Collection<Point> getPointsCollection() {
		this.pointsCollection.add(getPointBasDroit());
		this.pointsCollection.add(getPointBasGauche());
		this.pointsCollection.add(getPointHautDroit());
		this.pointsCollection.add(getPointHautGauche());
		// TODO Auto-generated method stub
		return pointsCollection;
	}

	public boolean isBetweenX(Point p0, Point p1, Point p2) {
		/*
		 * if(p1.equals(p0) || p2.isEgal(p0)) return true;
		 * 
		 * 
		 * else
		 */
		if (p0.getX() < p2.getX() && p0.getX() > p1.getX())
			return true;
		else
			return false;

	}

	public boolean isBetweenY(Point p0, Point p1, Point p2) {
		if (p0.getY() < p2.getY() && p0.getY() > p1.getY())
			return true;
		else
			return false;
	}

	@Override
	public boolean couvre(Point p) {
		if (p.isEgal(getPointBasDroit()) || p.isEgal(getPointBasGauche()) || p.isEgal(getPointHautDroit())
				|| p.isEgal(getPointHautGauche()))
			return true;
		if (isBetweenX(p, getPointBasGauche(), getPointBasDroit())
				&& isBetweenY(p, getPointBasGauche(), getPointHautGauche()))
			return true;

		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean estEgal(Figure figure) {
		boolean b = false;
		if (figure instanceof Carre) {
			Carre c = (Carre) figure;
			if (this.getP().estEgal(c.getP()) && this.x1 == c.getX() && this.y1 == c.getX())
				return true;
			/*
			 * for (int i = 0; i < c.getPoint().length; i++) {
			 * if(this.getPoint()[i]!=c.getPoint()[i]) b=false; else return
			 * true; }
			 */
			else
				b = false;
		} else if (figure instanceof Rectangle) {
			Rectangle rect = (Rectangle) figure;
			if (this.p.estEgal(rect.getP()) && this.x1 == rect.getX1() && this.y1 == rect.y1)
				return true;
			/*
			 * for (int i = 0; i < rect.getPoint().length; i++) {
			 * if(this.getPoint()[i]!=rect.getPoint()[i]) b=false; else return
			 * true; }
			 */
			else
				return false;

		}
		return b;

		// TODO Auto-generated method stub
	}

	@Override
	public double distanceOrigine() {
		/*
		 * Collection<Double>distances=new ArrayList<>();
		 * distances.add(getPointBasDroit().distanceOrigine());
		 * distances.add(getPointBasGauche().distanceOrigine());
		 * distances.add(getPointHautDroit().distanceOrigine());
		 * distances.add(getPointHautGauche().distanceOrigine()); double min;
		 * Iterator<Double>
		 */

		double distances[] = new double[4];
		distances[0] = getPointBasDroit().distanceOrigine();
		distances[1] = getPointBasGauche().distanceOrigine();
		distances[2] = getPointHautDroit().distanceOrigine();
		distances[3] = getPointHautGauche().distanceOrigine();
		double min = 0;

		for (int i = 0; i < distances.length; i++) {
			for (int j = 1; j < distances.length; j++) {
				if (distances[i] < distances[j]) {
					min = distances[i];

				} else {
					min = distances[j];
					i = j;
				}

			}
		}
		// TODO Auto-generated method stub
		return min;
	}

}
