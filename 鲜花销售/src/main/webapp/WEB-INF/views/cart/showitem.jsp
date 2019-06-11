<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示购物车条目</title>


<link rel="stylesheet" type="text/css" href="<c:url value='../static/css/cart/showitem.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='../static/css/city-picker.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='../static/css/main.css'/>">
<!--  
<link href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
-->

<script src="<c:url value='../static/js/jquery-1.5.1.js'/>"></script>
<script src="<c:url value='../static/js/round.js'/>"></script>
<script src="../static/js/jquery.js"></script>
<script src="../static/js/bootstrap.js"></script>
<script src="../static/js/city-picker.data.js"></script>
<script src="../static/js/city-picker.js"></script>
<script src="../static/js/main.js"></script>

<style type="text/css">
.shade{width: 100%; height: 100%; overflow-y: hidden; position: fixed; z-index: 100; top: 0; background: black; opacity: 0.5;}
.shade_content{width: 600px; border-radius: 10px; height: 500px; position: fixed; z-index: 101; top: 20%; left: 50%; margin-top: -150px; margin-left: -300px; background: #FFFFFF; }
.shade_content_div{margin: 0px auto; text-align: center; height: 100%; width: 80%; margin-top: 20px;}
.shade_title{font-size: 30px; text-align: center; font-weight: bold; font: "微软雅黑";}
.btn_remove{border-radius: 5px; background: #31B0D5; color: white; width: 150px; height: 40px; border: 0px; outline: 0px; font-size: 15px;}
.sub_set{border-radius: 5px; background: #31B0D5; color: white; width: 150px; height: 40px; border: 0px; outline: 0px; font-size: 15px;}
.input_style{height: 30px; border-radius: 5px; width: 250px; outline: 0px; border: 1px solid #CCCCCC;}
.span_style{font-size: 18px;}
.shade_from{margin-top: 20px;}
.shade_from .col-xs-12{margin-top: 20px;}
.shade_colse{text-align: right; margin-top: 10px; }
.shade_colse button{font-size: 20px; color: white; outline: 0px; margin-right: 10px; border-radius: 50px; background: red; height: 30px; width: 30px; border: 0px;}
.open_new{width: 80px;text-align: right;}
.open_btn{height: 30px; width: 100px; border-radius: 10px; background: red; color: white; outline: 0px; margin-bottom: 10px;margin-left:600px; border: 0px ;}
#createOrder{border: 3px solid #efeae5 ;height: 50%;}
#divTitle {line-height: 30px; width: 100%; height: 30px; border: 1px solid #d0d0d0; background-color:#efeae5; }
#spanTitle {margin-left: 18px; font-weight: 900;}
</style>

<script type="text/javascript">
	
	$(function() {
		$("#sub_setID").click(function() {
			var input_out = $(".input_style");
			for (var i = 0; i <= input_out.length; i++) {
				if ($(input_out[i]).val() == "") {
					$(input_out[i]).css("border", "1px solid red");
					
					return false;
				} else {
					$(input_out[i]).css("border", "1px solid #cccccc");
				}
			}
		});
	//	$("#address").hide();
		$(".shade_content").hide();
		$(".shade").hide();
		
		$('.Caddress .add_mi').click(function() {
			$(this).css('background', 'url("../static/image/mail_1.jpg") no-repeat').siblings('.add_mi').css('background', 
					'url("../static/image/mail.jpg") no-repeat');
			var addressid = $(this).attr("id").substring(0, 32);
			//alert(addressid);
			$("#addressId").val(addressid);
			
		});
	});
	
	var x = Array();

	function func(a, b) {
		x[b] = a.html();
		alert(x);
		a.css('border', '2px solid #f00').siblings('.min_mx').css('border', '2px solid #ccc');
	}

	function onclick_close() {
		var shade_content = $(".shade_content");
		var shade = $(".shade");
		if (confirm("确认关闭么！此操作不可恢复")) {
			shade_content.hide();
			shade.hide();
		}
	}

	function onclick_submit() {
		var shade_content = $(".shade_content");
		var shade = $(".shade");
		var str=$("#city-picker3").val();
		var adstreet=$("#adstreet").val();
		var adpostcode=$("#adpostcode").val();
		var adname=$("#adname").val();
		var adphone=$("#adphone").val();
		
		$.ajax({
			url:"../address/addAddress",//要请求的servlet
			data:{str:str,adstreet:adstreet,adpostcode:adpostcode,adname:adname,adphone:adphone},//给服务器的参数
			type:"POST",
			dataType:"json",
			async:false,//是否异步请求，如果是异步，那么不会等服务器返回，我们这个函数就向下运行了。
			cache:false,
			timeout:1000,
			success:function(result) {
				//alert(result);
				confirm("添加地址成功");
				shade_content.hide();
				shade.hide();
				window.location.reload();
				return true;
			}
		});
		
	}
	
	function onclick_open() {
		$(".shade_content").show();
		$(".shade").show();
		var input_out = $(".input_style");
		for (var i = 0; i <= input_out.length; i++) {
			if ($(input_out[i]).val() != "") {
				$(input_out[i]).val("");
			}
		}
	}
	//计算合计
	$(function() {
		var total = 0;
		$(".subtotal").each(function() {
			total += Number($(this).text());
		});
		$("#total").text(round(total, 2));
	});
	
	
</script>
</head>

<body>
	<c:choose>
		<c:when test="${empty cartItemList }">嘻嘻~</c:when>
		<c:otherwise>
		<div id="createOrder">
			<div id="divTitle">
    		<span id="spanTitle">生成订单</span>
  			</div>  <br>
		
			<div class="Caddress" >
			<div class="open_new">
				<button class="open_btn" onclick="javascript:onclick_open();">使用新地址</button>
			</div>
			<c:set var="flag" value="true" />
			<c:forEach items="${addressList }" var="address" varStatus="status">
				<c:if test="${status.count==3}">
				 <c:set var="flag" value="false"/>
				</c:if>
				<div class="add_mi" id="${address.adid }">
					<input type="hidden" value="${address.adid }" id="${address.adid }checkAddress" class="checkAddress">
					<p style="border-bottom:1px dashed #ccc;line-height:28px;">${address.adprovince } ${address.adcity } (${address.adname }收)</p>
					<p>${address.addistrict }${address.adstreet } ${address.adphone }</p>
				</div>
				
			
			</c:forEach>
			</div>
		
			<form id="form1" action="<c:url value='../order/createOrder/${cartItemIds }'/>" method="post">
				<input type="hidden" name="addressId" id="addressId"/>
				<table>
					
					<tr align="center">
						<td width="10%">&nbsp;</td>
						<td width="50%">鲜花名称</td>
						<td>单价</td>
						<td>数量</td>
						<td>小计</td>
					</tr>
					<c:forEach items="${cartItemList }" var="cartItem">
						<tr align="center">
							<td align="right"><a class="linkImage"
								href="<c:url value='../flower/loadDesc/${cartItem.flower.fid }'/>"><img border="0"
									width="54" align="top"
									src="<c:url value='/${cartItem.flower.image_b }'/>" /></a></td>
							<td align="left"><a
								href="<c:url value='../flower/loadDesc/${cartItem.flower.fid }'/>"><span>${cartItem.flower.fname }</span></a>
							</td>
							<td>&yen;${cartItem.flower.currPrice }</td>
							<td>${cartItem.quantity }</td>
							<td><span class="price_n">&yen;<span class="subtotal">${cartItem.subtotal }</span></span>
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="6" align="right"><span>总计：</span><span
							class="price_t">&yen;<span id="total">${total }</span></span></td>
					</tr>
					<tr>
						<td colspan="5" align="right">
							<input id="linkSubmit" type="submit" value="提交订单">
						</td>
					</tr>
				</table>
			</form>
		</div>
			
		<div class="shade"> </div>
		<div class="shade_content">
			<div class="col-xs-12 shade_colse">
				<button onclick="javascript:onclick_close();">x</button>
			</div>
			<div class="nav shade_content_div">
				<div class="col-xs-12 shade_title">
					新增收货地址
				</div>
				<div class="col-xs-12 shade_from">
				<!-- 
					<form action="<c:url value='../address/addAddress'/>" method="post">
				 -->
							<div id="distpicker">
							<div style="float: left;">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<span class="span_style" id="">地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;区</span>
							</div>
							<div style="float: left;" class="form-group">
								<div  style="position: relative;">
									<input id="city-picker3" name="city-picker3" class="form-control" readonly type="text" value="" data-toggle="city-picker">
								</div>
							</div>
							
						</div>
						<br>
						<div class="col-xs-12">
							<span class="span_style" id="">详细地址</span>
							<input class="input_style" type="text" name="adstreet" id="adstreet" value="" placeholder="&nbsp;&nbsp;请输入您的详细地址" />
						</div>
						<div class="col-xs-12">
							<span class="span_style" id="">邮政编号</span>
							<input class="input_style" type="text" name="adpostcode" id="adpostcode" value="" placeholder="&nbsp;&nbsp;请输入您的邮政编号" />
						</div>
						<div class="col-xs-12">
							<span class="span_style" class="span_sty" id="">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名</span>
							<input class="input_style" type="text" name="adname" id="adname" value="" placeholder="&nbsp;&nbsp;请输入您的姓名" />
						</div>
						<div class="col-xs-12">
							<span class="span_style" id="">手机号码</span>
							<input class="input_style" type="text" name="adphone" id="adphone" value="" placeholder="&nbsp;&nbsp;请输入您的手机号码" />
						</div>
						<div class="col-xs-12">
							<input class="btn_remove" type="button" id="" onclick="javascript:onclick_close();" value="取消" />
							<input type="submit" class="sub_set" id="sub_setID" onclick="javascript:onclick_submit();" value="提交" />
						</div>
					<!-- 
					</form>
					 -->
				</div>
			</div>
		</div>
		
		</c:otherwise>
	</c:choose>
	
</body>
</html>
