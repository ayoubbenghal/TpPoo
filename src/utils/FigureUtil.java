package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import tp1.Point;
import tp1.PointFinal;
import tp1.Rectangle;
import tp1.Rond;
import tp2.Carre;
import tp2.Figure;
import tp2.Segment;
import tp21.Dessin;

public class FigureUtil {
	// static PointFinal p=new PointFinal();
	// static Random new Random()=new Random();

	/*
	 * private static int getRandomNb(){
	 * 
	 * return rand.nextInt(20);
	 * 
	 * }
	 */

	public static Rond randomRond() {
		PointFinal p = new PointFinal();
		// Random r=new Random(5);
		return new Rond(new Random().nextInt(100), new Point(p.getX(), p.getY()));
	}

	public static Rectangle randomRectangle() {
		// Random r=new Random(5);
		PointFinal p = new PointFinal();
		return new Rectangle(new Point(p.getX(), p.getY()), new Random().nextInt(100), new Random().nextInt(100));
	}

	public static Carre randomCarre() {
		Point p = new Point(new Random().nextInt(100), new Random().nextInt(100));
		return new Carre(new Random().nextInt(100), p);
	}

	public static Segment randomSegment() {
		Point p = new Point(new Random().nextInt(100), new Random().nextInt(100));
		Segment seg = new Segment(p, new Random().nextInt(6), new Random().nextBoolean());
		return seg;
	}

	public static Figure getRandomFigure() {
		int choix = new Random().nextInt(4);
		switch (choix) {
		case 0:
			return randomRond();
		case 1:
			return randomCarre();
		case 2:
			return randomSegment();
		default:
			return randomRectangle();
		}

	}

	public static Point[] getPoints(int n) {
		int cpt = 0;
		Figure[] figures = new Figure[n];
		Point[] points;
		Figure f;
		for (int i = 0; i < n; i++) {
			f = getRandomFigure();
			if (f instanceof Rond)
				cpt++;
			else if (f instanceof Carre)
				cpt += 4;
			else if (f instanceof Rectangle || f instanceof Carre)
				cpt += 4;
			else
				cpt += 2;
			figures[i] = f;
			System.out.println(f.getType());

		}
		points = new Point[cpt];

		int i = 0;
		for (Figure figure : figures)
			for (Point point : figure.getPoint()) {
				points[i] = point;
				i++;

			}

		return points;
	}

	public static Collection<Figure> genere(int n) {
		Collection<Figure> figures = new ArrayList<>(n);
		for (Figure figure : figures) {
			figure = getRandomFigure();
			figures.add(figure);
		}
		return figures;
	}

	public static Collection<Point> getPointCollection(int n) {
		Collection<Point> points = new ArrayList<>();
		for (Figure figure : genere(n)) {
			points.addAll(figure.getPointsCollection());
		}
		return points;
	}

	public static Figure getFigureEn(Point p, Dessin dessin) {

		Iterator<Figure> it = dessin.getFigures().iterator();
		Figure f;
		while (it.hasNext()) {
			f = it.next();
			if (f.couvre(p))
				return f;
		}

		return null;
	}

	public static List<Figure> trieProcheOrigine(Dessin d) {
		HashMap<Figure, Double> mapFigure = new HashMap<>();
		for (Figure f : d.getFigures()) {
			mapFigure.put(f, f.distanceOrigine());

		}
		List<Double> distances = new ArrayList<>();
		distances.addAll(mapFigure.values());
		Collections.sort(distances);
		List<Figure> figures = new ArrayList<>();

		for (Double dist : distances) {
			for (Figure f : mapFigure.keySet()) {
				if (mapFigure.get(f) == dist)
					figures.add(f);
			}
		}

		return figures;
	}

	public static List<Figure> trieDominant(Dessin dessin) {
		List<Figure> figures = new ArrayList<>();
		HashMap<Figure, Double> mapFigures = new HashMap<>();
		Carre c;
		Rectangle rec;
		Rond rond;
		for (Figure figure : dessin.getFigures()) {
			if (figure instanceof Carre) {
				c = (Carre) figure;
				mapFigures.put(figure, c.surface());
			} else if (figure instanceof Rectangle) {
				rec = (Rectangle) figure;
				mapFigures.put(figure, rec.surface());

			} else if (figure instanceof Rond) {
				rond = (Rond) figure;
				mapFigures.put(figure, rond.surface());
			}

		}
		List<Double> surfaces = new ArrayList<>();
		surfaces.addAll(mapFigures.values());
		Collections.sort(surfaces);
		for (Double d : surfaces) {
			for (Figure f : mapFigures.keySet()) {
				if (mapFigures.get(f) == d)
					figures.add(f);
			}
		}
		return figures;

	}
}
