package org.swp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.swp.VO.ProductVO;

@Controller
public class Controller3_SampleController3 {
	
	private static final Logger logger = LoggerFactory.getLogger(Controller3_SampleController3.class);
	
	@RequestMapping("do_D")
	public String do_D( Model model ) {
		
		ProductVO product = new ProductVO("Sample Product", 100000);
		
		logger.info("do_D id called from .......");
		
		model.addAttribute(product);
		
		return "productDetail";
	}
	
}
