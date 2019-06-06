package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "org.zerock.mapper.BoardMapper";
	
	@Override
	public void create(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".create",boardVO);
	}

	@Override
	public BoardVO read(Integer boardNumber) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".read", boardNumber);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".update", boardVO);
	}

	@Override
	public void delete(Integer boardNumber) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".delete", boardNumber);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".listAll");
	}

}
