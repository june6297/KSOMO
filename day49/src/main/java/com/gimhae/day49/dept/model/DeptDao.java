package com.gimhae.day49.dept.model;

import java.util.List;
import java.util.Optional;

public interface DeptDao {
	List<DeptVo> pullList();
	DeptVo getList(int idx);
	void addList(DeptVo bean);
	int setList(DeptVo bean);
	int rmList(int idx);
	
}
