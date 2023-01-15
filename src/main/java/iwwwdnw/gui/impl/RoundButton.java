package iwwwdnw.gui.impl;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class RoundButton extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Dimension DIM = new Dimension(30, 30);
	private Color borderColor;
	private static final Color STANDARD_BACKGROUND = Color.GRAY;

	public RoundButton(Color borderColor) {
		this.setBackground(STANDARD_BACKGROUND);
		this.borderColor = borderColor;
		Dimension size = DIM;
		size.width = size.height = Math.max(size.width, size.height);
		setPreferredSize(DIM);

		setContentAreaFilled(false);
	}

	protected void paintComponent(Graphics g) {
		if (getModel().isArmed()) {
			g.setColor(Color.LIGHT_GRAY);
		} else {
			g.setColor(getBackground());
		}
		g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);

		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		
		g.setColor(borderColor);
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(3));
	    
		g.drawOval(1, 1, getSize().width - 3, getSize().height - 3);
	}

	Shape shape;

	public boolean contains(int x, int y) {
		if (shape == null || !shape.getBounds().equals(getBounds())) {
			shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		}
		return shape.contains(x, y);
	}

}
