package com.appspot.myswaram;
import java.io.IOException;
import javax.servlet.http.*;

import com.appspot.myswaram.logic.*;

@SuppressWarnings("serial")
public class My_SwaramServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println(Constants.HOMEPAGE);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		String pattern = req.getParameter("pattern");
		System.out.println("pattern = " + pattern);
		resp.getWriter().println(PatternToHtmlMapper.convert(pattern));
	}

}
