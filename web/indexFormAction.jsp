<%@page import="ConnectionProvider.DBConnection"%> <%@page import="java.sql.*"%>
<% String name = request.getParameter("name"); String mobileNumber =
request.getParameter("mobileNumber"); String email =
request.getParameter("email"); String bloodGroup =
request.getParameter("bloodGroup"); String status = "pending"; try { Connection
conn = DBConnection.getConnection(); PreparedStatement pst =
conn.prepareStatement("INSERT INTO bloodrequest values(?,?,?,?,?)");
pst.setString(1,name); pst.setString(2,mobileNumber); pst.setString(3,email);
pst.setString(4,bloodGroup); pst.setString(5,status); pst.executeUpdate();
response.sendRedirect("index.jsp?msg=valid"); } catch(Exception e) {
e.printStackTrace(); response.sendRedirect("index.jsp?msg=invalid"); } %>
