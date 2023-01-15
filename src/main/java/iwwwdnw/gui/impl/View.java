package iwwwdnw.gui.impl;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;

import iwwwdnw.gui.port.Controller;
import iwwwdnw.logic.LogicFactory;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.impl.StateEnum;
import iwwwdnw.statemachine.port.Observer;
import iwwwdnw.statemachine.port.State;

public class View extends CustomPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private CustomPanel wissenskategorienPanel;
	private MessageLabel messageLabel;
	private WissensstandsanzeigerPanel wissensstandsanzeigerPanel;
	private WuerfelnPanel wuerfelnPanel;
	private SpielbrettPanel spielbrettPanel;
	private WissensstreiterPanel wissensstreiterPanel;

	private State currentState;
	private Controller controller;
	private Spielzug model;
	private boolean running = true;

	private Spieler[] spieler;

	public View(LogicFactory factory) {
		super();
		this.model = factory.spielzug();
		this.model.attach(this);
		this.controller = new ControllerImpl(this, factory);

		this.spieler = model.getSpieler();
		wissenskategorienPanel = new CustomPanel();
		messageLabel = new MessageLabel();

		wissensstandsanzeigerPanel = new WissensstandsanzeigerPanel(spieler);
		spielbrettPanel = new SpielbrettPanel(spieler, controller);
		wuerfelnPanel = new WuerfelnPanel(controller);
		wissensstreiterPanel = new WissensstreiterPanel(spieler);
		this.currentState = StateEnum.am_Wuerfeln;
		createGUI();
	}

	public void update(State newState) {
		this.currentState = newState;
	}

	void display() {
		wissensstandsanzeigerPanel.update();
		spielbrettPanel.update();
		messageLabel.setText("Hallo!");
		wissensstreiterPanel.update();
		wuerfelnPanel.update(this.model.getWuerfel());
	}

	void stop() {
		this.running = false;
	}

	public void startEventLoop() {
		while (running) {
			this.display();
			this.controller.doit();
		}
	}

//	public MessageLabel getMessageLabel() {
//		return messageLabel;
//	}
//
//	public WissensstandsanzeigerPanel getWissensstandsanzeigerPanel() {
//		return wissensstandsanzeigerPanel;
//	}
//
//	public WuerfelnPanel getWuerfelnPanel() {
//		return wuerfelnPanel;
//	}
//
//	public SpielbrettPanel getSpielbrettPanel() {
//		return spielbrettPanel;
//	}
//
//	public WissensstreiterPanel getWissensstreiterPanel() {
//		return wissensstreiterPanel;
//	}

	private void createGUI() {
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTH;

		JLabel i = new JLabel("I Mittelalter"); // :)
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
