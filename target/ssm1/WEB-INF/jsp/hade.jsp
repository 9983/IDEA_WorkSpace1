<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="shiro"  uri="http://shiro.apache.org/tags" %>

<%
    String ProName = request.getContextPath();
    request.setAttribute("ctx",ProName);
%>