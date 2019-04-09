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
@WebServlet("/ServeFileServlet")
public class ServeFileServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TFGDAO tdao = TFGDAOImplementation.getInstance();
		TFG tfg = tdao.read(req.getParameter("email")); 
		resp.setContentLength(tfg.getDocument().length);
		resp.getOutputStream().write(tfg.getDocument());
	}

}