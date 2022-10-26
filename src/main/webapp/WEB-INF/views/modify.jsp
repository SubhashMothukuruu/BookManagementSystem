<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Information</title>
  <link href="<c:url value="/css/newbook.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
    <div class="box">
    
        <h2>Update Book</h2>
        <form:form action="create" method="post" modelAttribute="book">
            
                <div class ="inputBox">
                    
                    <form:input path="bookId" required ="" />
                    <label>BOOK ID:</label>
                </div>
                <div class ="inputBox">
                <form:input path="bookName" required ="" />
                    <label>BOOK NAME:</label>
                         
                    
                </div>
                <div class ="inputBox">
                 <form:input path="bookDescription" required ="" />
                    <label>BOOK DESCRIPTION:</label>
               </div>
               <div class ="inputBox">
               <form:input path="bookDepartment" required ="" />
                    <label>BOOK DEPARTMENT:</label>
                 
               </div>
               
                <div>
                   <input type="submit" value="UPDATE BOOK">
                 </div>
            
        </form:form>
    </div>
</body>
</html>