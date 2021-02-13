package pencere;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class KarePencere extends JPanel implements ActionListener, MouseListener, KeyListener {

	Cember[] cemberler = {};
	int cemberMevcut = 0;
	int x, y;
	int cemberMax = 15;
	int cemberEleman = 0;
	int yuk, gen;
	int artisMik = 2;
	Timer zaman;

	public KarePencere() {
		super();
		cemberler = new Cember[cemberMax];
		addMouseListener(this);
		addKeyListener(this);
		zaman = new Timer(1, this);
		zaman.start();
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		for (int i = 0; i < cemberEleman; i++) {

			cemberler[i].ciz(g);

		}
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < cemberEleman; i++) {

			cemberler[i].genisle(artisMik);
		}

		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (cemberMevcut < cemberMax) {

			Cember yeniCember = new Cember(e.getX(), e.getY(), 0);

			cemberler[cemberMevcut] = yeniCember;
			cemberMevcut = (cemberMevcut + 1) % cemberMax;

			if (cemberEleman < cemberMax) {

				cemberEleman += 1;
			}

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		if (cemberMevcut < cemberMax) {

			Cember yeniCember = new Cember(e.getX(), e.getY(), 0);

			cemberler[cemberMevcut] = yeniCember;
			cemberMevcut = (cemberMevcut + 1) % cemberMax;

			if (cemberEleman < cemberMax) {

				cemberEleman += 1;
			}

		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		zaman.start();

	}

	@Override
	public void mouseExited(MouseEvent e) {
		zaman.stop();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == e.VK_UP) {

			artisMik += 1;
		} else if (e.getKeyCode() == e.VK_DOWN) {

			System.out.println(e.getKeyCode());
			artisMik -= 2;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
