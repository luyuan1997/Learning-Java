<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td><input type="checkbox" onclick="checkAll(this)"></td>
			<th>pid</th>
			<th>商品图片</th>
			<th>商品名称</th>
			<th>市场价</th>
			<th>超市价</th>
			<th>商品描述</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${pb.list }" var="p">
			<tr>
				<td width="8%">${p.pid }</td>
				<td width="8%"><img alt="" src="${pageContext.request.contextPath }/${p.pimage}" width="80"></td>
				<td width="8%">${p.pname }</td>
				<td width="8%">${p.market_price }</td>
				<td width="8%">${p.shop_price }</td>
				<td>${p.pdesc }</td>
			</tr>
		</c:forEach>
	</table>
	<center>
		<!-- 若是第一页，首页和上一页不显示 -->
		<c:if test="${pb.currentPage !=1 }">
			<a href='${pageContext.request.contextPath}/showProductsByPage?currentPage=1'>[首页]</a>
			<a href='${pageContext.request.contextPath}/showProductsByPage?currentPage=${pb.current-1}'>[上一页</a>
		</c:if>
		
		<!-- 将所有的页码展示出来 -->
		<c:forEach begin="${pb.currentPage-5>0?pb.currentPage:0 }" end="${pb.currentPage+4>pb.totalPage?pb.totalPage:currentPage+4 }" bar="n">
			<!-- 若是当前页，不可点 -->
			<c:if test="${pb.currentPage == n }">
				${n }
			</c:if>
			<!-- 若不是当前页，可点击 -->
			<c:if test="${pb.currentPage != n }">
				<a href="${pageContext.request.contextPath }/showProductsByPage?currentPage=${n}">${n }</a>
			</c:if>
		</c:forEach>
		
		
		<!-- 若是最后一页，尾页和下一页不显示 -->
		<c:if test="${pb.currentPage != current.totalPage }">
			<a href='${pageContext.request.contextPath}/showProductsByPage?currentPage=${pb.currentPage+1}'>[下一页</a>
			<a href='${pageContext.request.contextPath}/showProductsByPage?currentPage=${pb.totalPage}'>[尾页]</a>
		</c:if>
		第${pb.currentPage }页/共${pb.totalPage }页
	</center>
</body>
</html>