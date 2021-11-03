<%@include file="Footer.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
 <link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<style>
input[type="text"], input[type="password"], input[type="submit"]
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	margin-left:35%;
	padding:15px;
	width:33%;	
	border-radius: 25px;
}
</style>
</head>
<body>
<div class="header">
  <a href="#default" class="logo"><img class="logo" src="Images/Logo1.png"></a>
  <div class="header-right">
    <a href="index.jsp">Home</a>
    <a class="active" href="adminLogin.jsp">Admin Login</a>
  </div>
</div>
<div class="container">
<br>
<%
    String msg = request.getParameter("msg");
    if("invalid".equals(msg))
    {
%>
<center><font size="5" color="red">Invalid Username Or Password</font></center>
<% } 
if("login_please".equals(msg))
{
%>
<center><font size="5" color="red">Please Login Here</font></center>
<% } %>
	<br>
	<form action="adminLoginAction.jsp" method="post">
	    <div class="form-group">
		<center><h2>Username</h2></center>
		<input type="text" placeholder="Enter your Username" name="username" required>
		<center><h2>Password</h2></center>
		<input type="password" placeholder="Enter your Password" name="password" required>
		<center><button type="submit" class="button">Submit</button></center>
	    </div>
	</form>
</div>
<br>
<br>
<br>
<br>
</body>
</html>
