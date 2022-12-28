package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	public UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Signup using ModelAttribute");
		m.addAttribute("Desc", "It will add common data to any page using @ModelAttribute on method");
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		this.userService.createUser(user);
		return "success";
	}
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String
	 * userEmail, @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * // System.out.println("Email:" + userEmail); //
	 * System.out.println("User Name:" + userName); // System.out.println("Password"
	 * + userPassword);
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword); model.addAttribute("user", user);
	 * System.out.println(user);
	 * 
	 * // model.addAttribute("name", userName); // model.addAttribute("email",
	 * userEmail); // model.addAttribute("password", userPassword);
	 * 
	 * return "success"; }
	 */

}
