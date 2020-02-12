package spring.web.project;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.web.project.Board.A3_Dao.BoardDao;
import spring.web.project.Board.Model.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class TEST2_BoardDaoTest {
	
	private static final Logger logger = LoggerFactory.getLogger(TEST2_BoardDaoTest.class);
	
	@Inject
	private BoardDao boardDao;
	
	@Test
	public void testCreate() throws Exception {
		Board board = new Board();
		System.out.println("Board 객체 생성");
		
		board.setBno(99999);
		board.setTitle("Title Test 00");
		board.setContent("Test COntent 00");
		board.setWriter("TESTER 00");
		
		if (board.getBno().equals(null)) {
			System.out.println("Board 정보 저장 실패");
		}else {
			
			boardDao.boardCreate(board);
			System.out.println("Board 객체 정보 저장 완료");
		}
	}
	
	/*@Test
	public void testRead() throws Exception {
		
		logger.info(boardDao.boardSelect(99999).toString());
		System.out.println(boardDao.boardSelect(99999));
		
	}*/
}
