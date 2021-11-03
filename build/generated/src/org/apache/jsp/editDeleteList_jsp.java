package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ConnectionProvider.DBConnection;
import java.sql.*;

public final class editDeleteList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Footer.jsp");
    _jspx_dependants.add("/header.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" <div class=\"footer\">\n");
      out.write("          <center><h3>All Rights Reserved @ Saraf Tech :: 2028</h3>  </center>\n");
      out.write("      </div>");
      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"css/style.css\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("      media=\"screen\"\r\n");
      out.write("    />\r\n");
      out.write("    <style>\r\n");
      out.write("      ul {\r\n");
      out.write("        list-style-type: none;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        overflow: hidden;\r\n");
      out.write("        background-color: #333;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      li {\r\n");
      out.write("        float: left;\r\n");
      out.write("        border-right: 1px solid #bbb;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      li:last-child {\r\n");
      out.write("        border-right: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      li a {\r\n");
      out.write("        display: block;\r\n");
      out.write("        color: white;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        padding: 14px 16px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      li a:hover:not(.active) {\r\n");
      out.write("        background-color: #111;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .active {\r\n");
      out.write("        background-color: #4caf50;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("      <li><a href=\"addNewDonor.jsp\">Add New Donor</a></li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"editDeleteList.jsp\">Edit,Delete & List of Donor Details</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li><a href=\"manageStock.jsp\">Manage Stock</a></li>\r\n");
      out.write("      <li><a href=\"requestForBlood.jsp\">Request for Blood</a></li>\r\n");
      out.write("      <li><a href=\"requestCompleted.jsp\">Request Completed</a></li>\r\n");
      out.write("      <li style=\"float: right\"><a href=\"adminLogin.jsp\">Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("#customers {\r\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 95%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#customers td, #customers th {\r\n");
      out.write("  border: 1px solid #ddd;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\r\n");
      out.write("\r\n");
      out.write("#customers tr:hover {background-color: #ddd;}\r\n");
      out.write("\r\n");
      out.write("#customers th {\r\n");
      out.write("  padding-top: 12px;\r\n");
      out.write("  padding-bottom: 12px;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");

    String msg = request.getParameter("msg");
    if("edited".equals(msg))
    {

      out.write("\r\n");
      out.write("<font color=\"red\" size=\"5\">Successfully Updated</font>\r\n");
 }
else if("not edited".equals(msg)){

      out.write("\r\n");
      out.write("<font color=\"red\" size=\"5\">Something Went Wrong while updating.</font>\r\n");
 }
else if("deleted".equals(msg))
    {

      out.write("\r\n");
      out.write("<font color=\"red\" size=\"5\">Successfully Deleted</font>\r\n");
 }
else if("not deleted".equals(msg)) {

      out.write("\r\n");
      out.write("<font color=\"red\" size=\"5\">Something Went Wrong while deleting.</font>\r\n");
 } 
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<table id=\"customers\">\r\n");
      out.write("    <tr>\r\n");
      out.write("\t<th>ID</th>\r\n");
      out.write("\t<th>Name</th>\r\n");
      out.write("\t<th>Father Name</th>\r\n");
      out.write("\t<th>Mother Name</th>\r\n");
      out.write("\t<th>Mobile Number</th>\r\n");
      out.write("\t<th>Gender</th>\r\n");
      out.write("\t<th>Email</th>\r\n");
      out.write("\t<th>Blood Group</th>\r\n");
      out.write("\t<th>Address</th>\r\n");
      out.write("\t<th>Edit</th>\r\n");
      out.write("\t<th>Delete</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("\t");

	try
	{
	    Connection conn = DBConnection.getConnection();
	    Statement st = conn.createStatement();
	    ResultSet rs = st.executeQuery("SELECT * from DONOR");
	    while(rs.next())
	    {
	    
      out.write("\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(1));
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(2));
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(3));
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(4));
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(5));
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(6));
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(7));
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(8));
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( rs.getString(9));
      out.write("</td>\r\n");
      out.write("\t    <td><a href=\"updateDonor.jsp?id=");
      out.print( rs.getString(1));
      out.write("\">Edit</a></td>\r\n");
      out.write("\t     <td><a href=\"deleteDonor.jsp?id=");
      out.print( rs.getString(1));
      out.write("\">Delete</a></td>\r\n");
      out.write("\t     </tr>\r\n");
      out.write("\t    ");

		}
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	 
      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
