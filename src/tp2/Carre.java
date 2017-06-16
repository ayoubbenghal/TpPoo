package tp2;

import java.util.Random;

import tp1.Point;

public class Carre extends Figure implements Surfacable {
	private int x;
	private Point p;
	private Point[] points;


	public Carre(int x, Point p) {
		this.x = x;
		this.p = p;
		this.points = new Point[4];
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
