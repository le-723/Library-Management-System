<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-default" role="navigation" style="position:fixed;z-index: 999;width: 10%;height: 100%;border: #ffffff;background-color:#fff" >

    <div class="container-fluid">
        <ul class="nav nav-pills nav-stacked" style="margin-left: 0%;margin-right:0%">
            <br>
            <li>
<%--                <a class="navbar-brand " href="reader_main.html">--%>
                <a class="active " href="reader_main.html">
                    <p class="text-primary" style="font-family: 方正舒体; font-size: 200%; ">
                        主页
                    </p>
                </a>
            </li>
            <br>
                <li>
                    <a href="reader_books.html">
                        图书查询
                    </a>
                </li>
                <li>
                    <a href="reader_info.html" >
                        个人信息
                    </a>
                </li>
                <li >
                    <a href="mylend.html" >
                        我的借还
                    </a>
                </li>
                <li >
                    <a href="reader_repasswd.html" >
                        密码修改
                    </a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="reader_info.html">${readercard.name}<br>已登录</a></li>
                <li><a href="login.html">退出</a></li>
            </ul>
        </div>
    </div>
</nav>