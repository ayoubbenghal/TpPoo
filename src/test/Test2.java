package test;

import tp1.Point;
import tp1.Rectangle;
import tp1.Rond;
import tp2.Carre;
import tp2.Segment;
import tp21.Dessin;
import utils.FigureUtil;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(new Point(3, 4), 5, 6);
		r.affiche();
		System.out.println(r.couvre(new Point(3, 10)));
		System.out.println(r.couvre(new Point(9, 4)));
		System.out.println(r.couvre(new Point(8, 10)));
		System.out.println(r.couvre(new Point(7, 6)));
		System.out.println(r.couvre(new Point(5, 2)));
		System.out.println(r.couvre(new Point(1, 7)));
		Carre c = new Carre(3, new Point(3, 4));
		c.affiche();
		System.out.println(c.couvre(new Point(4, 7)));
		System.out.println(c.couvre(new Point(4, 5)));
		System.out.println(c.couvre(new Point(8, 10)));
		System.out.println(c.couvre(new Point(5, 6)));
		System.out.println(c.couvre(new Point(5, 5)));
		System.out.println(c.couvre(new Point(1, 7)));
		Rond rond = new Rond(2, new Point(4, 5));
		rond.affiche();
		System.out.println(c.couvre(new Point(4, 7)));
		System.out.println(c.couvre(new Point(4, 5)));
		System.out.println(c.couvre(new Point(3, 4)));
		System.out.println(c.couvre(new Point(5, 6)));
		System.out.println(c.couvre(new Point(5, 5)));
		System.out.println(c.couvre(new Point(1, 7)));
		Segment seg = new Segment(new Point(5, 9), 2, false);
		seg.affiche();
		System.out.println(seg.couvre(new Point(4, 7)));
		System.out.println(seg.couvre(new Point(6, 5)));
		System.out.println(seg.couvre(new Point(3, 10)));
		System.out.println(seg.couvre(new Point(8, 6)));
		System.out.println(seg.couvre(new Point(5, 5)));
		System.out.println(seg.couvre(new Point(1, 7)));
		Point p1=new Point(1, 7);
		Point p2=new Point(3, 10);
		
		
		Dessin d = new Dessin();
		d.add(r);
		d.add(seg);
		d.add(rond);
		d.add(c);
		System.out.println(FigureUtil.getFigureEn(p1, d));
		System.out.println(FigureUtil.getFigureEn(p2, d));
		System.out.println("EST EGALE");
		System.out.println(r.estEgal(p2));
		System.out.println(seg.estEgal(rond));
		System.out.println(c.estEgal(r));
		Segment seg2 = new Segment(new Point(5, 9), 2, false);
		Rectangle r2 = new Rectangle(new Point(3, 4), 3, 3);
		System.out.println("RECTANGLE CARRE ET TRUE");
		System.out.println(seg.estEgal(seg2));
		System.out.println(r2.estEgal(c));
		

	}

}
