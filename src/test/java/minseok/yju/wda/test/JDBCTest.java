package minseok.yju.wda.test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;
import org.junit.Test;

public class JDBCTest {
	Logger log = Logger.getLogger(JDBCTest.class);
	
	@Test
	public void testConnection() throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");//maria db driver ·Îµù.
		
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/springbbs","root","2222");
		
		log.info("Connection OK");
	}
}
