<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav style="position:fixed;z-index: 999;width: 10%;height: 100%;border: #006699;background-color: #006699" class="navbar navbar-default"
     role="navigation">
    <div class="container-fluid">
        <ul class="nav nav-pills nav-stacked" style="margin-left: 0%;margin-right:0%">
            <br>
                <li>
                    <a class="dropdown-toggle" href="admin_main.html" style="font-family: 方正舒体;font-size: 200%; color: white">主页</a>
                </li>
<br>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: white">
                        图书管理
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="admin_books.html">全部图书</a></li>
                        <li class="divider"></li>
                        <li><a href="book_add.html">增加图书</a></li>
                    </ul>
                </li>
    <br>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: white">
                        读者管理
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="allreaders.html">全部读者</a></li>
                        <li class="divider"></li>
                        <li><a href="reader_add.html">增加读者</a></li>
                    </ul>
                </li>
    <br>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: white">
                        借还管理
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="lendlist.html">借还日志</a></li>
                    </ul>
                </li>
    <br>
                <li >
                    <a href="admin_repasswd.html" style="color: white">
                       密码修改
                    </a>
                </li>
    <br>
            <li>
                <a href="#" style="color: white" data-toggle="modal" data-target="#myModal">
                    ${admin.username}<br>已登录</a>
            </li>
    <br>
                <li>
                    <a href="logout.html" style="color: white">退出</a>
                </li>
                <br>
            </ul>
    </div>
</nav>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    温馨提示
                </h4>
            </div>
            <div class="modal-body">
                使用结束后请安全退出。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">知道了
                </button>
            </div>
        </div>
    </div>
</div>