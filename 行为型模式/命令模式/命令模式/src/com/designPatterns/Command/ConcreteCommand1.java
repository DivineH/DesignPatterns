package com.designPatterns.Command;

public class ConcreteCommand1 extends Command {

	public ConcreteCommand1() {
		super(new ConcreteReceiver1());
	}

	public ConcreteCommand1(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.doSomething();
	}

}
