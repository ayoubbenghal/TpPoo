package tp1;

import java.util.Random;

import tp2.Figure;
import tp2.Surfacable;

public class Rectangle extends Figure implements Surfacable {
	private Point p;
	private int x1, y1;

	public Rectangle(Point p, int x1, int y1) {
		this.p = p;
		this.x1 = x1;
		this.y1 = y1;
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

	protected String getType() {
		return "RECTANGLE";
	}

	@Override
	protected Figure getRandomFigure() {
		Random rd = new Random();
		// TODO Auto-generated method stub
		return new Rectangle(new Point(rd.nextInt(), rd.nextInt()), rd.nextInt(), rd.nextInt());
	}

	@Override
	public double surface() {

		// TODO Auto-generated method stub
		return Math.abs(this.x1 * this.y1);
	}

}
