package minseok.yju.wda.test;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import minseok.yju.wda.domain.BoardVO;
import minseok.yju.wda.domain.Criteria;
import minseok.yju.wda.service.BoardService;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTest {
	Logger log = Logger.getLogger(BoardServiceTest.class);
	@Autowired
	private BoardService service;
	
//	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
//	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("New Article");
		board.setContent("New Content");
		board.setWriter("ccc");
		
		service.register(board);
		
		log.info(board);
	}
//	@Test
	public void testList() {
		service.getList().forEach(board->log.info(board));
	}
	
	@Test
	public void testRead() {
		log.info("get artivle: "+service.get(3));
	}
	@Test
	public void testGetList() {
		service.getList(new Criteria(2,10)).forEach(board->log.info(board));
	}
}
