package es.upm.dit.isst.webLab.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.webLab.dao.TFGDAO;
import es.upm.dit.isst.webLab.dao.TFGDAOImplementation;
import es.upm.dit.isst.webLab.model.TFG;


@SuppressWarnings("serial")
@WebServlet("/Form2ProfessorServlet")
public class Form2ProfessorServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		TFGDAO tdao = TFGDAOImplementation.getInstance();
		TFG tfg = tdao.read(req.getParameter("email"));
		tfg.setStatus(2);
		tdao.update(tfg);
		resp.sendRedirect( req.getContextPath() + "/ProfessorServlet");
	}

}