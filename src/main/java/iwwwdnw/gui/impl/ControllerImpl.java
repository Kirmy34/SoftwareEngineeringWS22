package iwwwdnw.gui.impl;

import java.util.LinkedList;
import java.util.Queue;

import iwwwdnw.gui.port.Controller;
import iwwwdnw.logic.LogicFactory;
import iwwwdnw.logic.port.Model;

public class ControllerImpl implements Controller {

	Queue<Integer> q = new LinkedList<>();

	private Model myModel;

	ControllerImpl(LogicFactory factory) {
		this.myModel = factory.model();
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
