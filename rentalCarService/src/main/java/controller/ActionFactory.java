package controller;

import controller.action.Action;
import controller.action.LoginAction;
import controller.action.LogoutAction;
import controller.action.RegistAction;
import controller.action.myPageAction;

public class ActionFactory {
	private static final ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("login"))
			action = new LoginAction();
		else if(command.equals("regist"))
			action = new RegistAction();
		else if(command.equals("logout"))
			action = new LogoutAction();
		else if(command.equals("myPage"))
			action = new myPageAction();
		
		return action;
	}
}
