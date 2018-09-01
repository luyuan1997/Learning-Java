<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="20%">
		<tr>
			<td>商品名称</td>
			<td>商品数量</td>
		</tr>
		<%
			//获取购物车
			Map<String,Integer> map = (Map<String,Integer>)session.getAttribute("cart");
			//判断购物车是否为空
			if(map==null){
				//若为空，提示信息您的购物车空空如也，开始愉快的购物吧。
				out.print("<tr><td colspan='2'>您的购物车空空如也，开始愉快的购物吧</td></tr>");
			}else{
				//若不为空，遍历购物车
				for(String name : map.keySet()){
					out.print("<tr>");
					out.print("<td>");
					out.print(name);
					out.print("</td>");
					out.print("<td>");
					out.print(map.get(name));
					out.print("</td>");
					out.print("</tr>");
				}
			}	
		%>
	</table>
	<hr>
	<center>
		<a href="/0831/product_list.jsp">继续购物</a>&nbsp;&nbsp;&nbsp;
		<a href="/0831/clearCart">清空购物车</a>
	</center>
</body>
</html>