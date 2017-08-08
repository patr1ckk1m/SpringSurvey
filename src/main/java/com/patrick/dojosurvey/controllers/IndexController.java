package com.patrick.dojosurvey.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class IndexController {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(path = "/result", method = RequestMethod.POST)
	public String submit(@RequestParam(value = "name") String name, @RequestParam(value = "location") String location, @RequestParam(value = "language") String language, @RequestParam(value = "comment") String comment, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "redirect:/result";
	}
	@RequestMapping(path="/result", method = RequestMethod.GET)
		public String results() {
			return "results.jsp";
	}
}
