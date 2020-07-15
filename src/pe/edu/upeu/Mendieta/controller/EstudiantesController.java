package pe.edu.upeu.Mendieta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.pe.Mendieta.dao.EscuelaDao;
import pe.edu.pe.Mendieta.dao.EstudiantesDao;
import pe.edu.upeu.Mendieta.daoImp.EscuelaDaoImp;
import pe.edu.upeu.Mendieta.daoImp.EstudiantesDaoImp;
import pe.edu.upeu.Mendieta.entity.Estudiantes;

/**
 * Servlet implementation class EstudiantesController
 */
@WebServlet("/ec")
public class EstudiantesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EstudiantesDao alu = new EstudiantesDaoImp();
	private EscuelaDao esc= new EscuelaDaoImp();
	private Gson g = new Gson();
	int idestudiantes, idescuela;
	String correo,  telefono , apellnombres;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EstudiantesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch(op) {
		case 1: 
				out.println(g.toJson(esc.readAll()));
				break;
		case 2: 
			out.println(g.toJson(alu.readAll()));
		    break;
		case 3: 
			
			alu.create(new Estudiantes (0,
			Integer.parseInt(request.getParameter("esc")),
			request.getParameter("apell"),
			request.getParameter("correo"),
			request.getParameter("telef")));
	        out.println(g.toJson("Registro guardado"));  
	    break;  
		case 4:
			out.println(g.toJson(alu.read(Integer.parseInt(request.getParameter("id")))));		
		break;
		case 5:
			int x = alu.delete(Integer.parseInt(request.getParameter("id")));
			out.println(g.toJson(x));
			
			break; 
		case 6:
			idestudiantes = Integer.parseInt(request.getParameter("idp"));
			idescuela = Integer.parseInt(request.getParameter("idesc"));
			apellnombres = request.getParameter("apell");
			correo = request.getParameter("correo");				
			telefono = request.getParameter("telef");				
			out.println(g.toJson(alu.update(new Estudiantes(idestudiantes, idescuela, apellnombres, correo, telefono))));	
			break;	
	}
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
