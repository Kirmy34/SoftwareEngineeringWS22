package iwwwdnw;

import javax.swing.JFrame;

import iwwwdnw.gui.impl.View;
import iwwwdnw.logic.LogicFactory;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		View panel = new View(LogicFactory.FACTORY);
		frame.add(panel);

		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("IWWWDNW");
		frame.setVisible(true);

		panel.startEventLoop();
	}
}
