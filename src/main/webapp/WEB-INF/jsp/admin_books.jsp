<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>全部图书信息</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js" ></script>
    <script>
        $(function () {
            $('#header').load('admin_header.html');
        })
    </script>
</head>
<body background="img/bg2.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">

<div id="header"></div>

<%--<div style="padding: 70px 550px 10px">--%>
<div style="top: 10px;width: 100%;margin-left: 5%">
    <form   method="post" action="querybook.html" class="form-inline"  id="searchform">
        <div class="input-group" style="margin-top: 3%;margin-left: 40%">
           <input type="text" placeholder="输入图书名" class="form-control" id="search" name="searchWord" class="form-control">
            <span class="input-group-btn">
                            <input type="submit" value="搜索" class="btn btn-default">
            </span>
        </div>
    </form>
    <script>
        $("#searchform").submit(function () {
            var val=$("#search").val();
            if(val==''){
                alert("请输入关键字");
                return false;
            }
        })
    </script>
</div>
<div style="position: relative;top: 10%">
<c:if test="${!empty succ}">
    <div class="alert alert-success alert-dismissable"  style="margin-left: 10%">
        <button type="button" class="close" data-dismiss="alert"
                aria-hidden="true">
            &times;
        </button>
        ${succ}
    </div>
</c:if>
<c:if test="${!empty error}">
    <div class="alert alert-danger alert-dismissable"  style="margin-left: 10%">
        <button type="button" class="close" data-dismiss="alert"
                aria-hidden="true">
            &times;
        </button>
        ${error}
    </div>
</c:if>
</div>

<div class="panel panel-primary" style="width: 85%;top: 80px;margin-left: 13%">
    <div class="panel-heading" >
        <h3 class="panel-title">
            全部图书
        </h3>
    </div>
    <div class="panel-body">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>书名</th>
                <th>作者</th>
                <th>出版社</th>
<%--                <th>ISBN</th>--%>
<%--                <th>价格</th>--%>
                <th>剩余数量</th>
                <th>详情</th>
                <th>修改</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${books}" var="book">
            <tr>
                <td><c:out value="${book.name}"></c:out></td>
                <td><c:out value="${book.author}"></c:out></td>
                <td><c:out value="${book.publish}"></c:out></td>
<%--                <td><c:out value="${book.isbn}"></c:out></td>--%>
<%--                <td><c:out value="${book.price}"></c:out></td>--%>
                <td><c:out value="${book.number}"></c:out></td>
                <td><a href="admin_book_detail.html?bookId=<c:out value="${book.bookId}"></c:out>">
<%--                    <button type="button" class="btn btn-success btn-xs">详情</button>--%>
                    <button type="button" class="btn btn-default">详情</button>
                </a></td>
                <td><a href="updatebook.html?bookId=<c:out value="${book.bookId}"></c:out>"><button type="button" class="btn btn-success">修改</button></a></td>
                <td><a href="deletebook.html?bookId=<c:out value="${book.bookId}"></c:out>"><button type="button" class="btn btn-danger">删除</button></a></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
