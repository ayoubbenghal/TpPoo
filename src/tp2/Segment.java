package tp2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import tp1.Point;

public class Segment extends Figure {
	Point pointDebut;
	int longueur;
	boolean horizontal;
	private Point[] points;
	private Collection<Point> pointCollection;

	public Segment() {
		this.points = new Point[2];
		this.pointCollection = new ArrayList<>();

	}

	public Segment(Point pointDebut, int longueur, boolean horizontal) {
		this.pointDebut = pointDebut;
		this.longueur = longueur;
		this.horizontal = horizontal;
		this.points = new Point[2];
		this.pointCollection = new ArrayList<>();
	}

	public Point getPointDebut() {
		return pointDebut;
	}

	public int getLongueur() {
		return longueur;
	}

	public boolean isHorizontal() {
		return horizontal;
	}

	@Override
	public String toString() {
		if (horizontal) {
			return "Segment [" + pointDebut.toString() + "[" + (pointDebut.getX() + longueur) + "," + pointDebut.getY()
					+ "]";
		} else
			return "Segment [" + pointDebut.toString() + "[" + pointDebut.getX() + "," + (pointDebut.getY() + longueur)
					+ "]";

	}

	@Override
	public Figure getRandomFigure() {
		Random rd = new Random();
		// TODO Auto-generated method stub
		this.horizontal = rd.nextBoolean();
		this.longueur = rd.nextInt(4);
		this.pointDebut = new Point(rd.nextInt(3), rd.nextInt(4));

		return new Segment(pointDebut, longueur, horizontal);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "SEGMENT";
	}

	@Override
	public void affiche() {
		System.out.println(this.toString());
		// TODO Auto-generated method stub

	}

	@Override
	public Point[] getPoint() {
		points[0] = this.pointDebut;
		if (horizontal)
			points[1] = new Point((this.pointDebut.getX() + this.longueur), this.pointDebut.getY());
		else
			points[1] = new Point(this.pointDebut.getX(), (this.pointDebut.getY() + this.longueur));
		// TODO Auto-generated method stub
		return points;
	}

	@Override
	public Collection<Point> getPointsCollection() {
		this.pointCollection.add(this.pointDebut);
		if (this.horizontal)
			this.pointCollection.add(new Point((this.pointDebut.getX() + this.longueur), this.pointDebut.getY()));
		else
			this.pointCollection.add(new Point(this.pointDebut.getX(), (this.pointDebut.getY() + this.longueur)));
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean couvre(Point p) {
		if (horizontal) {

			if (p.getX() <= (this.pointDebut.getX() + this.longueur) && p.getX() >= this.pointDebut.getX())
				return true;
			else
				return false;
		} else {

			if (p.getY() <= (this.pointDebut.getY() + this.longueur) && p.getY() >= this.pointDebut.getY())
				return true;
			else
				return false;
		}

		// TODO Auto-generated method stub

	}

	@Override
	public boolean estEgal(Figure figure) {
		if(figure instanceof Segment){
			Segment seg=(Segment)figure;
			if(this.pointDebut.isEgal(seg.getPointDebut()) && this.longueur==seg.getLongueur()
					&& this.horizontal==seg.isHorizontal())
				return true;
			else 
				return false;
		}
			
		// TODO Auto-generated method stub
		return false;
	}

}
