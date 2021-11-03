<%@page import="java.sql.*,ConnectionProvider.DBConnection"%>
<%@include file="Footer.jsp" %>
<%@include file="header.html"%>
<html>
<head>
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<style>
input[type="text"], input[type="password"], input[type="submit"],select
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

#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 55%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>
    <div class="container">
<br>
<%
        response.setHeader("Cache-control", "no-cache");
	response.setHeader("Cache-control", "no-store");     // for preventing back button after logout..
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expire",0);
	
	String sessid=(String)session.getAttribute("username");
    if(sessid!=null)		// for preventing page opening, when someone tries to open page from url after logout...
    {
    String msg = request.getParameter("msg");
    if("invalid".equals(msg))
    {
%>
<center><font color="red" size="5">Something Went Wrong.</font></center>
<% } 
if("valid".equals(msg))
    {
%>
<center><font color="red" size="5">Successfully Updated.</font></center>
<% } %>
<form action="manageStockAction.jsp" method="post">
    <div class="form-group">
	<center><h2>Select Blood Group</h2></center>
	<select name="bloodGroup">
	    <option value="A+">A+</option>
	    <option value="A-">A-</option>
	    <option value="B+">B+</option>
	    <option value="B-">B-</option>
	    <option value="AB+">AB+</option>
	    <option value="AB-">AB-</option>
	    <option value="O+">O+</option>
	    <option value="O+">O-</option>
	</select>
	<center><h2>Select Increase OR Decrease</h2></center>
	<select name="incdec">
	 <option value="inc">Increase</option>
	 <option value="dec">Decrease</option>
	 </select>
	<center><h2>Units</h2></center>
	<input type="text" placeholder="Enter no of units" name="units">
<br>
<br>
	<center><button type="submit" class="button">Save</button></center>

    </div>
</form>
<center>
    <table id="customers">
	<tr>
	    <th>Blood Group</th>
	    <th>Units</th>
	</tr>	
	<tr>
	    <% 
try
{
    Connection conn = DBConnection.getConnection();
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM STOCK");
    while(rs.next())
    {
%>
<td><%= rs.getString(1)%></td>
<td><%= rs.getString(2)%></td>
</tr>
<%
    }
}
catch(Exception ex)
{
 ex.printStackTrace();
}
		%>
    </table>
</center>
    </div>
 
<br>
<br>
<br>
<br>
<br>
<br>
<% }
else {
response.sendRedirect("adminLogin.jsp?msg=login_please");
}
%>
</body>
</html>