<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if("admin".equals(username) && "admin".equals(password))
    {
	response.sendRedirect("home.jsp");
	session.setAttribute("username", username);
    }
    
    else
    response.sendRedirect("adminLogin.jsp?msg=invalid");
    %>