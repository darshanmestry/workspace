
<%@page contentType = "text/html" pageEncoding = "UTF-8"%>
<%@taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset = UTF-8">
        <title>Calculator Application</title>
    </head>
    <body>
        <s:form action = "calc" >
        <s:label value = "Enter number 1 : " name = "l1" />
        <s:textfield name = "x"/>
        <s:label value="Enter number 2 : " name =  "l2" />
        <s:textfield name="y"/>
        <s:submit value="submit" name = "submit" />
        </s:form>
                
    </body>
</html>