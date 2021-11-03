<%@page import="java.sql.*,ConnectionProvider.DBConnection"%>
<% 
    String mobileNumber = request.getParameter("mobileNumber");
    
try
{
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = conn.prepareStatement("UPDATE BLOODREQUEST SET STATUS='COMPLETED' WHERE MOBILENUMBER=?");
    ps.setString(1, mobileNumber);
    ps.executeUpdate();
    response.sendRedirect("requestForBlood.jsp");
}
catch(Exception ex)
{
    ex.printStackTrace();
    response.sendRedirect("requestForBlood.jsp");
}
%>