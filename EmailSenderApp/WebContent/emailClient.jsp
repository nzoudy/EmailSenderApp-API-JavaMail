<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Email client !!!</title>
</head>
<body>
	<h1>Contact us !!!!</h1>
	<form method="POST" action="MailDispatcherServlet">
		<table>
			<tr>
				<td align="right"><b>To : </b></td>
				<td>
					<input type="text" name="email" size="75">
				</td>
			</tr>
			<tr>
				<td align="right"><b>Subject : </b></td>
				<td>
					<input type="text" name="subject" size="75">
				</td>
			</tr>
			<tr>
				<td align="right"><b>Message : </b></td>
				<td>
					<textarea name="message" cols="75" rows="6"></textarea>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Send">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>