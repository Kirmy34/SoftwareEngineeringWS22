package iwwwdnw.gui.impl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import iwwwdnw.spielzug.impl.SpielerImpl;
import iwwwdnw.spielzug.port.Spieler;

public class GamePanel extends CustomPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomPanel wissenskategorienPanel;
	private MessageLabel messageLabel;
	private WissensstandsanzeigerPanel wissensstandsanzeigerPanel;
	private WuerfelnPanel wuerfelnPanel;
	private SpielbrettPanel spielbrettPanel;
	private WissensstreiterPanel wissensstreiterPanel;
	private Spieler[] spieler;
	

	public GamePanel(Spieler[] spieler) {
		super();
		wissenskategorienPanel = new CustomPanel();
		messageLabel = new MessageLabel();		
		this.spieler = spieler;
		
		wissensstandsanzeigerPanel = new WissensstandsanzeigerPanel(spieler);
		spielbrettPanel = new SpielbrettPanel(spieler);
		wuerfelnPanel = new WuerfelnPanel();
		wissensstreiterPanel = new WissensstreiterPanel(spieler);
		createGUI();
	}
	
	public MessageLabel getMessageLabel() {
		return messageLabel;
	}
	
	public WissensstandsanzeigerPanel getWissensstandsanzeigerPanel() {
		return wissensstandsanzeigerPanel;
	}
	public WuerfelnPanel getWuerfelnPanel() {
		return wuerfelnPanel;
	}
	public SpielbrettPanel getSpielbrettPanel() {
		return spielbrettPanel;
	}
	
	public WissensstreiterPanel getWissensstreiterPanel() {
		return wissensstreiterPanel;
	}
	

	private void createGUI() {
		c.insets = new Insets(2,2,2,2);
		c.anchor = GridBagConstraints.NORTH;
		
		JLabel i = new JLabel("I Mittelalter");
		JLabel ii = new JLabel("II Musik");
		JLabel iii = new JLabel("III Filme");
		JLabel iv = new JLabel("IV Kunst");
		wissenskategorienPanel.addElement(i, 0, 0);
		wissenskategorienPanel.addElement(ii, 0, 1);
		wissenskategorienPanel.addElement(iii, 0, 2);
		wissenskategorienPanel.addElement(iv, 0, 3);
		this.addElement(wissenskategorienPanel, 0, 0);
		
		this.addElement(messageLabel, 1, 0);
		
		this.addElement(wissensstandsanzeigerPanel, 2, 0);
		
		this.addElement(spielbrettPanel, 1, 1);
		
		c.anchor = GridBagConstraints.SOUTH;
		
		this.addElement(wuerfelnPanel, 0, 2);
		
		this.addElement(wissensstreiterPanel, 2, 2);
	}

}
