<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<script>
	var result = ${msg};
	
	if(result == 'SUCCESS'){
		alert("처리 완료");
	}
</script>

<table class="table table-boardered">
	<tr>
		<th style="width : 10px"> BNO</th>
		<th>Title</th>
		<th>WRITER</th>
		<th>REGDATE</th>
		<th style="width : 40px">VIECNT</th>
	</tr>	
</table>

<%@ include file="../include/footer.jsp" %>