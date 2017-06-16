package utils;

import java.util.Random;

import tp1.Point;
import tp1.PointFinal;
import tp1.Rectangle;
import tp1.Rond;
import tp2.Carre;
import tp2.Figure;
import tp2.Segment;

public class FigureUtil {
	//static PointFinal p=new PointFinal();
	//static Random new Random()=new Random();
	
	
	/*private static int getRandomNb(){
		
		return rand.nextInt(20);
		
	}*/

	public  static Rond randomRond(){
		PointFinal p=new PointFinal();
		//Random r=new Random(5);
		return new Rond(new Random().nextInt(30),new Point(p.getX(), p.getY()));
	}
	
	public static Rectangle randomRectangle(){
		//Random r=new Random(5);
		PointFinal p=new PointFinal();
		return new Rectangle(new Point(p.getX(), p.getY()), new Random().nextInt(30), new Random().nextInt(30));
	}
	public static Carre randomCarre(){
		Point p=new Point(new Random().nextInt(30),new Random().nextInt(30));
		return new Carre(new Random().nextInt(30), p);
	}
	public static Segment randomSegment(){
		Point p=new Point(new Random().nextInt(30), new Random().nextInt(30));
		Segment seg=new Segment(p, new Random().nextInt(6), new Random().nextBoolean());
		return seg;
	}
	public static Figure getRandomFigure(){
		int choix = new Random().nextInt(4);
		switch(choix){
		case 0 : 
			return randomRond();
		case 1 : 
			return randomCarre();
		case 2 : 
			return randomSegment();
		default : 
			return randomRectangle();
		}
	
}
	public static Point[] getPoints(int n){
		int cpt=0;
		Figure[] figures=new Figure[n];
		Point[] points;
		Figure f;
		for (int i = 0; i < n; i++) {
			 f= getRandomFigure();
			if (f instanceof Rond)
				cpt++;
			else if (f instanceof Carre)
				cpt += 4;
			else if (f instanceof Rectangle || f instanceof Carre)
				cpt += 4;
			else
				cpt += 2;
			figures[i]=f;
			System.out.println(f.getType());

		}
		points=new Point[cpt];
		/*for (int i = 0; i < points.length; i++) 
		for (int j = 0; j < figures.length; j++) 
		for (int k = 0; k < figures[j].getPoint().length; k++) 
			points[i]=figures[j].getPoint()[k];*/
			//System.out.println("taille"+figures[j].getPoint().length);
		int i=0;
		for (Figure figure : figures) 
			for (Point point : figure.getPoint()) {
				points[i]=point;
				i++;
				
		}
		
		return points;
	}
	
	
		
}
