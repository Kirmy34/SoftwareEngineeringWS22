package iwwwdnw.gui.impl;

import java.util.LinkedList;
import java.util.Queue;

import iwwwdnw.gui.port.Controller;
import iwwwdnw.logic.LogicFactory;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.port.Observer;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.port.Subject;

public class ControllerImpl implements Controller, Observer {

	Queue<Integer> q = new LinkedList<>();

	private View myView;
	private Subject subject;
	private Spielzug myModel;

	ControllerImpl(View view, LogicFactory factory) {
		this.myView = view;
		this.myModel = factory.spielzug();
		this.subject = factory.subject();
		this.subject.attach(this);
	}

	public void update(State newState) {
		/* ggf. etwas tun */
	}

	public void doit() {
		// Update GUI
//		this.myView.show(/* Eingabeaufforderung */);

		while (!q.isEmpty()) {

			int req = q.remove();
			System.out.println("Button pressed: " + req);

			if (req == 1000) {
				myModel.wuerfeln();
				continue;
			}
		}

		// Do sysops...

	}

	public void buttonPressed(int id) {
		q.add(id);
	}

}
