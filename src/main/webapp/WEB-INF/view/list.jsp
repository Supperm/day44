<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<table border="1px">
			<tr>
				<td><input type="checkbox" id="ckb"></td>
				<td>影片名称</td>
				<td>影片导演</td>
				<td>影片票价</td>
				<td>影片上映时间</td>
				<td>影片时长</td>
				<td>影片类型</td>
				<td>影片年代</td>
				<td>影片区域</td>
				<td>影片状态</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${movieList }" var="m">
				<tr>
					<td><input type="checkbox" id="ckb" value="${m.id }"></td>
					<td>${m.name }</td>
					<td>${m.daoyan }</td>
					<td>${m.price }</td>
					<td>${m.date }</td>
					<td>${m.shi }</td>
					<td>${m.classes }</td>
					<td>${m.year }</td>
					<td>${m.qu }</td>
					<td><c:if test="${m.zhuang }==1?:'正在热播':'已下架'"></c:if></td>
					<td>添加</td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>