package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	
	public void regist(BoardVO board) throws Exception;

	public BoardVO read(Integer bno) throws Exception;
	
	public void modify(BoardVO boardVO) throws Exception;
	
	public void remove(Integer boardNumber) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;

}
