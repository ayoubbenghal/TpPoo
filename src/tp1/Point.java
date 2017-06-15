package tp1;

import java.util.Random;

import tp2.Figure;

public class Point extends Figure {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
	protected Figure getRandomFigure() {
		Random rd = new Random();
		// TODO Auto-generated method stub
		return new Point(rd.nextInt(), rd.nextInt());
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "POINT";
	}

	@Override
	protected void affiche() {
		System.out.println(this.toString());
		// TODO Auto-generated method stub

	}

}
