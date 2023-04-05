package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.action.Action;

//../Service

public class Service extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Service() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 명령에 따라 서로다른 처리로직을 수행하도록 함
		String command = request.getParameter("command");
		
		// 서로 다른 명령에 따른 "Action 객체 생성" 후 -> 메서드 호출
		ActionFactory factory = ActionFactory.getInstance(); // Factory method Pattern (생생 패턴)
		Action action = factory.getAction(command);			 // Command Pattern (행위 패턴)
		
		if(action != null)
			action.execute(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
