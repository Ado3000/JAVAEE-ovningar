<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Miniräknare</title>
</head>
<body>

	<%! int num1, num2; %>
	
	<%
	try{
	num1 = Integer.parseInt(request.getParameter("numone"));
	num2 = Integer.parseInt(request.getParameter("numtwo"));
	int sum = num1 + num2;
	out.print(sum);
	}
	catch (NumberFormatException ex)

		{
		  // Whatever
		}
	%>

</body>
</html>