package minseok.yju.wda.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {// Spring framework 가 돌아가야 생기는 객체를 이용해서 테스트 할 경우. 위의 2가지 추가.
	Logger log = Logger.getLogger(DataSource.class);
	
	@Autowired
	private DataSource dataSource;  // hikari test
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;  //mybatis test
	
	@Test
	public void testConnection() throws SQLException {
		Connection con = dataSource.getConnection();  // hikari test
		
		log.info("Connection hikari --> DB");
	}
	
	@Test
	public void testConnection2() throws SQLException{
		SqlSession session = sqlSessionFactory.openSession();  //mybatis test
		Connection con = session.getConnection();//
		
		
		log.info("Connection DB   mybatis --> DB");
	}
}
