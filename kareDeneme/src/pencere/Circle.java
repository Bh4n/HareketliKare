package pencere;

import java.awt.Graphics;

public class Circle {

	int x, y;
	int genislik;

	public Circle(int x, int y, int genislik) {
		super();
		this.x = x;
		this.y = y;
		this.genislik = genislik;
	}

	public void genisle(int i) {

		x = x - (i / 2);
		y = y - (i / 2);
		genislik += i;

	}

	public void ciz(Graphics g) {

		g.drawRect(x, y, genislik, genislik);
		g.drawOval(x, y, genislik, genislik);

	}

}
