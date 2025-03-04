package com.jiangge.dao;

import com.jiangge.pojo.Admin;

import java.util.List;


public interface AdminDao {

	void add(Admin admin);

	Admin getAdminById(String id);

	List<Admin> getAll();

	Admin getByHql(String queryString,Object... params);

	void saveOrUpdate(Admin admin);
}
