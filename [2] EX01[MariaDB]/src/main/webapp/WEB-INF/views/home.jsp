<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>코드로 배우는 스프링 웹 프로젝트</title>
	<!-- 
		style 적용 방법
			1. 외부 파일로 연결하는 방법
				- servlet-context.xml에 resource mapping 추가
			2. 내부 파일에서 사용하는 방법
			3. 요소에 직접 사용하는 방법
	 -->
	<%-- <link rel = "stylesheet" href="<%=request.getContextPath()%>/resources/css/home/style.css"> --%>
	
</head>
<body>

<%@include file="include/header.jsp" %>

	<section class="content">
		<div class="row">
			<div class="col-md-12">
				<div class="box">
					<div class="box-header with-border">
						<h3 class="box-title">HOME PAGE</h3>
					</div>
				</div>
			</div><!-- The end of col -->
		</div><!-- The end of row -->
	</section><!-- The end of Content -->

<%@include file="include/footer.jsp" %>

</body>
</html>
