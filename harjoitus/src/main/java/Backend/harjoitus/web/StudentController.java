package Backend.harjoitus.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Backend.harjoitus.model.Student;

@Controller
public class StudentController {

	@GetMapping("/students")
	public String showStudents(Model model) {
		List<Student> opiskelijat = new ArrayList<>();
		opiskelijat.add(new Student("Pikku", "Myy"));
		opiskelijat.add(new Student("Niisku", "Neiti"));
		
		model.addAttribute("students", opiskelijat);
		return "studentList";	
	}
}