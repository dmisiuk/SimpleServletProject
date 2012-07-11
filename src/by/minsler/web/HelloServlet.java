package by.minsler.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("userName");
		String encoding = req.getCharacterEncoding();

		if (encoding == null) {
			encoding = "UTF-8";
		}
		userName = new String(userName.getBytes("8859_1"), encoding);

		out.println("Hello! " + userName + "!");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("userName");
		String encoding = req.getCharacterEncoding();

		if (encoding == null) {
			encoding = "UTF-8";
		}
		userName = new String(userName.getBytes("8859_1"), encoding);

		out.println("Hello! " + userName + "!");
		String prof = req.getParameter("prof");
		out.println("You are is a" + prof + " ");
		String[] location = req.getParameterValues("location");
		out.println("you are in " + location.length + " places:");
		for (int i = 0; i < location.length; i++) {
			out.println(location[i]);
		}
	}
}
