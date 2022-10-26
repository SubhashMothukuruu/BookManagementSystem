<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
     <title>Book Library</title>
    
    <link href="<c:url value="/css/home.css"/>" rel="stylesheet" type="text/css">
    <link rel="icon" type="image/x-icon" href="/logos/pngfind.com-comic-book-png-230883.png">



</head>
<body>




<h2 class ="h2class">Welcome to Book Library.</h2>

    <div class ="box">
        
            
            
            <h2>List of the Book Available Now.</h2>
            
            <h3><a href="/showNewBook">ADD NEW BOOKS</a> </h3>
            
            <table border="1">
            
            
            
            <thead>
            <tr class ="headelements"> 
            
            <th>Book Id</th>
            <th>Book Name</th>
            <th>Book Description</th>
            <th>Book Department</th>
            <th>Action</th>
            </tr>
            </thead>
            
            <tbody>
            <c:forEach items="${bookList}" var="book">
            <tr class ="bodyelements">
            <td>${book.bookId}</td>
             <td>${book.bookName}</td>
              <td>${book.bookDescription}</td>
               <td>${book.bookDepartment}</td>
                  <td class="updatedelete">
                         <a class="h" href="/update?bookId=${book.bookId}">Update</a>
                          &nbsp;&nbsp;&nbsp;
                          <a class="h" href="/delete?bookId=${book.bookId}">Delete</a>
                     </td>
            
            </tr>
           </c:forEach>
            </tbody>
            
            </table>
        </div> 
</body>
</html>