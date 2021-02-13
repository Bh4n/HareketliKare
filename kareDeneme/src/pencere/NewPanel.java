package pencere;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;

public class NewPanel extends JPanel implements KeyListener {

	Random rnd = new Random();
	Dortgen dortgen;
	Dortgen[] others;
	int step = 5;
	int numOfElements = 11;

	public NewPanel() {
		super();
		dortgen = new Dortgen(300, 200, 20, 20);
		addKeyListener(this);
		others = new Dortgen[numOfElements];
		others[0] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[1] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[2] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[3] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[4] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[5] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[6] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[7] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[8] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[9] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);
		others[10] = new Dortgen(rnd.nextInt(960), rnd.nextInt(721), 20, 20);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		dortgen.draw(g);
		g.drawRect(0, 0, 980, 740);

		for (int i = 0; i < numOfElements; i++) {
			others[i].draw(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == e.VK_UP) {

			dortgen.hareket(0, -step, others, numOfElements);

			repaint();

		} else if (e.getKeyCode() == e.VK_DOWN) {

			dortgen.hareket(0, step, others, numOfElements);
			repaint();
		} else if (e.getKeyCode() == e.VK_LEFT) {

			dortgen.hareket(-step, 0, others, numOfElements);
			repaint();
		} else if (e.getKeyCode() == e.VK_RIGHT) {

			dortgen.hareket(step, 0, others, numOfElements);
			repaint();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
