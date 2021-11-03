<%@page import="ConnectionProvider.DBConnection" %>
<%@page import="java.sql.*" %>
<%
    try
    {
	Connection conn = DBConnection.getConnection();
	Statement st = conn.createStatement();
	st.executeUpdate(" create table bloodrequest(name varchar2(4000),mobilenumber varchar2(4000),email varchar2(4000),bloodgroup varchar2(4000),status varchar2(4000))");
	
	conn.close();
    }
    catch(Exception ex)
    {
	System.out.println(ex);
	ex.printStackTrace();
    }
    %>
