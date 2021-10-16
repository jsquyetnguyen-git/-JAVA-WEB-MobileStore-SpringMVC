package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {
	
	@RequestMapping(value="/logout")
	public ModelAndView logout() {
		return new ModelAndView("login","error", "Please enter username and password");
	}
}
