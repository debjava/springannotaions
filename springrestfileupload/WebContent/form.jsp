<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Page</title>
</head>
<body>
<h1>Upload a File</h1>
 
	<form action="users/photo" method="post" enctype="multipart/form-data">
 
	   <p>
		Select a file : <input type="file" name="file" size="45" />
	   </p>
 
	   <input type="submit" value="Upload It" />
	</form>
	
</body>
</html>