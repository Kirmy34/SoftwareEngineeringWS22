package iwwwdnw.gui.panels;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class CustomPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected GridBagConstraints c;

	public CustomPanel() {
		super();
		this.setLayout(new GridBagLayout());
		c = new GridBagConstraints();
		this.setBackground(Color.WHITE);

	}

	public void addElement(Component comp, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		this.add(comp, c);
	}


}
