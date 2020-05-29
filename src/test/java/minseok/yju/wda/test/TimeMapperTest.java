package minseok.yju.wda.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import minseok.yju.wda.mapper.TimeMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTest {
	Logger log = Logger.getLogger(TimeMapperTest.class);
	
	
	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
		
	}
	
	@Test
	public void testGetTime2() {
		log.info("getTime2: "+timeMapper.getTime2());//resource 파일에 xml 파일로 작성.
	}
}
