package org.swp.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.swp.DAO.MemberDAO;
import org.swp.VO.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class Test5_MemberDAOTest {
	
	Logger logger = LoggerFactory.getLogger(Test5_MemberDAOTest.class);
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testGetTime() {
		System.out.println("dao.getTime():"+dao.getTime());
		logger.debug("dao.getTime():"+dao.getTime());
		
	}

	@Test
	public void testInsertMember() {
		
		
		MemberVO vo = new MemberVO();
		System.out.println("저장 전 값 : "+vo.getUserid());
		
		vo.setUserid("TESTID00");
		vo.setUserpw("TESTPW00");
		vo.setUsername("TEST_NAME");
		vo.setEmail("test@test.com");
		
		logger.info("vo :"+dao.toString() );
		dao.insertMember(vo);
	}

}
