package projectdemo.webproject;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public ModelAndView indexPage()
	{
		ModelAndView modelAndView=new ModelAndView("index");
	    return modelAndView;
	}
	
	@RequestMapping("/contact")
	public String  contactPage(Model model,HttpSession session) {
		session.setAttribute("name","Raghuveer Reddy");
		model.addAttribute("date", new Date());
		return "contact";
	}
	@RequestMapping("/home")
	public  ModelAndView getDate()
	{
		ModelAndView modelAndView=new ModelAndView("home");
		modelAndView.addObject("date", new Date());
		return modelAndView;
	}

}
