<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		//获取制定名称的cookie的ids
		Cookie c =CookieUtils.getCookieByName("ids",request.getCookie());
		//判断是否为空
		if(c==null){
	%>
		<h2>暂无浏览记录</h2>
	<%
		}else{
			String[] arr = c.getValue().split("-");
			for(String id : arr){
	%>
	//图片的信息展示
	<%
			}
		}		
	%>
</body>
</html>