package tp21;

import java.util.ArrayList;
import java.util.List;

import tp2.Figure;

public class Dessin {
	private List<Figure> figures;

	public Dessin() {
		figures = new ArrayList<Figure>();
	}
	public boolean add(Figure figure){
		
		return figures.add(figure);
	}

	public List<Figure> getFigures() {
		return figures;
	}

}
