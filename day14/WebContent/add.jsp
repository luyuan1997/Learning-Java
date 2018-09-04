<%@page import="com.itcast.utils.UUIDUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
</head>
<body>
	<%
		String code = UUIDUtils.getCode();
		//将code放入到session 后台进行验证
		session.setAttribute("s_token", code);
		//将code放入到pagecontext域中
		pageContext.setAttribute("r_code", code);
	%>
	<form method="post" action="${pageContext.request.contextPath }/addProduct">
		<input type="hidden" name="r_token" value="${r_code }">
		<table border="1" align="center" width="40%">
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td>市场价</td>
				<td><input type="text" name="market_price"></td>
			</tr>
			<tr>
				<td>超市价</td>
				<td><input type="text" name="shop_price"></td>
			</tr>
			<tr>
				<td>商品描述</td>
				<td><input type="text" name="pdesc"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
			</tr>
		</table>
	</form>
</body>
</html>