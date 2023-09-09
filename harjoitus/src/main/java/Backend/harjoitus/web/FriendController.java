package Backend.harjoitus.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {
	List<String> friends = new ArrayList<>();

	@GetMapping("/friends")
	public String showFriendInfo() {
		return "friends";
	}

	@PostMapping("/friends")
	public String saveFriendInfo(@RequestParam(name = "name", required = false) String name, Model model) {
		System.out.println("POST http-method ystava: " + name);

		if (name != null && !name.isEmpty()) {
			System.out.println("lisaa ystava: " + name);
			friends.add(name);
		}
		model.addAttribute("friends", friends);
		return "friends";
	}
}