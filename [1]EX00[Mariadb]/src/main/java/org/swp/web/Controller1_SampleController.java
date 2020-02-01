package org.swp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1_SampleController {
	private static final Logger logger = LoggerFactory.getLogger(Controller1_SampleController.class);
	
	@RequestMapping("do_A")
	public void do_A() {
		logger.info("do_A id called from .......");
	}
	
	@RequestMapping("do_B")
	public void do_B() {
		logger.info("do_B id called from .......");
	}
	
}
