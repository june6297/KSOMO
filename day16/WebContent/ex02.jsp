<%@ page language="java" %>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%!
	// @�� ��Ƽ�� - Ŭ������
	int su1=1111;
	void func01(){}
	class Inner{}
%>
<%!
	// !�� ����� - Ŭ���� �� �޼��� �� (����,�޼���)
	int su2=2222;
	void func02(){}
%>
<body>
	<h1>jsp �׽�Ʈ ������</h1>
	<%
		// ��ũ��Ʈ�� - �޼���� (main )
		for(int i=0; i<3; i++){
			out.print("ȭ�鿡 ���<br>");
		}
	
		for(int i=0; i<3; i++){
	%>
	
	<% out.println("�и�"); %>
	<br>
	<%} %>
</body>
</html>











