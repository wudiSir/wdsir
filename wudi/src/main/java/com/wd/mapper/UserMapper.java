package com.wd.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wd.dao.User;

public interface UserMapper {
	// 查询语句
	@Select("SELECT * FROM USER WHERE ID = #{id}")
	User findById(@Param("id") int id);
	
}
