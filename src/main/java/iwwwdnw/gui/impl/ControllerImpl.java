package iwwwdnw.gui.impl;

import java.util.LinkedList;
import java.util.Queue;

import iwwwdnw.gui.port.Controller;
import iwwwdnw.logic.LogicFactory;
import iwwwdnw.logic.port.Model;
import iwwwdnw.statemachine.port.State;

public class ControllerImpl implements Controller {

	Queue<Integer> q = new LinkedList<>();

	private View myView;
//	private Subject subject;
	private Model myModel;

	ControllerImpl(View view, LogicFactory factory) {
		this.myView = view;
		this.myModel = factory.model();
//		this.subject = factory.subject();
//		this.subject.attach(this);
	}

	public void update(State newState) {
		/* ggf. etwas tun */
	}

	public void doit() {
		while (!q.isEmpty()) {
			myModel.service(q.remove());
		}
	}

	public void buttonPressed(int id) {
		q.add(id);
	}

}
