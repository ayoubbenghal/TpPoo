package test;

import tp1.Point;
import tp1.Rectangle;
import tp1.Rond;
import tp2.Segment;
import utils.FigureUtil;

public class TestTp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Point p=new Point(5, 6);
		Rond ron=new Rond(5, p);
		Rectangle rect=new Rectangle(p, 3, 2);
		
		ron.affiche();
		rect.affiche();
		
		FigureUtil.randomRond().affiche();
		
		FigureUtil.randomRectangle().affiche();
		System.out.println("TABLEAU DE POINT POINT");
		p.getPoint()[0].affiche();
		System.out.println("TABLEAU DE POINT RECTANGLE");
		for (Point point : rect.getPoint()) {
			point.affiche();
		}
		System.out.println("TABLEAU DE POINT RECTANGLE");
		for (Point point : FigureUtil.getRandomFigure().getPoint()) {
			System.out.println("POINT DE :"+FigureUtil.getRandomFigure().getType());
			point.affiche();
		}
		System.out.println("TABLEAU DE POINT ROND");
		for (Point point : FigureUtil.randomRond().getPoint()) {
			point.affiche();
		}
		System.out.println("TABLEAU DE POINT SEGMENT");
		Segment seg=new Segment();
		seg.getRandomFigure();
		/*for (Point point : seg.getPoint()) {
			point.affiche();
		}*/
		System.out.println("TABLEAU DE POINTS RANDOM");
		for (Point point : FigureUtil.getPoints(6)) {
			
			point.affiche();
			
			
		}
		
		
	}

}
