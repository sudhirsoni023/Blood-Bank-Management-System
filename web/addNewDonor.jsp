<%@include file="Footer.jsp" %>
<%@include file="header.html"%>
<%@page import="java.sql.*,ConnectionProvider.DBConnection"%>

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
#special{
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
	response.setHeader("Cache-control", "no-cache");
	response.setHeader("Cache-control", "no-store");     // for preventing back button after logout..
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expire",0);
	
	String sessid=(String)session.getAttribute("username");
    if(sessid!=null)		// for preventing page opening, when someone tries to open page from url after logout...
    {
      String msg = request.getParameter("msg");
      if("valid".equals(msg))
      {
   %>
<center><font size="5" color="red"> New Donor Added Successfully.</font></center>
<%
}
if("invalid".equals(msg))
      {
   %>
<center><font size="5" color="red"> please fill correct details!</font></center>
<%
    }
%>
    <%
	int id = 1;
	try
	{
	    Connection conn = DBConnection.getConnection();
	    Statement st = conn.createStatement();
	    ResultSet rs = st.executeQuery("SELECT MAX(ID)from donor");
	    if(rs.next())
	    {
		id=rs.getInt(1);
		id=id+1;
	    } 
    %>
	    <div class="container">
		<h1 style="color:red">Donor ID: <% out.println(id);%></h1>
	    </div>
      <%	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
      %>
	<div class="container">
	    <form action="addNewDonorAction.jsp" method="post">
		<input type="text" name="id"  id="special" value="<% out.println(id);%>">
		<h2>Name</h2>
		<input type="text" placeholder="Enter your Name" name="name" required>
		<hr>
		<h2>Father Name</h2>
		<input type="text" placeholder="Enter your Father Name" name="fatherName" required>
		<hr>
		<h2>Mother Name</h2>
		<input type="text" placeholder="Enter your Mother Name" name="motherName" required>
		<hr>
		<h2>Mobile Number</h2>
		<input type="text" placeholder="Enter your Mobile Number" name="mobileNumber" required>
		<hr>
		<h2>Gender</h2>
		<select name="gender">
		    <option value="Male">Male</option>
		    <option value="Female">Female</option>
		    <option value="Others">Others</option>
		</select>
		<hr>
		<h2>Email</h2>
		<input type="email" placeholder="Enter your Email" name="email" required>
		<hr>
		<h2>Blood Group</h2>
		<select name="bloodGroup">
		    <option value="A+">A+</option>
		    <option value="A-">A-</option>
		    <option value="B+">B+</option>
		    <option value="B-">B-</option>
		    <option value="AB+">AB+</option>
		    <option value="AB-">AB-</option>
		    <option value="O+">O+</option>
		    <option value="O-">O-</option>
		</select>
		<hr>
		<h2>Address</h2>
		<input type="text" placeholder="Enter your Address" name="address" required>
		<br>
		<center><button class="button" type="submit">Save</button></center>
	    </form>
		<br>
		<br>
		<br>
		<br>
	</div>
<% } 
else
{
response.sendRedirect("adminLogin.jsp?msg=login_please");
} %>
</body>
</html>