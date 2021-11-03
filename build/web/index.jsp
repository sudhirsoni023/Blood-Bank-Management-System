<%@include file="Footer.jsp" %>
<html>
  <head>
    <link
      rel="stylesheet"
      href="css/style.css"
      type="text/css"
      media="screen"
    />
    <style>
      .mySlides {
        display: none;
      }

      input[type="text"],
      input[type="email"] {
        border: none;
        background: silver;
        height: 50px;
        font-size: 16px;
        margin-left: 2%;
        padding: 15px;
      }
    </style>
  </head>
  <body>
    <div class="header">
      <a href="#default" class="logo"
        ><img class="logo" src="Images/Logo1.png"
      /></a>
      <div class="header-right">
        <a class="active" href="index.jsp">Home</a>
        <a href="adminLogin.jsp">Admin Login</a>
      </div>
    </div>

    <div style="max-width: 100%">
      <img class="mySlides" src="Images/slide1.jpg" />
      <img class="mySlides" src="Images/slide2.png" />
    </div>
    <script>
      var myIndex = 0;
      carousel();

      function carousel() {
        var i;
        var x = document.getElementsByClassName("mySlides");
        for (i = 0; i < x.length; i++) x[i].style.display = "none";
        myIndex++;
        if (myIndex > x.length) myIndex = 1;
        x[myIndex - 1].style.display = "block";
        setTimeout(carousel, 2000); // Change image every 2 seconds
      }
    </script>

    <br />
    <% String msg = request.getParameter("msg");
    if("valid".equals(msg)) { %>
    <center>
      <font size="5" color="red">
        Your Details Submitted Successfully, You will be notified within 24
        hours.</font
      >
    </center>
    <% } if("invalid".equals(msg)) { %>
    <center>
      <font size="5" color="red"> please fill correct details!</font>
    </center>
    <% } %>
    <center><h1>Enter your Details to Request for Blood</h1></center>
    <form action="indexFormAction.jsp" method="post">
      <center>
        <input type="text" name="name" placeholder="Enter Name" required />
        <input
          type="text"
          name="mobileNumber"
          placeholder="Enter Mobile Number"
          required
        />
        <input
          type="email"
          name="email"
          placeholder="Enter Email Address"
          required
        />
        <input
          type="text"
          name="bloodGroup"
          placeholder="Enter Blood Group"
          required
        />
        <button class="button1"><span>Submit</span></button>
      </center>
    </form>
    <br />
    <br />
    <div class="row1">
      <div class="container">
        <br />
        <br />
      </div>
    </div>
    <!--<center><h3>All Rights Reserved @ Saraf Tech :: 2028</h3>  </center>
-->
  </body>
</html>
