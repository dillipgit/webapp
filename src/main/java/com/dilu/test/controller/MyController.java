package com.dilu.test.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	

	private static Logger log = Logger.getLogger(MyController.class);
	
	@RequestMapping(value ="/show",method = RequestMethod.GET)
	public String showHome() {
		log.info("welcome page call");
		return "view";
	}
	

}
