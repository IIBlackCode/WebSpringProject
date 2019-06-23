package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService boardService;
	
	//[등록]
	@RequestMapping(value = "/register" , method = RequestMethod.GET)
	public void register_GET(BoardVO board, Model model) throws Exception {
		logger.info("<<Controller register_GET() Method>>");
	}
	
	@RequestMapping(value = "/register" , method = RequestMethod.POST)
	public String register_POST(BoardVO board, Model model, RedirectAttributes rttr) throws Exception {
		logger.info("<<Controller register_POST() Method>>");
		
		if (boardService.equals(null)) {
			System.out.println("BoardService 주입 실패");
		}else {
			System.out.println("BoardService 주입 성공");
			System.out.println("입력된 정보 :"+board.toString());
		}
		System.out.println("Service 시작");
		boardService.regist(board);
		System.out.println("Service 종료");
		
		model.addAttribute("result", "success");
		rttr.addFlashAttribute("msg","success");
		
//		return "/board/success";
		return "redirect:/board/listAll";
		
	}
	
	//[게시글 목록]
	@RequestMapping(value = "/listAll" , method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info("<<Controller listAll() Method>>");
		
		model.addAttribute("list", boardService.listAll());
	}
	
	//[읽기]
	@RequestMapping(value = "/read" , method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		logger.info("<<Controller read() Method>>");
		logger.info("bno :"+ bno);
		System.out.println("Service 시작");
		model.addAttribute(boardService.read(bno));
		System.out.println("Service 종료");
	}
	
	//[삭제]
	@RequestMapping(value = "/remove" , method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, Model model, RedirectAttributes rttr) throws Exception {
		logger.info("<<Controller remove() Method>>");
		logger.info("bno :"+ bno);
		System.out.println("Service 시작");
		boardService.remove(bno);
		System.out.println("Service 종료");
		
		rttr.addFlashAttribute("msg","success");
		return "redirect:/board/listAll";
	}
	
	//[수정]
	//1. 수정버튼 클릭시 수정전 데이터 불러오기(GET 방식)
	@RequestMapping(value = "/modify" , method = RequestMethod.GET)
	public void modify_select(@RequestParam("bno") int bno, Model model, RedirectAttributes rttr) throws Exception {
		logger.info("<<Controller modify_select() Method>>");
		logger.info("bno :"+ bno);
		System.out.println("Service 시작");
		
		//model.addAttribute : Model을 이용해 JSP로 전송하는 작업
		model.addAttribute(boardService.read(bno));
		System.out.println("Service 종료");
	}
	
	//1. 수정 후 데이터 업데이트 하기
	@RequestMapping(value = "/modify" , method = RequestMethod.POST)
	public String modify_update(BoardVO board, Model model, RedirectAttributes rttr) throws Exception {
		logger.info("<<Controller modify() Method>>");
		System.out.println("Service 시작");
		boardService.modify(board);
		rttr.addFlashAttribute("msg","success");
		System.out.println("Service 종료");
		
		
		return "redirect:/board/listAll";
	}
}
