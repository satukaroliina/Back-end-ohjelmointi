package Backend.harjoitus.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HarjoitusController {
	
	@RequestMapping("index")
	@ResponseBody
	public String showMainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(@RequestParam (name="name", required=false, defaultValue="Muumipeikko") String name, @RequestParam(name="location", required=false, defaultValue="Muumilaakso") String location) {
		return "Welcome to the " + location + " " + name + "!";
	}
		
}
