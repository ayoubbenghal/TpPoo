package tp2;

import java.util.Random;

import tp1.Point;

public class Segment extends Figure {
		Point pointDebut;
		int longueur;
		boolean horizontal;
		private Point[] points;

		
		
	public Segment() {
		this.points=new Point[2];
		
		}

	public Segment(Point pointDebut, int longueur, boolean horizontal) {
			this.pointDebut = pointDebut;
			this.longueur = longueur;
			this.horizontal = horizontal;
			this.points=new Point[2];
		}

	@Override
	public String toString() {
		if(horizontal){
			return "Segment ["+pointDebut.toString()+"["+
					(pointDebut.getX()+longueur)+","+pointDebut.getY()+
					"]";
		}else return "Segment ["+pointDebut.toString()+"["+
		pointDebut.getX()+","+(pointDebut.getY()+longueur)+
		"]";
		
	}

	@Override
	public Figure getRandomFigure() {
		Random rd=new Random();
		// TODO Auto-generated method stub
		this.horizontal=rd.nextBoolean();
		this.longueur=rd.nextInt(4);
		this.pointDebut=new Point(rd.nextInt(3), rd.nextInt(4));
		
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
		points[0]=this.pointDebut;
		if(horizontal) points[1]=new Point((this.pointDebut.getX()+this.longueur), this.pointDebut.getY());
		else points[1]=new Point(this.pointDebut.getX(), (this.pointDebut.getY()+this.longueur));
		// TODO Auto-generated method stub
		return points;
	}
	
	

}
