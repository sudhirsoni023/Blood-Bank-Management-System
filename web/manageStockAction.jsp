<%@page import="java.sql.*,ConnectionProvider.DBConnection"%>
<% 
String bloodGroup = request.getParameter("bloodGroup");
String incdec = request.getParameter("incdec");
String units = request.getParameter("units");
int units1 = Integer.parseInt(units);
try
{
    Connection conn = DBConnection.getConnection();
    Statement st = conn.createStatement();
    if("inc".equals(incdec))
	st.executeUpdate("UPDATE STOCK SET UNITS=UNITS+'"+units1+"' WHERE BLOODGROUP='"+bloodGroup+"'");
    else
        st.executeUpdate("UPDATE STOCK SET UNITS=UNITS-'"+units1+"' WHERE BLOODGROUP='"+bloodGroup+"'");
    response.sendRedirect("manageStock.jsp?msg=valid");
}
catch(Exception ex)
{
    response.sendRedirect("manageStock.jsp?msg=invalid");
    ex.printStackTrace();
}
%>