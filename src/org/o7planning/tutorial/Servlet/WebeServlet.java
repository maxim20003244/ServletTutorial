package org.o7planning.tutorial.Servlet;

import javax.servlet.annotation.WebInitParam;

public @interface WebServlet {

	String[] urlPaterns();

	WebInitParam[] initParms();

}
