package org.swp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.swp.VO.ProductVO;

@Controller
public class Controller4_SampleController4 {
	
	private static final Logger logger = LoggerFactory.getLogger(Controller4_SampleController4.class);
	
	@RequestMapping("do_E")
	public String do_E( RedirectAttributes rttr ) {
		
		
		logger.info("do_E id called but redirect ro do_F.......");
		
		rttr.addFlashAttribute("msg","This is the Message !! with redirected");
		
		return "redirect:/do_F";
	}
	
	@RequestMapping("do_F")
	public String do_F( @ModelAttribute String msg ) {
		
		logger.info("do_F id called ......."+msg);
		
		msg = "test";
		
		return "do_F";
		
	}
	
}
