package test;

import tp1.Point;
import tp1.Rectangle;
import tp1.Rond;
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
	}

}
