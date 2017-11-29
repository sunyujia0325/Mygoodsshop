<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title> 登录和注册</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Internship Sign In & Sign Up Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="../static/css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">
<link href="../static/css/snow.css" rel="stylesheet" type="text/css" media="all" />
<link href="../static/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<!--<link href="//fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">-->

<!-- //web font -->
</head>
<body>
<div class="snow-container">
			  <div class="snow foreground"></div>
			  <div class="snow foreground layered"></div>
			  <div class="snow middleground"></div>
			  <div class="snow middleground layered"></div>
			  <div class="snow background"></div>
			  <div class="snow background layered"></div>
			</div>

<div class="top-buttons-agileinfo">
<a href="index.html" >返回主页</a><a href="login.jsp"  class="active">登录</a><a href="signup.html">注册</a>
</div>
<h1>登录和注册
</h1>
<div class="main-agileits">
<!--form-stars-here-->
        <form action="login" method="post">
		<div class="form-w3-agile">
			<h2 class="sub-agileits-w3layouts">登录</h2>
			
					<input type="text" name="customerName" placeholder="用户名" required="" />
					<input type="password" name="customerPassword" placeholder="密码" required="" />
					<a href="#" class="forgot-w3layouts">忘记密码 ?</a>
				<div class="submit-w3l">
					<input type="submit" value="登录">
				</div>
				<p class="p-bottom-w3ls"><a href="signup.html">点击注册</a>如果你没有一个帐户。</p>
		</div>
		</form>
        </div>
        <c:if test="${flag }">
        <div class="alert alert-danger alert-dismissable" role="alert">
            <button class="close" type="button" data-dismiss="alert">&times;</button>
                      用户名或密码错误，请重试！
            <%
            session.removeAttribute("flag");
            %>
        </div>
        </c:if>
<!--//form-ends-here-->
<!-- copyright -->
	<div class="copyright w3-agile">
		<p> © 2017</p>
	</div>
	<!-- //copyright --> 
	<script type="text/javascript" src="../static/js/jquery-2.1.4.min.js"></script>

</body>
</html>