package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//7.1.1 Exception을 화면으로 전달하는 클래스
//이 클래스의 객체가 컨트롤러에서 발생하는 Exception을 전문적으로 처리하는 클래스임을 명시
@ControllerAdvice
public class CommonExceptionAdvice {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);
	
	//Exception 타입으로 처리되는 모든 예외를 처리하도록 설정
//	@ExceptionHandler(Exception.class)
/*	public String common(Exception e) {
		
		logger.info(e.toString());
		
		return "error_common";
		
	}*/
	@ExceptionHandler(Exception.class)
	public ModelAndView common(Exception ex) {
		
		/*
		 * ModelAndView 하나의 객체에 Model 데이터와 View의 처리를 동시에 할 수 있는 객체
		 */
		ModelAndView modelandView = new ModelAndView();
		modelandView.setViewName("/error_common");
		modelandView.addObject("exception", ex);
		
		return modelandView;
		
		
	}
	
}
