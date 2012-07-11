package by.minsler.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "A simple servlet", urlPatterns = { "/simple" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("hello from doGet() method");
		PrintWriter writer = resp.getWriter();
		writer.println("<html><head><title>");
		writer.println("My servlet");
		writer.println("</title></head><body>");
		writer.println("<h2>Hello in html</h2>");
		writer.println("method: " + req.getMethod() + " remote port: "
				+ req.getRemotePort());
		writer.println("</body></html>");
	}
}
