<html>
<head>
<meta charset="UTF-8">
<title>E-mail Form</title>
</head>
<body>

	<form action="/lab7-web00/HelloService" method="post">

		<!-- para funcionar a substitui��o da vari�vel, a vers�o a vers�o do web.xml 2.4 ou maior. -->
		<label>Type the e-mail of: ${nameOfUser}</label>  <br/>
		<label>E-mail:</label>
		<input type="text" name="email" />
		<input type="submit" value="Send data" />

	</form>

</body>
</html>
