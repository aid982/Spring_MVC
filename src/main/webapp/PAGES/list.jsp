<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> </title>
    </head>
    <body>

        <c:if test="${!empty merchList}">
            <table border="1" bgcolor="black" width="200">
                <tr
                    style="background-color: teal; color: white; text-align: left;">

                    <td>Товар</td>

                </tr>
                <c:forEach items="${merchList}" var="merch">
                    <tr
                        style="background-color: white; color: black; text-align: left;"						>
                        <td><a href="edit.html?id=${merch.id}" > <c:out value="${merch.name}"/></a>                            
                        </td>	

                    </tr>
                </c:forEach>
            </table>
        </c:if>


        <a href="form">Click Here to add new User</a>

    </body>
</html>
