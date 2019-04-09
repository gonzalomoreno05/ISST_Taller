package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.ProfessorDAO;
import es.upm.dit.isst.webLab.dao.ProfessorDAOImplementation;


@SuppressWarnings("serial")
@WebServlet("/ProfessorServlet")
public class ProfessorServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProfessorDAO pdao = ProfessorDAOImplementation.getInstance();
		req.getSession().setAttribute( "professor", pdao.read(req.getParameter("email")) );
		
		getServletContext().getRequestDispatcher( "/ProfessorView.jsp" ).forward( req, resp );
	}
	
}