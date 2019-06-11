<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>订单列表</title>

<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link rel="stylesheet" type="text/css"href="<c:url value='../static/css/order/list.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='${pageContext.request.contextPath}/static/css/pager.css'/>" />


</head>

<body>
	<div class="divMain">
		<div class="divTitle">
			<span style="margin-left: 150px; margin-right: 280px;">商品信息</span> <span
				style="margin-left: 40px; margin-right: 38px;">金额</span> <span
				style="margin-left: 50px; margin-right: 40px;">订单状态</span> <span
				style="margin-left: 50px; margin-right: 50px;">操作</span>
		</div>
		<br />
		<table align="center" border="0" width="100%" cellpadding="0"
			cellspacing="0">

			<c:forEach items="${pb.beanList }" var="order">

				<tr class="tt">
					<td width="320px">订单号：<a
						href="<c:url value='../order/desc/${order.oid }'/>">${order.oid }</a></td>
					<td width="200px">下单时间：${order.ordertime }</td>
					<td>&nbsp;</td>
					<td width="142px">
						<c:choose>
						<c:when test="${order.status eq 4 }">
							<button style="background:#c40000;color:#ffffff; " type="button" onclick="location.href='../order/desc/${order.oid }'">评价</button>
						</c:when>
						</c:choose>
					</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr style="padding-top: 10px; padding-bottom: 10px;">
					<td colspan="2">
						<c:forEach items="${order.orderItemList }"
							var="orderItem">
							<a class="link2"
								href="<c:url value='../flower/loadDesc/${orderItem.fid }'/>">
								<img border="0" width="70"
								src="<c:url value='/${orderItem.image_b }'/>" />
							</a>
						</c:forEach>
					</td>
					<td width="115px"><span class="price_t">&yen;${order.total }</span>
					</td>
					<td width="142px"><c:choose>
							<c:when test="${order.status eq 1 }">(等待付款)</c:when>
							<c:when test="${order.status eq 2 }">(准备发货)</c:when>
							<c:when test="${order.status eq 3 }">(等待确认)</c:when>
							<c:when test="${order.status eq 4 }">(交易成功)</c:when>
							<c:when test="${order.status eq 5 }">(已取消)</c:when>
						</c:choose></td>
					<td><a
						href="<c:url value='../order/desc/${order.oid }'/>">查看</a><br />
						<c:if test="${order.status eq 1 }">
							<a
								href="<c:url value='../order/paymentPre/${order.oid }'/>">支付</a>
							<br />
							<a
								href="<c:url value='../order/cancle/${order.oid }'/>">取消</a>
							<br />
						</c:if> <c:if test="${order.status eq 3 }">
							<a
								href="<c:url value='../order/confirm/${order.oid }'/>">确认收货</a>
							<br />
						</c:if></td>
				</tr>
			</c:forEach>

		</table>

		<br />
		<%@include file="../pager/pager.jsp"%>
	</div>
</body>
</html>
