package tp2;

import java.util.Random;

import tp1.Point;

public class Carre extends Figure{
	private int x;
	private Point p;
	public Carre(int x, Point p) {
		this.x = x;
		this.p = p;
	}
	@Override
	public String toString() {
		
		return "Carre ["+new Point(p.getX(), p.getY())+
		new Point(p.getX()+this.x, p.getY())+ 
		new Point(p.getX(), p.getY()+this.x)+
		new Point(p.getX()+this.x, p.getY()+this.x) +"]";
	}
	
	public void affiche(){
		System.out.println(this.toString());
	}
	@Override
	protected Figure getRandomFigure() {
		Random rd=new Random();
		// TODO Auto-generated method stub
		return new Carre(rd.nextInt(), new Point(rd.nextInt(), rd.nextInt()));
	}
	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "CARRE";
	}

	/*public Carre(Point p, int x1, int y1) {
		super(p, x1, y1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		super.affiche();
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "CARRE";
	}*/
	
	
	

}
