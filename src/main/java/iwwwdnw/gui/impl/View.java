package iwwwdnw.gui.impl;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Date;

import javax.swing.JLabel;

import iwwwdnw.gui.panels.CustomPanel;
import iwwwdnw.gui.panels.SpielbrettPanel;
import iwwwdnw.gui.panels.WissensstandsanzeigerPanel;
import iwwwdnw.gui.panels.WissensstreiterPanel;
import iwwwdnw.gui.panels.WuerfelnPanel;
import iwwwdnw.gui.port.Controller;
import iwwwdnw.logic.LogicFactory;
import iwwwdnw.logic.port.Model;
import iwwwdnw.spielzug.port.Spieler;

public class View extends CustomPanel {

	private static final long serialVersionUID = 1L;
	private CustomPanel wissenskategorienPanel;
	private MessageLabel messageLabel;
	private WissensstandsanzeigerPanel wissensstandsanzeigerPanel;
	private WuerfelnPanel wuerfelnPanel;
	private SpielbrettPanel spielbrettPanel;
	private WissensstreiterPanel wissensstreiterPanel;

	private Controller controller;
	private Model model;
	private boolean running = true;

	private int fps;
	private long time;

	private Spieler[] spieler;

	public View(LogicFactory factory) {
		super();
		this.model = factory.model();
		this.controller = new ControllerImpl(this, factory);

		this.spieler = model.getSpieler();
		wissenskategorienPanel = new CustomPanel();
		messageLabel = new MessageLabel(model);

		wissensstandsanzeigerPanel = new WissensstandsanzeigerPanel(spieler);
		spielbrettPanel = new SpielbrettPanel(spieler, controller, model);
		wuerfelnPanel = new WuerfelnPanel(controller, model);
		wissensstreiterPanel = new WissensstreiterPanel(spieler);
		this.time = new Date().getTime();
		this.fps = 0;
		createGUI();
	}

	void display() {
		wissensstandsanzeigerPanel.update();
		spielbrettPanel.update();
		messageLabel.update();
		wissensstreiterPanel.update();
		wuerfelnPanel.update();
	}

	void stop() {
		this.running = false;
	}

	public void startEventLoop() {
		while (running) {
			this.display();
			this.controller.doit();
//			this.showGameInfo();
		}
	}

	@SuppressWarnings("unused")
	private void showGameInfo() {
		fps++;

		if (new Date().getTime() > time + 1000) {
			System.out.print('\r' + "FPS: " + fps + ", Current State: " + model.getState());
			fps = 0;
			time = new Date().getTime();
		}
	}

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
