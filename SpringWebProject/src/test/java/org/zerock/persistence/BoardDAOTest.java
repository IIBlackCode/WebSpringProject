package org.zerock.persistence;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;
	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(BoardDAOTest.class);
	
	/*@Test
	public void testCreate() throws Exception {
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle(" 제목 입력 ");
		boardVO.setContent(" 내용 입력 ");
		boardVO.setWriter(" 글쓴이 ");
		dao.create(boardVO);
	}*/

	/*@Test
	public void testRead() throws Exception {
		logger.info(dao.read(2).toString());
	}*/

	/*@Test
	public void testUpdate() throws Exception {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setBno(2);
		boardVO.setTitle(" input Title ");
		boardVO.setContent(" input Content ");
		dao.update(boardVO);
	}*/

	@Test
	public void testDelete() throws Exception {
		dao.delete(2);
	}

	/*@Test
	public void testListAll() {
		fail("Not yet implemented");
	}*/

}
