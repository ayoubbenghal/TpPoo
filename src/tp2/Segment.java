package tp2;

import java.util.Random;

import tp1.Point;

public class Segment extends Figure {
		Point pointDebut;
		int longueur;
		boolean horizontal;
		
	public Segment(Point pointDebut, int longueur, boolean horizontal) {
			this.pointDebut = pointDebut;
			this.longueur = longueur;
			this.horizontal = horizontal;
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
	protected Figure getRandomFigure() {
		Random rd=new Random();
		// TODO Auto-generated method stub
		return new Segment(new Point(rd.nextInt(), rd.nextInt()), rd.nextInt(4), rd.nextBoolean());
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "SEGMENT";
	}

	@Override
	protected void affiche() {
		System.out.println(this.toString());
		// TODO Auto-generated method stub

	}

}
