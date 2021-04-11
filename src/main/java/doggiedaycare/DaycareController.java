package doggiedaycare;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DaycareController {
	
	@RequestMapping("/home")
	public String getAllRecipes(Model model) {
		model.addAttribute("daycares", daycareRepo.findAll());
		return "daycares";
	}

}
