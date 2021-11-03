<%@include file="Footer.jsp" %>
<%@include file="header.html"%>
<%@page import="ConnectionProvider.DBConnection,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<style>
input[type="text"], input[type="password"], input[type="email"], select,input[type="number"]
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	padding:15px;
	width:60%;	
	border-radius: 25px;
	margin-left:20%;
}
#special
{
    display:none;
}
h2,h1
{	
	margin-left:20%;
}
hr
{
width:60%;	
}
</style>
</head>
<body>

<%
    String id = request.getParameter("id");
    try
    {
	Connection conn = DBConnection.getConnection();
	Statement st = conn.createStatement();
	ResultSet rs = st.executeQuery("SELECT * FROM DONOR WHERE ID='"+id+"'");
	while(rs.next())
	{
%>
	    <div class="container">
		<form action="updateDonorAction.jsp" method="post">
		    <input type="text" id="special" name="id" value="<% out.println(id);%>">
		<h2>Name</h2>
		<input type="text" value="<%= rs.getString(2) %>" name="name">
		<hr>
		<h2>Father Name</h2>
		<input type="text" value="<%= rs.getString(3) %>" name="fatherName">
		<hr>
		<h2>Mother Name</h2>
		<input type="text" value="<%= rs.getString(4) %>" name="motherName">
		<hr>
		<h2>Mobile Number</h2>
		<input type="text" value="<%= rs.getString(5) %>" name="mobileNumber">
		<hr>
		<h2>Email</h2>
		<input type="email" value="<%= rs.getString(7) %>" name="email">
		<hr>
		<h2>Address</h2>
		<input type="text" value="<%= rs.getString(9) %>" name="address">
		<br>
		<center><button class="button" type="submit">Update</button></center>
	    </form>
	    </div>
	    <%
	}
    }
    catch(Exception ex)
    {
	ex.printStackTrace();
    }
%>

<br>
<br>
<br>
<br>
</body>
</html>