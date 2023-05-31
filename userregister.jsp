<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Register</title>
<style>
	*{
	margin: 0px;
	padding: 5px;
	}
	body{
	background-image: url(https://i2.wp.com/www.timeanddate.com/scripts/cityog.php?title=14-Day%20Weather%20Forecast%20for&tint=0x007b7a&city=Imperial%20Beach&state=California&country=USA&image=generic);
	background-repeat: no-repeat;
	}
	h1{
	margin-left: 500px;
	text-align: left;
	margin-top: 50px;
	}
	label{
	margin-left: 500px;
	}
	.main2 input{
	margin-right: -500px;
	}
	main3 label{
	margin-left: 450px;
	}
	main4 label{
	margin-left: 100px;
	}
	.main5 input{
	margin-left: 700px;
	}
</style>
<script type="text/javascript">
</script>
</head>
<body>
 <!-- background-image: url('https://t4.ftcdn.net/jpg/04/90/84/21/240_F_490842185_Ll9ATc00Cnwqv8AcRGZMPdpoHQYCKJor.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%; -->

<form action=Register method=post >
	<h1>User Registration Page </h1>
	<br>
  <label for="id"> User ID :</label>
  <input type="text" id="id" name="id"><br><br>
  <label for="fname"> User name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="birthday">Birthday:</label>
  <input type="date" id="birthday" name="birthday"><br><br>
  <div class = "main2">
  <label for="fname">Gender:</label>
  <input type="radio" id="Gender" name="Gender" value="Boy">
  <label for="Gender">Male</label>
  <input type="Radio" id="Female" name="Gender" value="girl">
  <label for="Gender"> Female</label><br><br>
  </div>
  <div class="main4">
  <label for="pname"> Phone number:</label>
  <input type="text" id="fname" name="pname"><br><br>
  <label for="fname">Father name:</label>
  <input type="text" id="lname" name="father"><br><br>
  <label for="fname">Mother name:</label>
  <input type="text" id="lname" name="mother"><br><br>
  <label for="fname">Address:</label>
  <input type="text" id="fname" name="address"><br><br>
  <label for="fname">E-mail id:</label>
  <input type="text" id="lname" name="email"><br><br>
  <label for="fname"> College name:</label>
  
  <input type="text" id="fname" name="college"><br><br>
   <label for="cars">Qualification:</label>
  <select id="cars" name="qualification">
    <option value="BE">BE</option>
    <option value="BCA">BCA</option>
    <option value="MCA">MCA</option>
    <option value="B.TECH">B.TECH</option>
  </select><br><br>
  <label for="fname"> How many years lag:</label>
  <input type="text" id="fname" name="lag"><br><br>
  </div>
  <div class="main5">
  <input type="submit">
  </div>
</form>
</body>
</html>