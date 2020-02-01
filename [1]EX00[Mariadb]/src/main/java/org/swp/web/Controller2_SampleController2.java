package org.swp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2_SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(Controller2_SampleController2.class);
	
	@RequestMapping("do_C")
	public String do_C( @ModelAttribute("msg") String msg ) {
		logger.info("do_C id called from .......");
		
		return "result";
	}
	
}
