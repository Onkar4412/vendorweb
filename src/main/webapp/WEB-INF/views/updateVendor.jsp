<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updateVend" method="post">
		<pre>
			Id: <input type="text" name="id" value="${vendor.id}" readonly="true"/>
			Code: <input type="text" name="code" value="${vendor.code}"/>
			Name: <input type="text" name="name" value="${vendor.name}"/>
			Type: <select name="type">
					<option ${vendor.type=='Regular'?'checked':''}>Regular</option>
			     	<option ${vendor.type=='Contract'?'checked':''}>Contract</option>
				  </select>
			Email:<input type="text" name="email" value="${vendor.email}"/>
			Phone:<input type="text" name="phone" value="${vendor.phone}"/>
			Address:<textarea rows="4" cols="50" name="address">${vendor.address}</textarea>
			
			<input type="submit" value="save"/>  
		</pre>
	</form>
</body>
</html>