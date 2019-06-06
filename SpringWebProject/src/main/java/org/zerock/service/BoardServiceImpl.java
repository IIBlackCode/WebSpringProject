package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardDAO {
	
	@Inject
	private BoardDAO boardDAO;
	
	@Override
	public void create(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.create(boardVO);
	}

	@Override
	public BoardVO read(Integer boardNumber) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.read(boardNumber);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.update(boardVO);
	}

	@Override
	public void delete(Integer boardNumber) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.delete(boardNumber);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.listAll();
	}

}
