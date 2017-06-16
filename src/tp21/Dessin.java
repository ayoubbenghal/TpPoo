package tp21;

import java.util.ArrayList;
import java.util.Collection;

import tp2.Figure;

public class Dessin {
	private Collection<Figure> figures;

	public Dessin() {
		figures = new ArrayList<Figure>();
	}
	public boolean add(Figure figure){
		
		return figures.add(figure);
	}
	public Collection<Figure> getFigures() {
		return figures;
	}

}
