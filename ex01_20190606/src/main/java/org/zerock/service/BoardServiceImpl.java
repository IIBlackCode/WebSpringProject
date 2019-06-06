package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;

	@Override
	public void regist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.read(bno);
	}

	@Override
	public void modify(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.update(boardVO);
	}

	@Override
	public void remove(Integer boardNumber) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.delete(boardNumber);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.listAll();
	}
	
	

}
