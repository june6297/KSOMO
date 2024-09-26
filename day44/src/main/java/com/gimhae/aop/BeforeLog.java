package com.gimhae.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String name=method.getName();
		int cnt=method.getParameterCount();
		System.out.println(name+"�� �Ķ���� ������ "+cnt+"�̰� ");
		System.out.println(name+"�� ������̼��� "+Arrays.toString(method.getDeclaredAnnotations()));
		System.out.println(Arrays.toString(args));
		System.out.println(target.toString());
	}

}