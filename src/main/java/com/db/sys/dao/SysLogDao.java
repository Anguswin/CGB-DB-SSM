package com.db.sys.dao;

import org.apache.ibatis.annotations.Param;

public interface SysLogDao {

	int deleteObjects(@Param("ids") Integer... id);
}
