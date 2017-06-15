package tp1;

public class Rond {
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
}
