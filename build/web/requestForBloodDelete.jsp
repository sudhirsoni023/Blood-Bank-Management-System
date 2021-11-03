<%@page import="java.sql.*,ConnectionProvider.DBConnection"%>
<% 
    String mobileNumber = request.getParameter("mobileNumber");
    
try
{
    Connection conn = DBConnection.getConnection();
    Statement st = conn.createStatement();
    st.executeUpdate("DELETE FROM BLOODREQUEST WHERE MOBILENUMBER='"+mobileNumber+"'");
    response.sendRedirect("requestForBlood.jsp");
}
catch(Exception ex)
{
    ex.printStackTrace();
    response.sendRedirect("requestForBlood.jsp");
}
%>