package minseok.yju.wda.test;

import java.util.List;
import java.util.stream.IntStream;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import minseok.yju.wda.domain.Criteria;
import minseok.yju.wda.domain.ReplyVO;
import minseok.yju.wda.mapper.ReplyMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReplyMapperTest {
	
	@Autowired
	private ReplyMapper mapper;
	
	private Logger log = Logger.getLogger(BoardMapperTest.class);
	
//	@Test
	public void testMapper() {
		log.info(mapper.getClass().getName());
	}
	
	
//	@Test
	public void testCreate() {
		IntStream.rangeClosed(1, 10).forEach(i->{
			ReplyVO vo = new ReplyVO();
			
			vo.setBno(3);
			vo.setReply("댓글 테스트"+i);
			vo.setReplyer("replyer"+i);
			
			mapper.insert(vo);
		});
	}
	
//	@Test
	public void testRead() {
		int rno = 5;
		
		ReplyVO vo = mapper.read(rno);
		log.info(vo);
	}
//	@Test
	public void testDelete() {
		int rno = 1;
		int result = mapper.delete(rno);
		log.info("삭제 결과 : "+result);
	}
	
//	@Test
	public void testUpdate() {
		int rno = 10;
		
		ReplyVO vo = mapper.read(rno);
		
		log.info("수정전: "+vo);
		
		vo.setReply("수정된 내용입니다.");
		
		int result = mapper.update(vo);
		
		vo = mapper.read(rno);
		
		log.info("업데이트 된 레코드 수:"+result +",수정된 내용: "+vo);
	}
	
	@Test
	public void testList() {
		Criteria crt = new Criteria();
		
		List<ReplyVO> replies = mapper.getListWithPaging(crt, 12);
		
		replies.forEach(reply -> log.info(reply));
	}
}
