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
		System.out.println("<<Service regist() Method>>");
		System.out.println("입력된 정보를 보내 DAO로 쿼리 실행");
		boardDAO.create(board);
		System.out.println("DAO 실행 완료");
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("<<Service read() Method>>");
		BoardVO boardVO = boardDAO.read(bno);
		System.out.println("Service : DAO >> VO");
		System.out.println(boardVO.toString());
		return boardVO;
	}

	@Override
	public void modify(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("<<Service modify() Method>>");
		boardDAO.update(boardVO);
		System.out.println("Service : DAO >> VO");
	}

	@Override
	public void remove(Integer boardNumber) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("<<Service remove() Method>>");
		boardDAO.delete(boardNumber);
		System.out.println("Service : DAO >> VO");
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("<<Service listAll() Method>>");
		List<BoardVO> list = boardDAO.listAll();
		System.out.println("Service : DAO >> VO");
		return list;
	}

}
