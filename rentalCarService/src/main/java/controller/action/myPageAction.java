package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myPageAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String selMenu = request.getParameter("menu");
		
		if(selMenu.equals("정보수정")) {
			response.sendRedirect("modifyInfo.jsp");
		}else if(selMenu.equals("예약조회")) {
			response.sendRedirect("bookingInfo.jsp");			
		}else if(selMenu.equals("회원탈퇴")) {
			// 아직 구현안할거임
			response.sendRedirect("/");
		}
			
	}

}
