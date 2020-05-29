package minseok.yju.wda.test;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@WebAppConfiguration// controller 를 Test 할 때 사용
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class BoardControllerTest {
	
	@Autowired
	private WebApplicationContext ctx;
	private MockMvc mockMvc;
	
	private Logger log = Logger.getLogger(BoardControllerTest.class);
	@Before
	public void setup() {//test 실행전 실행
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
//	@Test
	public void testList() throws Exception{
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn().getModelAndView()
				.getModelMap());
	}
//	@Test
	public void testRegister() throws Exception{
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
				.param("title", "테스트 제목 기록")
				.param("content","테스트 새글 내뇽")
				.param("writer","글쓴이00")).andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
//	@Test
	public void testModify() throws Exception{
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
				.param("bno", "4")
				.param("title", "수정테스트 제목 기록")
				.param("content","수정테스트 새글 내뇽")
				.param("writer","수정글쓴이00")).andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
//	@Test
	public void testRemove() throws Exception{
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
				.param("bno", "4")).andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
	@Test 
	public void testListPaging() throws Exception{
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list")
				.param("pageNum","2")
				.param("amount","10"))
				.andReturn()
				.getModelAndView().getModelMap());
	}
}
