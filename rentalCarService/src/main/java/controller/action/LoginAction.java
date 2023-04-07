package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import client.Client;
import client.access.ClientAccess;

public class LoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String pw = request.getParameter("password");

		ClientAccess clientDao = ClientAccess.getInstance();
		Client tmpClient = clientDao.getClientByIdAndPw(id, pw);
		
		if(tmpClient == null) {
			response.sendRedirect("login.jsp");
		}else {
			request.getSession().setAttribute("client", tmpClient);
			response.sendRedirect("/");
		}
	}
}