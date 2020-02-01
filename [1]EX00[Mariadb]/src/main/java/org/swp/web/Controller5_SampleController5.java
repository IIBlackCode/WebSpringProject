package org.swp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.swp.VO.ProductVO;
import org.swp.VO.TEST_API;

@Controller
public class Controller5_SampleController5 {
	
	private static final Logger logger = LoggerFactory.getLogger(Controller5_SampleController5.class);
	
	@RequestMapping("/doTEST_API")
	public @ResponseBody TEST_API doJSON() {
		
		TEST_API vo = new TEST_API("신호","Single", "코로나바이러스", "미확정상태");
		
		return vo;
	}
}
