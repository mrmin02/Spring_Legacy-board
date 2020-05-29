package minseok.yju.wda.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import minseok.yju.wda.domain.BoardVO;
import minseok.yju.wda.domain.Criteria;
import minseok.yju.wda.mapper.BoardMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
	Logger log = Logger.getLogger(BoardMapperTest.class);
	@Autowired
	private BoardMapper mapper;
	
//	@Test
	public void testGetList() {
		mapper.getList().forEach(board->log.info(board));
	}
	
//	@Test 
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("새로운 글 제목");
		vo.setContent("새로운 내용 내용");
		vo.setWriter("뉴비");
		
		mapper.insert(vo);
		
		log.info(vo);;
	}
//	@Test
	public  void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("새로운 글 제목");
		vo.setContent("새로운 내용 내용");
		vo.setWriter("뉴비");
		
		mapper.insertSelectKey(vo);
		
		log.info(vo);;
	}
	
//	@Test
	public void testRead() {
		BoardVO board = mapper.read(3);
		
		log.info(board);
	}
	
//	@Test
	public void testDelete() {
		log.info("delete count : "+mapper.delete(1));
	}
	
//	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setBno(2);
		vo.setTitle("새로운 글 제목 변경");
		vo.setContent("새로운 내용 내용 변경");
		vo.setWriter("뉴비 변경");
		
		log.info("update count: "+mapper.update(vo));
	}
	
	@Test
	public void testPaging() {
		Criteria crt = new Criteria();
		crt.setKeyword("새로");
		crt.setType("TC");
		List<BoardVO> list = mapper.getListWithPaging(crt);
		
		list.forEach(board->log.info(board));
	}
}
