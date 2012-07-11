package by.minsler.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "session learing", urlPatterns = "/simpleservletsession")
public class SimpleSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<h1> Simple session servlet<h1>");
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != null && userName != ""
				&& session.getAttribute("savedUserName") == null) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		out.println("User name from request: " + userName + "<br/>");
		out.println("User name from session: "
				+ (String) session.getAttribute("savedUserName") + "<br/>");
		out.println("User name from servletContext: "
				+ (String) context.getAttribute("savedUserName") + "<br/>");

	}

}
