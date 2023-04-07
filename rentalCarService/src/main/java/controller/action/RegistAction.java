package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import client.ClientRequest;
import client.access.ClientAccess;

public class RegistAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		ClientAccess clientDao = ClientAccess.getInstance();
		if(clientDao.getClientByIdAndPw(id, password) == null) {
			ClientRequest clientDto = new ClientRequest(id, password, name, phone, address);
			clientDao.createClient(clientDto);
			response.sendRedirect("login.jsp");
		}
		else
			response.sendRedirect("join.jsp");
	}

}
