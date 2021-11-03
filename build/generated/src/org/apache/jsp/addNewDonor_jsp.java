package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import ConnectionProvider.DBConnection;

public final class addNewDonor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("  float: left;\r\n");
      out.write("  border-right:1px solid #bbb;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li:last-child {\r\n");
      out.write("  border-right: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover:not(.active) {\r\n");
      out.write("  background-color: #111;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("  <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("  <li><a href=\"addNewDonor.jsp\">Add New Donor</a></li>\r\n");
      out.write("  <li><a href=\"editDeleteList.jsp\">Edit,Delete & List of Donor Details</a></li>\r\n");
      out.write("    <li><a href=\"manageStock.jsp\">Manage Stock</a></li>\r\n");
      out.write("  <li><a href=\"requestForBlood.jsp\">Request for Blood</a></li>\r\n");
      out.write("  <li><a href=\"requestCompleted.jsp\">Request Completed</a></li>\r\n");
      out.write("  <li style=\"float:right\"><a href=\"adminLogin.jsp\">Logout</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<style>\r\n");
      out.write("input[type=\"text\"], input[type=\"password\"], input[type=\"email\"], select,input[type=\"number\"]\r\n");
      out.write("{\r\n");
      out.write("    border: none;\r\n");
      out.write("    background:silver;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("\tpadding:15px;\r\n");
      out.write("\twidth:60%;\t\r\n");
      out.write("\tborder-radius: 25px;\r\n");
      out.write("\tmargin-left:20%;\r\n");
      out.write("}\r\n");
      out.write("h2,h1\r\n");
      out.write("{\t\r\n");
      out.write("\tmargin-left:20%;\r\n");
      out.write("}\r\n");
      out.write("hr\r\n");
      out.write("{\r\n");
      out.write("width:60%;\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

      String msg = request.getParameter("msg");
      if("valid".equals(msg))
      {
   
      out.write("\r\n");
      out.write("<center><font size=\"5\" color=\"red\"> New Donor Added Successfully.</font></center>\r\n");

}
if("invalid".equals(msg))
      {
   
      out.write("\r\n");
      out.write("<center><font size=\"5\" color=\"red\"> please fill correct details!</font></center>\r\n");

    }

      out.write("\r\n");
      out.write("    ");

	int id = 1;
	try
	{
	    Connection conn = DBConnection.getConnection();
	    Statement st = conn.createStatement();
	    ResultSet rs = st.executeQuery("SELECT MAX(ID)from donor");
	    if(rs.next())
	    {
		id=rs.getInt(1);
		id=id+1;
	    } 
    
      out.write("\r\n");
      out.write("\t    <div class=\"container\">\r\n");
      out.write("\t\t<h1 style=\"color:red\">Donor ID: ");
 out.println(id);
      out.write("</h1>\r\n");
      out.write("\t    </div>\r\n");
      out.write("      ");
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
      
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t    <form action=\"addNewDonorAction.jsp\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" value=\"");
 out.println(id);
      out.write("\">\r\n");
      out.write("\t\t<h2>Name</h2>\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"Enter your Name\" name=\"name\" required>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h2>Father Name</h2>\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"Enter your Father Name\" name=\"fatherName\" required>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h2>Mother Name</h2>\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"Enter your Mother Name\" name=\"motherName\" required>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h2>Mobile Number</h2>\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"Enter your Mobile Number\" name=\"mobileNumber\" required>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h2>Gender</h2>\r\n");
      out.write("\t\t<select name=\"gender\">\r\n");
      out.write("\t\t    <option value=\"Male\">Male</option>\r\n");
      out.write("\t\t    <option value=\"Female\">Female</option>\r\n");
      out.write("\t\t    <option value=\"Others\">Others</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h2>Email</h2>\r\n");
      out.write("\t\t<input type=\"email\" placeholder=\"Enter your Email\" name=\"email\" required>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h2>Blood Group</h2>\r\n");
      out.write("\t\t<select name=\"bloodGroup\">\r\n");
      out.write("\t\t    <option value=\"A+\">A+</option>\r\n");
      out.write("\t\t    <option value=\"A-\">A-</option>\r\n");
      out.write("\t\t    <option value=\"B+\">B+</option>\r\n");
      out.write("\t\t    <option value=\"B-\">B-</option>\r\n");
      out.write("\t\t    <option value=\"AB+\">AB+</option>\r\n");
      out.write("\t\t    <option value=\"AB-\">AB-</option>\r\n");
      out.write("\t\t    <option value=\"O+\">O+</option>\r\n");
      out.write("\t\t    <option value=\"O-\">O-</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h2>Address</h2>\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"Enter your Address\" name=\"address\" required>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<center><button class=\"button\" type=\"submit\">Save</button></center>\r\n");
      out.write("\t    </form>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t</div>\r\n");
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
