<%@page import="com.itcast.utils.UUIDUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath }/editProduct">
		<!-- 将商品的id提交过去，如果没有id值，修改之后的数据没有办法保存提交到product_list.jsp文件中欧诺个 -->
		<input type="hidden" name="pid" value="${bean.pid }">
		<table border="1" align="center" width="40%">
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="pname" value="${bean.pname }"></td>
			</tr>
			<tr>
				<td>市场价</td>
				<td><input type="text" name="market_price" value="${bean.market_price }"></td>
			</tr>
			<tr>
				<td>超市价</td>
				<td><input type="text" name="shop_price" value="${bean.shop_price }"></td>
			</tr>
			<tr>
				<td>商品描述</td>
				<td><input type="text" name="pdesc" value="${bean.pdesc }"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
			</tr>
		</table>
	</form>
</body>
</html>