package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Footer.jsp");
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"css/style.css\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("      media=\"screen\"\r\n");
      out.write("    />\r\n");
      out.write("    <style>\r\n");
      out.write("      .mySlides {\r\n");
      out.write("        display: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      input[type=\"text\"],\r\n");
      out.write("      input[type=\"email\"] {\r\n");
      out.write("        border: none;\r\n");
      out.write("        background: silver;\r\n");
      out.write("        height: 50px;\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        margin-left: 2%;\r\n");
      out.write("        padding: 15px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("      <a href=\"#default\" class=\"logo\"\r\n");
      out.write("        ><img class=\"logo\" src=\"Images/Logo1.png\"\r\n");
      out.write("      /></a>\r\n");
      out.write("      <div class=\"header-right\">\r\n");
      out.write("        <a class=\"active\" href=\"index.jsp\">Home</a>\r\n");
      out.write("        <a href=\"adminLogin.jsp\">Admin Login</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div style=\"max-width: 100%\">\r\n");
      out.write("      <img class=\"mySlides\" src=\"Images/slide1.jpg\" />\r\n");
      out.write("      <img class=\"mySlides\" src=\"Images/slide2.png\" />\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("      var myIndex = 0;\r\n");
      out.write("      carousel();\r\n");
      out.write("\r\n");
      out.write("      function carousel() {\r\n");
      out.write("        var i;\r\n");
      out.write("        var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("        for (i = 0; i < x.length; i++) x[i].style.display = \"none\";\r\n");
      out.write("        myIndex++;\r\n");
      out.write("        if (myIndex > x.length) myIndex = 1;\r\n");
      out.write("        x[myIndex - 1].style.display = \"block\";\r\n");
      out.write("        setTimeout(carousel, 2000); // Change image every 2 seconds\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <br />\r\n");
      out.write("    ");
 String msg = request.getParameter("msg");
    if("valid".equals(msg)) { 
      out.write("\r\n");
      out.write("    <center>\r\n");
      out.write("      <font size=\"5\" color=\"red\">\r\n");
      out.write("        Your Details Submitted Successfully, You will be notified within 24\r\n");
      out.write("        hours.</font\r\n");
      out.write("      >\r\n");
      out.write("    </center>\r\n");
      out.write("    ");
 } if("invalid".equals(msg)) { 
      out.write("\r\n");
      out.write("    <center>\r\n");
      out.write("      <font size=\"5\" color=\"red\"> please fill correct details!</font>\r\n");
      out.write("    </center>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("    <center><h1>Enter your Details to Request for Blood</h1></center>\r\n");
      out.write("    <form action=\"indexFormAction.jsp\" method=\"post\">\r\n");
      out.write("      <center>\r\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Enter Name\" required />\r\n");
      out.write("        <input\r\n");
      out.write("          type=\"text\"\r\n");
      out.write("          name=\"mobileNumber\"\r\n");
      out.write("          placeholder=\"Enter Mobile Number\"\r\n");
      out.write("          required\r\n");
      out.write("        />\r\n");
      out.write("        <input\r\n");
      out.write("          type=\"email\"\r\n");
      out.write("          name=\"email\"\r\n");
      out.write("          placeholder=\"Enter Email Address\"\r\n");
      out.write("          required\r\n");
      out.write("        />\r\n");
      out.write("        <input\r\n");
      out.write("          type=\"text\"\r\n");
      out.write("          name=\"bloodGroup\"\r\n");
      out.write("          placeholder=\"Enter Blood Group\"\r\n");
      out.write("          required\r\n");
      out.write("        />\r\n");
      out.write("        <button class=\"button1\"><span>Submit</span></button>\r\n");
      out.write("      </center>\r\n");
      out.write("    </form>\r\n");
      out.write("    <br />\r\n");
      out.write("    <br />\r\n");
      out.write("    <div class=\"row1\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <br />\r\n");
      out.write("        <br />\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--<center><h3>All Rights Reserved @ Saraf Tech :: 2028</h3>  </center>\r\n");
      out.write("-->\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
