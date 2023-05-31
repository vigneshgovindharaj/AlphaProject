<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style type="text/css">
	*{
		margin: 0;
		padding: 0;
	}
	body{
	background-image: url(https://www.wbcsd.org/var/site/storage/images/programs/climate-and-energy/climate-energy/ncs/resources/the-nature-conservancy/74798-1-eng-GB/Natural-Climate-Solutions_i1140.jpg);
	}
	
	h1{
	text-align: center;
	margin-top: 250px;
	}
	label{
	text-align: center;
	margin-top: 30px;
	margin-left: 500px;
	}
	button{
	margin-left: 625px;
	}
</style>

out.println("<script type="text/javascript">");
	
	var t1 = document.form["myform"]["t1"].value;
	var t2 = document.form["myform"]["t2"].value;
	
	if((t1 == null || t1 == "") && (t2 == null || t2 == "")) {
		document.getElementId("errorBox").innerHTML = "Enter required fields";
		return false;
	}
	if (t1 == null || t1==""){
		document.getElementId("errorBox").innerHTML = "Enter username";
		return false;
	}
	if(t2 == null || t2 ==""){
		document.getElementId("errorBox").innerHTML = "Enter password";
		return false;
	}
	
out.println("</script>");
</head>
<body>
    <form name = "myform" action=LoginServlet method=post >
    <h1> AdminLogin</h1>
   <label>UserName:</label>
   	 <input type="text" name="t1"><br><br>
    <label>Password: </label>
    <input type="password" name="t2"><br><br>
    <div id="errorbox"></div>
    <button>LOGIN</button><br><br>
    
    <br><br>
	</form>


 


</body>
</html>