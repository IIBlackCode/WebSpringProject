package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService boardService;
	
	@RequestMapping(value = "/register" , method = RequestMethod.GET)
	public void register_GET(BoardVO board, Model model) throws Exception {
		logger.info("register GET...");
	}
	
	@RequestMapping(value = "/register" , method = RequestMethod.POST)
	public String register_POST(BoardVO board, Model model, RedirectAttributes rttr) throws Exception {
		logger.info("register POST...");
		
		if (boardService.equals(null)) {
			System.out.println("BoardService 주입 실패");
		}else {
			System.out.println("BoardService 주입 성공");
		}
//		model.addAttribute("result", "success");
		rttr.addFlashAttribute("msg","success");
		
//		return "/board/success";
		return "redirect:/board/listAll";
		
	}
	
	@RequestMapping(value = "/listAll" , method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info("Show all list...");
	}
	
}
