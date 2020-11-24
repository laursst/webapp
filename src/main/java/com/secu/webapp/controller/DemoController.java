package com.secu.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	Logger LOG = LoggerFactory.getLogger(DemoController.class);
	@GetMapping("/")
	public String showHome() {
		LOG.info("here");
		
		return "home";
	}
}
