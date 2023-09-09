package Backend.harjoitus.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HarjoitusController {
	
	@RequestMapping("/index")
	public String showMainPage() {
		return "index";
	}
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam (name="name", required=false, defaultValue="Muumipeikko") String name,
			@RequestParam(name="age", required=false, defaultValue="100") int age,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
}
