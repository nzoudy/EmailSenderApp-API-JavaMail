package com.zoudys.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import  com.zoudys.ejb.MailSenderBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MailDispatcherServlet
 */
@WebServlet(name="MailDispatcherServlet", urlPatterns="/MailDispatcherServlet")
public class MailDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private MailSenderBean mailSender;
   
    public MailDispatcherServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

response.setContentType("text/html;charset=UTF-8");
		
		String toEmail = request.getParameter("email");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		
		// properties to be read from external file or database or server properties
		// hardcode just for this example
		
		String fromEmail = "urbain.nzouda@gmail.com";
		String username = "urbain.nzouda";
		String password = "Nu12061981&";
		
		try(PrintWriter out = response.getWriter()){
			
			//call to mail sender bean
			mailSender.sendEmail(fromEmail, username, password, toEmail, subject, message);
			
			//-----------------------------------
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Mail status !!! </title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Mail status !!! </h1>");
			out.println("<b>Mail Sent successfully !!! </b><br>");
			out.println("Click <a href='emailClient.jsp'>Here</a> to get Back !!! ");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
