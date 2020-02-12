package spring.web.project.Board.A3_Dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import spring.web.project.Board.Model.Board;

@Repository
public class BoardDao implements IBoardDao{
	
	@Inject
	private SqlSession session;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDao.class);
	
	private static String namespace = "org.zerock.A4_Mapper.BoardMapper";
	
	@Override
	public void boardCreate(Board vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[create() Method] board :" + vo);
		session.insert(namespace+".create",vo);
	}

	@Override
	public Board boardSelect(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void boardUpdate(Board vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boardDelete(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Board> boardListAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
