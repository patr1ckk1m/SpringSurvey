<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dojo Survey Index</title>
</head>
<body>
	<form action='/result' method='post'>
		<table>
		  <tr>
		    <td>
		      Your Name:
		    </td>
		    <td>
		      <input type='text' name='name'>
		    </td>
		  </tr>
		  <tr>
		    <td>
		      Dojo Location:
		    </td>
		    <td>
		      <select name ="location">
		        <option value="San Jose">
                  San Jose
                </option>
		        <option value="Burbank">
                  Burbank
                </option>
		        <option value = "Orange County">
                  Orange County
                </option>
		      </select>
		    </td>
		  </tr>
		  <tr>
		    <td>
		      Favorite Languages:
		    </td>
		    <td>
		      <select name ="language">
		        <option value="Python">
                  Python
                </option>
		        <option value="Java">
                  Java
                </option>
		        <option value = "C#">
                  C#
                </option>
		        </select>
		      </td>
		    </tr>
		    <tr>
		
		      <td>
		        Leave A Comment
		      </td>
		      <td>
		        <textarea rows="4" cols="50" name = "comment"></textarea>
		      </td>
		
		    </tr>
		    <tr>
		      <td>
		        <input type='submit' value='create user'>
		      </td>
		    </tr>
		  </table>
		
		</form>
</body>
</html>