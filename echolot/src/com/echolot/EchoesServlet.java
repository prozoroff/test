package com.echolot;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/echoes")
public class EchoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EchoesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Echo> echoes = new ArrayList<Echo>();
		EchoRepositoryFake repository = new EchoRepositoryFake();
        
        try{
        	echoes = repository.getAll();
        	request.setAttribute("message", "OK");
        	request.setAttribute("echoes", new Gson().toJson(echoes.toString()));
            getServletContext().getRequestDispatcher("/echoes.jsp").forward(
                  request, response);
        }
        finally{
        	
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
