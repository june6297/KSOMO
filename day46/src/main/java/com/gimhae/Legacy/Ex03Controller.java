package com.gimhae.Legacy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex03Controller {
	@RequestMapping("/ex03.do")
	public ModelAndView ex03(HttpServletRequest req,HttpServletResponse res) {
		return new ModelAndView("ex03");
	}
}
