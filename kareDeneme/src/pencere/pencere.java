package pencere;

import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class pencere {
	public static void main(String[] args) {

		JFrame windowFrame = new JFrame("Mein Programm");
		NewPanel panel1 = new NewPanel();
		windowFrame.add(panel1);
		windowFrame.addKeyListener(panel1);
		windowFrame.setBounds(460, 100, 1200, 840);
		windowFrame.setVisible(true);

	}

}
