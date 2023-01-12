package iwwwdnw.statemachine.impl;

import iwwwdnw.logic.LogicFactory;
import iwwwdnw.logic.port.Observer;
import iwwwdnw.logic.port.Subject;
import iwwwdnw.statemachine.port.State;

public class View implements Observer {
	private State currentState;
//	private Controller controller;
	private Subject subject;
//	private UseCase model;
	private boolean running = true;

	public View(LogicFactory factory) {
//	 this.model = factory.useCase();
	 this.subject = factory.subject();
	 this.subject.attach(this);
	 this.controller = new Controller(this, factory); }