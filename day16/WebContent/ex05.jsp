<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>request ���尴ü2</h1>
<%  ///day16/ex05.jsp?q=java
	// day16 ������Ʈ�� - context��
	// ex05.jsp ��û�ϴ� ������
	String msg1=request.getProtocol();
	String msg2=request.getRequestURI();
	String msg3=request.getContextPath();
	//?q=java ex05.jsp���� �䱸�ϴ� ����
	String msg4=request.getQueryString();
	System.out.println(msg1);
	System.out.println(msg2);
	System.out.println(msg3);
	System.out.println(msg4);
%>
</body>
</html>