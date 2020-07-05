<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/item/queryTtem.action" method="post">
条件查询：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"></td>
</tr>
</table>
商品查询：
<table width="100%" border=1>
<tr>
 <td>商品名称</td>
 <td>商品价格</td>
 <td>生产日期</td>
 <td>产品描述</td>
 <td>操作</td>
</tr>
<c:forEach items="${itemsList}" var="item">
<tr>
  <td>${item.name }</td>
  <td>${item.price}</td>
  <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
  <td>${item.detail}</td>
  <td><a href="${pageContext.request.contextPath }/item/editItem.action?id=${item.id}">修改</a></td>
</tr>
</c:forEach>
</table>
</form>

<td action="${pageContext.request.contextPath }/item/insertItem.action" method="post">
    <input type="submit" value="插入" onclick="addGoods();"></td>
    商品：
    <table width="100%" border=1>
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>生产日期</td>
            <td>产品描述</td>
            <td>操作</td>
        </tr>

            <tr>
                <td><input  id="name"></td>
                <td><input  id="price"></td>
                <td><input  id="dt" type="date"></td>
                <td><input  id="remark" value="test"></td>
                <td><input  id="insert" type="button" onclick="addGoods()">插入</td>
            </tr>
    </table>
</form>

<script type="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="ajax.js"></script>

</body>
</html>
