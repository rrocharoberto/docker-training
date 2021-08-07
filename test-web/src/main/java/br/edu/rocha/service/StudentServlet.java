package br.edu.rocha.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.rocha.dao.StudentMemoryDAO;
import br.edu.rocha.entities.Student;

@WebServlet("/StudentService")
public class StudentServlet extends HttpServlet {
	
	private StudentMemoryDAO dao = new StudentMemoryDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Chamou doGet de StudentService");
		
		//ajuste para editar um student
		String type = req.getParameter("type");//controla o fluxo de edição/novo
		if("edit".equals(type)) {
			processEdit(req, resp);
			return;
		}
		
		//consulta a lista do dao em memória
		List<Student> studentList = dao.listAll();

		//setar a lista como atributo do request
		req.setAttribute("studentList", studentList);
		
		//criar uma página para mostrar a lista de objetos
		//fazer o dispatch.forward(...) para uma página para mostrar a lista de objetos
		RequestDispatcher disp = getServletContext().getRequestDispatcher("/StudentList.jsp");
		disp.forward(req, resp);
	}
	
	//TODO: implementar para salvar um novo student
	//criar um formulário (arquivo jsp) para cadastrar um student
	//implementar o método doPost para salvar o student no banco de dados
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Chamou doPost de StudentService");
		
		String registerStr = req.getParameter("register");
		String name = req.getParameter("name");
		String type = req.getParameter("type");//controla o fluxo de editar/novo
		
		int register = Integer.parseInt(registerStr); //converte de String para int
		
		Student student = new Student(register, name);
		
		if("update".equals(type)) {
			dao.update(student);
		} else {
			dao.save(student);
		}
		//direciona para a tela de listagem de students
		this.doGet(req, resp);
	}
	
	//TODO: Exercício: implementar uma edição de Student.
	
	protected void processEdit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String registerStr = req.getParameter("register");
		int register = Integer.parseInt(registerStr); //converte de String para int
		
		Student student = dao.findById(register);
		if(student == null) { //se não achou criar um novo para aparecer vazio na tela
			student = new Student();
		}
		
		 //ajustei o arquivo NewStudent.jsp para receber as informações do objeto studentToEdit
		req.setAttribute("studentToEdit", student);
		//usado para controlar o fluxo no doGet e doPost devido ao edit/update
		req.setAttribute("actionType", "update");
		
		//abre a tela NewStudent.jsp
		RequestDispatcher disp = getServletContext().getRequestDispatcher("/NewStudent.jsp");
		disp.forward(req, resp);
	}
}
