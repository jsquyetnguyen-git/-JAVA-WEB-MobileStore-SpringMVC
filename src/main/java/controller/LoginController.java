package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.UserJDBCTemplate;
import model.User;

@Controller
public class LoginController {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserJDBCTemplate userJDBCTemplate = (UserJDBCTemplate) context.getBean("userJDBCTemplate");

	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username != null && password != null) {
			User user = userJDBCTemplate.getAdmin(username, password);
			if (user != null) {
				return new ModelAndView("admin", "admin", user.getName());
			} else {
				return new ModelAndView("login", "error", "Username or password is invalid");
			}
		}
		return new ModelAndView("login", "error", "Please enter username and password");
	}
}
