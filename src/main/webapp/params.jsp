<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/4
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>params</title>
</head>
<body>
    <a href="params/testParam">参数绑定</a>
<!--
<form action="params/saveParam" method="post">
    姓名：<input type="text" name="username"><br/>
    密码：<input type="password" name="password"><br/>
    金额：<input type="text" name="money"><br/>
    用户名：<input type="text" name="user.uname"><br/>
    用户年龄：<input type="text" name="user.age"><br/>
    <input type="submit" value="提交">

</form>
-->
    <!--
    <form action="params/saveParam" method="post">
        姓名：<input type="text" name="username"><br/>
        密码：<input type="password" name="password"><br/>
        金额：<input type="text" name="money"><br/>

        用户名：<input type="text" name="list[0].uname"><br/>
        用户年龄：<input type="text" name="list[0].age"><br/>

        用户名：<input type="text" name="map['one'].uname"><br/>
        用户年龄：<input type="text" name="map['one'].age"><br/>
        <input type="submit" value="提交">

    </form>
    -->
    <!--自定义类型转换-->
    <!--
<form action="params/saveUser" method="post">
       用户名：<input type="text" name="uname"><br/>
    用户年龄：<input type="text" name="age"><br/>
    用户生日：<input type="text" name="date"><br/>

    <input type="submit" value="提交">
</form>
-->
    <a href="params/testServlet">Servlet原生的API</a>
</body>
</html>
