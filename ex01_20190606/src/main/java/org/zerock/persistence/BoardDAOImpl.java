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
		System.out.println("<<DAO create>>");
		System.out.println("SqlSession Insert 시작");
		sqlSession.insert(namespace+".create",boardVO);
		System.out.println(boardVO.toString());
		System.out.println("Insert 완료");
	}

	@Override
	public BoardVO read(Integer boardNumber) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("<<DAO read>>");
		return sqlSession.selectOne(namespace+".read", boardNumber);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".update", boardVO);
		System.out.println("<<DAO update>>");
	}

	@Override
	public void delete(Integer boardNumber) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".delete", boardNumber);
		System.out.println("<<DAO delete>>");
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("<<DAO listAll>>");
		return sqlSession.selectList(namespace+".listAll");
	}

}
