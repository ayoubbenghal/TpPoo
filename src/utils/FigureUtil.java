package utils;

import java.util.Random;

import tp1.Point;
import tp1.PointFinal;
import tp1.Rectangle;
import tp1.Rond;

public class FigureUtil {
	//static PointFinal p=new PointFinal();
	//static Random rand=new Random();
	
	/*private static int getRandomNb(){
		
		return rand.nextInt(20);
		
	}*/

	public  static Rond randomRond(){
		PointFinal p=new PointFinal();
		//Random r=new Random(5);
		return new Rond(new Random().nextInt(5),new Point(p.getX(), p.getY()));
	}
	
	public static Rectangle randomRectangle(){
		//Random r=new Random(5);
		PointFinal p=new PointFinal();
		return new Rectangle(new Point(p.getX(), p.getY()), new Random().nextInt(30), new Random().nextInt(3));
	}
	
}
