<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Core Tag Example</title>
</head>
<body>
<ul>
    <c:forEach var="user" items="${users}">
        <c:if test="${user.age >= 18 }">
            <li><c:out value="${user.firstName} ${user.age}"/></li>
            <c:choose>
                <c:when test="${user.country eq 'Belarus'}">
                    <p>This person is from Belarus.</p>
                </c:when>
                <c:when test="${user.country eq 'Ukraine'}">
                    <p>This person is from Ukraine.</p>
                </c:when>
                <c:when test="${user.country eq 'USA'}">
                    <p>This person is from USA.</p>
                </c:when>
                <c:otherwise>
                    <p>This person is from Asia.</p>
                </c:otherwise>
            </c:choose>
            <c:set var="birth" scope="request" value="${yearNow - user.age}"/>
            <p> Year of birth: <c:out value="${birth}"/></p>
        </c:if>
    </c:forEach>
</ul>
</body>
</html>
