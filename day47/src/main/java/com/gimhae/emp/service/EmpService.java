package com.gimhae.emp.service;

import org.springframework.ui.Model;

import com.gimhae.emp.model.EmpVo;

public interface EmpService {

	void list(Model model);

	int add(EmpVo bean);

	EmpVo oneList(int empno);

	boolean editList(EmpVo bean);

	boolean removeList(int empno);

}