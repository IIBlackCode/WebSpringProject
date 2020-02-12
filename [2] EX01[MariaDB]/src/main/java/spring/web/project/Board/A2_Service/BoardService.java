package spring.web.project.Board.A2_Service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import spring.web.project.Board.A3_Dao.BoardDao;
import spring.web.project.Board.Model.Board;

@Service
public class BoardService implements IBoardService {

	@Inject
	private BoardDao dao;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	@Override
	public void regist(Board board) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("[BoardService]regist()");
		logger.debug("[board]",board.toString());
		dao.boardCreate(board);
	}

	@Override
	public Board read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("[BoardService]read()");
		logger.debug("[bno]",bno);
		return dao.boardSelect(bno);
	}

	@Override
	public void modify(Board board) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("[BoardService]modify()");
		logger.debug("[board]",board);
		dao.boardUpdate(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("[BoardService]remove()");
		logger.debug("[bno]",bno);
		dao.boardDelete(bno);
	}

	@Override
	public List<Board> listAll() throws Exception {
		// TODO Auto-generated method stub
		logger.debug("[BoardService]listAll()");
		return dao.boardListAll();
	}

}
