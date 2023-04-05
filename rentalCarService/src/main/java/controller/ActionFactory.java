package controller;

import controller.action.Action;

public class ActionFactory {
	private static final ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
//		if(command.equals("index"))
//			action = new IndexAction();
		//등등
		
		return action;
	}
}
