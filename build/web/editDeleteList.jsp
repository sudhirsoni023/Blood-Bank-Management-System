<%@include file="Footer.jsp"%>
<%@include file="header.html"%>
<%@page import="ConnectionProvider.DBConnection,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 95%;
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
    if("edited".equals(msg))
    {
%>
<center><font color="red" size="5">Successfully Updated</font></center>
<% }
else if("not edited".equals(msg)){
%>
<center><font color="red" size="5">Something Went Wrong while updating.</font></center>
<% }
else if("deleted".equals(msg))
    {
%>
<center><font color="red" size="5">Successfully Deleted</font></center>
<% }
else if("not deleted".equals(msg)) {
%>
<center><font color="red" size="5">Something Went Wrong while deleting.</font></center>
<% } %>
<center>
<table id="customers">
    <tr>
	<th>ID</th>
	<th>Name</th>
	<th>Father Name</th>
	<th>Mother Name</th>
	<th>Mobile Number</th>
	<th>Gender</th>
	<th>Email</th>
	<th>Blood Group</th>
	<th>Address</th>
	<th>Edit</th>
	<th>Delete</th>
    </tr>
    <tr>
	<%
	try
	{
	    Connection conn = DBConnection.getConnection();
	    Statement st = conn.createStatement();
	    ResultSet rs = st.executeQuery("SELECT * from DONOR ORDER BY id");
	    while(rs.next())
	    {
	    %>
	    <td><%= rs.getString(1)%></td>
	    <td><%= rs.getString(2)%></td>
	    <td><%= rs.getString(3)%></td>
	    <td><%= rs.getString(4)%></td>
	    <td><%= rs.getString(5)%></td>
	    <td><%= rs.getString(6)%></td>
	    <td><%= rs.getString(7)%></td>
	    <td><%= rs.getString(8)%></td>
	    <td><%= rs.getString(9)%></td>
	    <td><a href="updateDonor.jsp?id=<%= rs.getString(1)%>">Edit</a></td>
	     <td><a href="deleteDonor.jsp?id=<%= rs.getString(1)%>">Delete</a></td>
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
<br>
<br>
<br>
<br>
<% } else
{
response.sendRedirect("adminLogin.jsp?msg=login_please");
} %>
</body>
</html>