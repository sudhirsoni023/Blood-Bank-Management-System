<%@include file="header.html"%>
<%@include file="Footer.jsp"%>
<%@page import="java.sql.*,ConnectionProvider.DBConnection"%>
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
     <% response.setHeader("Cache-control", "no-cache");
	response.setHeader("Cache-control", "no-store");     // for preventing back button after logout..
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expire",0);
	
	String sessid=(String)session.getAttribute("username");
    if(sessid!=null)		// for preventing page opening, when someone tries to open page from url after logout...
    { 
	
%>
<br>
<center>
    <table id="customers">
	<tr>
	    <th>Name</th>
	    <th>Mobile Number</th>
	    <th>Email</th>
	    <th>Blood Group</th>
	    
	</tr>
	<tr>
	    <%
		try
		{
		    Connection conn = DBConnection.getConnection();
		    Statement st = conn.createStatement();
		    ResultSet rs = st.executeQuery("SELECT * FROM BLOODREQUEST WHERE STATUS = 'COMPLETED'");
		    while(rs.next())
		    {
			%>
			<td><%= rs.getString(1) %></td>
			<td><%= rs.getString(2) %></td>
			<td><%= rs.getString(3) %></td>
			<td><%= rs.getString(4) %></td>
			
	</tr>
			<%
		    }
		}
		catch(Exception ex)
		{
		    
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