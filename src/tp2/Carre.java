package tp2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import tp1.Point;

public class Carre extends Figure implements Surfacable {
	private int x;
	private Point p;
	private Point[] points;
	private Collection<Point>pointCollection;


	public Carre(int x, Point p) {
		this.x = x;
		this.p = p;
		this.points = new Point[4];
		this.pointCollection=new ArrayList<>();
	}

	@Override
	public String toString() {

		return "Carre [" + new Point(p.getX(), p.getY()) + new Point(p.getX() + this.x, p.getY())
				+ new Point(p.getX(), p.getY() + this.x) + new Point(p.getX() + this.x, p.getY() + this.x) + "]";
	}

	public void affiche() {
		System.out.println(this.toString());
	}

	@Override
	public Figure getRandomFigure() {
		Random rd = new Random();
		// TODO Auto-generated method stub
		return new Carre(rd.nextInt(), new Point(rd.nextInt(), rd.nextInt()));
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CARRE";
	}

	@Override
	public double surface() {
		return Math.pow(Math.abs(this.x), 2);

		// TODO Auto-generated method stub

	}

	@Override
	public Point[] getPoint() {
		points[0] = this.p;
		points[1] = new Point(p.getX() + this.x, p.getY());
		points[2] = new Point(p.getX(), p.getY() + this.x);
		points[3] = new Point(p.getX() + this.x, p.getY() + this.x);

		return points;
	}

	@Override
	public Collection<Point> getPointsCollection() {
		this.pointCollection.add(this.p);
		this.pointCollection.add(new Point(p.getX() + this.x, p.getY()));
		this.pointCollection.add(new Point(p.getX(), p.getY() + this.x));
		this.pointCollection.add(new Point(p.getX() + this.x, p.getY() + this.x));
		// TODO Auto-generated method stub
		return this.pointCollection;
	}
	
	public boolean isBetweenX(Point p0,Point p1,Point p2){
		if(p0.getX()<=p2.getX() && p0.getX()>=p1.getX())
			return true;
		else return false;
	}
	public boolean isBetweenY(Point p0,Point p1,Point p2){
		if(p0.getY()<=p2.getY() && p0.getY()>=p1.getY()) return true;
		else return false;
	}

	@Override
	public boolean couvre(Point p) {
		if(isBetweenX(p, this.p, new Point(this.p.getX()+this.x, this.p.getY())) &&
				isBetweenY(p, this.p, new Point(this.p.getX(), this.p.getY()+this.x)))
		return true;
		
		 return false;
		// TODO Auto-generated method stub
		
	}

	/*
	 * public Carre(Point p, int x1, int y1) { super(p, x1, y1); // TODO
	 * Auto-generated constructor stub }
	 * 
	 * @Override public void affiche() { // TODO Auto-generated method stub
	 * super.affiche(); }
	 * 
	 * @Override protected String getType() { // TODO Auto-generated method stub
	 * return "CARRE"; }
	 */

}
