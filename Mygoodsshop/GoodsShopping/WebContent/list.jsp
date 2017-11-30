<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <tr>
            <td colspan="6" align="center" bgcolor="#5BA8DE">共${page.totalRecords}条记录 共${page.totalPages}页 当前第${page.pageNo}页<br>
                
                <a href="${path}/goods/list?pageNo=${page.topPageNo }"><input type="button" name="fristPage" value="首页" /></a>
                <c:choose>
                  <c:when test="${page.pageNo!=1}">
                    
                      <a href="${path}/goods/list?pageNo=${page.previousPageNo }"><input type="button" name="previousPage" value="上一页" /></a>
                    
                  </c:when>
                  <c:otherwise>
                    
                      <input type="button" disabled="disabled" name="previousPage" value="上一页" />
                    
                  </c:otherwise>
                </c:choose>
                <c:choose>
                  <c:when test="${page.pageNo != page.totalPages}">
                    <a href="${path}/goods/list?pageNo=${page.nextPageNo }"><input type="button" name="nextPage" value="下一页" /></a>
                  </c:when>
                  <c:otherwise>
                    
                      <input type="button" disabled="disabled" name="nextPage" value="下一页" />
                    
                  </c:otherwise>
                </c:choose>
                <a href="float/Domesticfruit.jsp/goods/list?pageNo=${page.bottomPageNo }"><input type="button" name="lastPage" value="尾页" /></a>
            </td>
        </tr>    
</body>
</html>