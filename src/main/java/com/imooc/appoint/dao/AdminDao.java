package com.imooc.appoint.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.appoint.entiy.Admin;

public interface AdminDao {
	//根据管理员ID验证用户是否存在 不存在则返回空对象
	Admin quaryAdmin(@Param("Admin_id")long Admin_id,@Param("Admin_password")long Admin_password);
	
	//查询所有书籍及其剩余数量
	List<HashMap<String, Integer>> quaryRest();
}
