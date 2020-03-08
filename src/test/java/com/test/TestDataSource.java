package com.test;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.db.sys.dao.SysLogDao;

public class TestDataSource extends TestBase{

	@Test
	public void testDataSource() throws Exception {
		DataSource ds = ctx.getBean("dataSource", DataSource.class);
		System.out.println(ds.getConnection());
	}
	
	@Test 
	public void testMybatis() {
		SqlSessionFactory ssf = 
				ctx.getBean("sqlSessionFactory", SqlSessionFactory.class);
		System.out.println(ssf);
	}
	
	@Test
	public void testSysLogDao() {
		SysLogDao sld = ctx.getBean("sysLogDao", SysLogDao.class);
		int rows = sld.deleteObjects(11,12);
		System.out.println("delete ok,rows="+rows);
	}
}
