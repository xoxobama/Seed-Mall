<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/top.jsp"%>
<div class="container">
<form action="excel" method="post" enctype="multipart/form-data">
<input type="file" name="excel">
<button>확인</button>
</form>

</div>

<%@ include file="/WEB-INF/views/foot.jsp"%>