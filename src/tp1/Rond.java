package tp1;

import java.util.Random;

import tp2.Figure;

public class Rond extends Figure{
int r;
Point p;
public Rond(int r, Point p) {
	this.r = r;
	this.p = p;
}
public int getR() {
	return r;
}
public Point getP() {
	return p;
}
@Override
public String toString() {
	return "[Rond =" + p.toString()+" ,"+r+ "]";
}
public void affiche(){
	System.out.println(this.toString());
}
@Override
protected Figure getRandomFigure() {
	Random rd=new Random();
	// TODO Auto-generated method stub
	return new Rond(rd.nextInt(), new Point(rd.nextInt(), rd.nextInt()));
}
@Override
protected String getType() {
	// TODO Auto-generated method stub
	return "ROND";
}
}
