package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardDAO {

	public void create(BoardVO boardVO) throws Exception;
	
	public BoardVO read(Integer boardNumber) throws Exception;
	
	public void update(BoardVO boardVO) throws Exception;
	
	public void delete(Integer boardNumber) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
}
