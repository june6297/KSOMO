package com.gimhae.framework.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MyController {
	String execute(HttpServletRequest req, HttpServletResponse resp);
}
