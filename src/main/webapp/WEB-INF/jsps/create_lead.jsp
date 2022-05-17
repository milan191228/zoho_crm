<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Leads</title>
</head>
<body>
	<h1>Leads | Create</h1>
	
	<form action="saveLead" method="post">
		<pre>
		First Name<input type="text" name="firstName"/>
		Last Name <input type="text" name="lastName"/>
		Email<input type="text" name="email"/>
		
		Lead Source<select name="leadSource" >
					 <option value="TV commercial">TV commercial</option>
					 <option value="Radio">Radio</option>
				  	 <option value="News Paper">News Paper</option>
					 <option value="Online">Online</option>
					 </select>
		Moblie<input type="text" name="mobile">
		<input type="submit" value="Save"/>
		</pre>
	</form>
	
</body>
</html>