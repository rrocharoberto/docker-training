package br.edu.rocha.service;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//exemplo de URL que cai nesse método:
		//http://localhost:8080/lab7-web01/HelloService?nome=Roberto
		
		//pegando o parâmetro vindo na URL
		//se não existir o parâmetro, o valor retornado será null
		String name = request.getParameter("nome");
		String tipo = request.getParameter("tipo");
		
		if("novo".equals(tipo)) {
			
			System.out.println("setando atributo nameOfUser: " + name);
			//setar o atributo para ser usado na página NewPostForm.jsp
			request.setAttribute("nameOfUser", name);
			
			//abrir o NewPostForm.html
			RequestDispatcher disp = getServletContext().getRequestDispatcher("/NewPostForm.jsp");
			disp.forward(request, response);
			
		} else {
			//escrevendo uma resposta para ser enviada de volta para o browser
			response.getWriter().append("Hello " + name + ": agora é: " + new Date());
		}
	}
	
	//Exercício:
	//Implementar o método doPost para tratar requisições POST.
	//Criar um arquivo html com um formulário simples (1 campo e um botão) para fazer o POST.
	//Esse método deve retornar uma mensagem de acordo com o campo do formulário.

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		
		resp.getWriter().append("Email recebido: " + email);
	}
	
}
