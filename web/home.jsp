<%@include file="Footer.jsp" %>
<%@include file="header.html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
img{
width:100%;
height:609px;
}</style>
</head>
<body>
    <% 
	response.setHeader("Cache-control", "no-cache");
	response.setHeader("Cache-control", "no-store");     // for preventing back button after logout..
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expire",0);
	
    String sessid=(String)session.getAttribute("username");
    if(sessid!=null)		// for preventing page opening, when someone tries to open page from url after logout...
    {
  %>  
<br>
<div style="max-width:100%">
  <img class="mySlides"  src="Images/welcome.jpg" >
  <img class="mySlides"  src="Images/admin.PNG" >
   <img class="mySlides"  src="Images/slide1.jpg" >
</div>
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
<br>
<% }  else 
{
    response.sendRedirect("adminLogin.jsp?msg=login_please");
} %>
</body>
</html>