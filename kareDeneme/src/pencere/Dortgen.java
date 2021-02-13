package pencere;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.print.attribute.standard.MediaSize.Other;

import jdk.jfr.consumer.RecordedThreadGroup;

public class Dortgen {

	Rectangle dortgen;

	public Dortgen(int x, int y, int gen, int yuk) {
		dortgen = new Rectangle(x, y, gen, yuk);
	}

	public void draw(Graphics g) {

		g.drawRect((int) dortgen.getX(), (int) dortgen.getY(), (int) dortgen.getWidth(), (int) dortgen.getHeight());

	}

	public void hareket(int x, int y, Dortgen[] othersDortgens, int sayi) {
		boolean cakisma = false;

		Rectangle rectangle = new Rectangle(dortgen);

		rectangle.setLocation((int) rectangle.getX() + x, (int) rectangle.getY() + y);

		if (rectangle.getX() < 0 || rectangle.getY() < 0 || rectangle.getX() > 960 || rectangle.getY() > 721) {

			cakisma = true;
		}
		for (int i = 0; i < sayi; i++) {

			if (rectangle.intersects(othersDortgens[i].getRectangle())) {
				cakisma = true;

			}

		}
		if (cakisma == false) {
			dortgen.setLocation((int) dortgen.getX() + x, (int) dortgen.getY() + y);
		}

	}

	public Rectangle getRectangle() {
		return dortgen;
	}

}
