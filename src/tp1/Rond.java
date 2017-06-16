package tp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import tp2.Figure;
import tp2.Surfacable;

public class Rond extends Figure implements Surfacable {
	private int r;
	private Point p;
	private Point[] points;
	private Collection<Point>pointsCollection;

	public Rond(int r, Point p) {
		this.r = r;
		this.p = p;
		this.points=new Point[1];
		this.pointsCollection=new ArrayList<>();
	}

	public int getR() {
		return r;
	}

	public Point getP() {
		return p;
	}

	@Override
	public String toString() {
		return "[Rond =" + p.toString() + " ," + r + "]";
	}

	public void affiche() {
		System.out.println(this.toString());
	}

	@Override
	public Figure getRandomFigure() {
		Random rd = new Random();
		// TODO Auto-generated method stub
		return new Rond(rd.nextInt(), new Point(rd.nextInt(), rd.nextInt()));
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "ROND";
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(r, 2);
	}

	@Override
	public Point[] getPoint() {
		points[0]=this.p;
		return points;
	}

	@Override
	public Collection<Point> getPointsCollection() {
		this.pointsCollection.add(this.p);
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public boolean couvre(Point p) {
		if(p.getX()<=(this.p.getX()+this.r) && p.getX()>=(this.p.getX()-this.r) 
				&& p.getY()<=(this.p.getY()+this.r) && p.getY()>=(this.p.getY()-r))
			return true;
		// TODO Auto-generated method stub
		return false;
	}
}
