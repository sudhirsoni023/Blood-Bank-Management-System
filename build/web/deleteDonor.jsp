<%@page import="java.sql.*,ConnectionProvider.DBConnection"%>
<%
    String id=request.getParameter("id");
    try
    {
	Connection conn = DBConnection.getConnection();
	PreparedStatement ps = conn.prepareStatement("DELETE FROM DONOR WHERE id=?");
	ps.setString(1, id);
	ps.executeUpdate();
	response.sendRedirect("editDeleteList.jsp?msg=deleted");
    }
    catch(Exception e){
	response.sendRedirect("editDeleteList.jsp?msg=not deleted");
	e.printStackTrace();
    }
%>