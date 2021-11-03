<%@page import="java.sql.*,ConnectionProvider.DBConnection"%>
<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String fatherName = request.getParameter("fatherName");
    String motherName = request.getParameter("motherName");
    String mobileNumber = request.getParameter("mobileNumber");
    String email = request.getParameter("email");
    String address = request.getParameter("address");
    
try
{
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = conn.prepareStatement("UPDATE DONOR SET NAME=?,FATHERNAME=?,MOTHERNAME=?,MOBILENUMBER=?,EMAIL=?,ADDRESS=? WHERE id=?");
    ps.setString(1, name);
    ps.setString(2, fatherName);
    ps.setString(3, motherName);
    ps.setString(4, mobileNumber);
    ps.setString(5, email);
    ps.setString(6, address);
    ps.setString(7, id);
    ps.executeUpdate();
    response.sendRedirect("editDeleteList.jsp?msg=edited");
}
catch(Exception ex)
{
    response.sendRedirect("editDeleteList.jsp?msg=not edited");
    ex.printStackTrace();
}
%>