package com.gimhae.day49.emp.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/applicationContext.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
		})

public class EmpDaoImplTest {
	@Autowired
	EmpDao empDao;
	
	@Test
	public void test1() {
		assertNotNull(empDao);
	}
	
	@Test
	public void test2PullList() {
		assertNotNull(empDao.pullList());
	}

}
