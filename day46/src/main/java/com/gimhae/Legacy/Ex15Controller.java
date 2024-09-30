package com.gimhae.Legacy;

import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gimhae.emp.model.EmpVo;

public class Ex15Controller {

	
	@RequestMapping("/ex15.do")
	public String ex15(@ModelAttribute("bean") EmpVo bean) {
//		ZoneId zone = ZoneId.systemDefault();
//		model.addAttribute("bean", new EmpVO(
//				1111,2222,"test",LocalDate.now(zone)
//				));
		bean.setEmpno(3333);
		bean.setPay(4444);
		bean.setEname("tester");
		bean.setHiredate(LocalDate.now(ZoneId.systemDefault()));
		return "ex05";
	}
}
