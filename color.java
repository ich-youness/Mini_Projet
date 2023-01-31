package mini_proj;

import java.awt.Color;
import java.awt.Graphics;

public class color {
	private static Color couleur;
	private Graphics g;
	public color(Color c) {
		couleur =c;
	}
	public static void main(String[] o) {
		color('red');
		System.out.print( couleur);
	}
}
