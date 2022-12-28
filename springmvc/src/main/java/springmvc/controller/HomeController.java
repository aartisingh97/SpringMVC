package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Aarti Singh");
		model.addAttribute("id", 1234);

		List<String> friends = new ArrayList<String>();
		friends.add("Geethika");
		friends.add("Narayan");
		friends.add("Vishuu");
		model.addAttribute("f", friends);
		return "index";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		// creating modelAndView Object
		ModelAndView modelAndView = new ModelAndView();

		// Setting data
		modelAndView.addObject("name", "Vidhyut");
		modelAndView.addObject("rollNumber", 1120);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);

		// setting view name
		modelAndView.setViewName("help");
		System.out.println("this is help url");
		return modelAndView;
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url");

		return "about";
	}

	@RequestMapping("/service")
	public ModelAndView service() {
		System.out.println("This is service url");
		// creating modelAndView Object
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name1", "Pradhyum");
		modelAndView.addObject("rollNumber1", 222);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time1", now);
		// setting view name

		List<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		modelAndView.addObject("marks", list);
		modelAndView.setViewName("service");

		return modelAndView;
	}

}
