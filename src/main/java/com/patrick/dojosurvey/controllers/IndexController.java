package com.patrick.dojosurvey.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class IndexController {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(HttpSession session) {
		return "index.jsp";
	}
	@RequestMapping(path = "/result", method = RequestMethod.POST)
	public String submit(@RequestParam(value = "name") String name, @RequestParam(value = "location") String location, @RequestParam(value = "language") String language, @RequestParam(value = "comment") String comment, Model model, HttpSession session) {
		session.setAttribute("comment", comment);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("name", name);
		return "redirect:/result";
	}
	@RequestMapping(path="/result", method = RequestMethod.GET)
	public String results(HttpSession session) {
		session.setAttribute("comment", session.getAttribute("comment"));
		session.setAttribute("location", session.getAttribute("location"));
		session.setAttribute("language", session.getAttribute("language"));
		session.setAttribute("name", session.getAttribute("name"));
		return "results.jsp";
	}
}
