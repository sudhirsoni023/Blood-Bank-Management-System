<%@page import="java.sql.*,ConnectionProvider.DBConnection"%> 
<% 
    String id =request.getParameter("id");
    String name = request.getParameter("name"); 
    String fatherName = request.getParameter("fatherName"); 
    String motherName = request.getParameter("motherName"); 
    String mobileNumber = request.getParameter("mobileNumber");
    String gender = request.getParameter("gender");
    String email = request.getParameter("email");
    String bloodGroup = request.getParameter("bloodGroup");
    String address = request.getParameter("address"); 
try 
{
    Connection conn = DBConnection.getConnection(); 
    PreparedStatement ps = conn.prepareStatement("INSERT INTO DONOR values(?,?,?,?,?,?,?,?,?)");
    ps.setString(1, id); 
    ps.setString(2, name); 
    ps.setString(3, fatherName);
    ps.setString(4, motherName);
    ps.setString(5, mobileNumber); 
    ps.setString(6,gender);
    ps.setString(7, email); 
    ps.setString(8, bloodGroup); 
    ps.setString(9, address);
    ps.executeUpdate();
    response.sendRedirect("addNewDonor.jsp?msg=valid"); 
}
catch(Exception e)
{
response.sendRedirect("addNewDonor.jsp?msg=invalid"); e.printStackTrace();
}
%>
