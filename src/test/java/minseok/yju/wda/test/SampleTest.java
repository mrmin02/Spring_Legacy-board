package minseok.yju.wda.test;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;

import minseok.yju.wda.domain.Ticket;



//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringRunner.class)
@WebAppConfiguration// controller 를 Test 할 때 사용
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"}
		)
public class SampleTest {
	
	@Autowired
	private WebApplicationContext ctx;
	private MockMvc mockMvc;
	
	private Logger log = Logger.getLogger(BoardControllerTest.class);
	@Before
	public void setup() {//test 실행전 실행
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Autowired
	private Restaurant restaurant;
	
	
	@Test
	public void testConvert() throws Exception{
		Ticket ticket = new Ticket();
		ticket.setTno(1233);
		ticket.setOwner("admin");
		ticket.setGrade("AAA");
		
		String jsonStr = new Gson().toJson(ticket);
		log.info(jsonStr);
		
//		mockMvc.perform(post("/rest/ticket").contentType(MediaType.APPLICATION_JSON).content(jsonStr)).andExpect(status().is(200));
		mockMvc.perform(post("/rest/ticket").contentType(MediaType.APPLICATION_JSON).content(jsonStr)).andExpect(status().is(200));
	}
	
	
//	@Test
	public void testExist() {
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("-----------------------------------");
		log.info(restaurant.getChef());
		
	}
	
}
