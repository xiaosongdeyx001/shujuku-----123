<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<style type="text/css">
.brand_logo {
	width: 25px;
	height: 25px;
}
</style>
<div class="container-fluid">
	<ol class="breadcrumb">
		<span>当前位置：</span>
		<li><a href="/index">商品管理</a></li>
		<li><a href="####">属性管理</a></li>
	</ol>

	<!-- 列表：查询条件组装  start -->
	<div class="panel panel-default form-search">
		<div class="panel-body">
			<div class="conditions_team">
				<label>属性名称：</label>
				<input type="text" name="propertyName" class="form-control"placeholder="属性名称"> 
			</div>
			<div class="conditions_team">
       		<label>属性类型：</label>
       		<select name="propertyType" class="form-control">
       		   <option value="-1">--请选择类型--</option>
       		   <option value="1">销售属性</option>
       		   <option value="2">辅助属性</option>
       		</select>
       	</div>
		</div>
		<div class="panel-footer">
			<button type="button" id="searchBtn" class="btn btn-primary">
				<i class="icon_search"></i>
				查询
			</button>
			<button type="button" id="resetBtn" class="btn btn-success">
				<i class="icon-reply icon-only"></i>
				重置
			</button>
			<button type="button" id="addBtn" class="btn btn-primary">
			<i class="icon_add"></i>
				新增
			</button>
		</div>
	</div>
	<!-- 列表：查询条件组装  end -->
	<!-- 列表：查询分页列表 start -->
	<div class="area_table_content cloud_list">
		<div id="buttonsId" class="row list-title">
			<div class="col-md-4">
				<h4>属性列表</h4>
			</div>
		</div>
	</div>
</div>
	<!-- 列表：查询分页列表 end -->
	<!-- add by WHao start 引入：属性列表js -->
	<script type="text/javascript">
	$(document).ready(function(){
        var buttonsArr =[];
        getData();
        function getData(){
            var _options ={
                url:_path+"/invoicing/goods/property/page/list"
                ,checkAll:false
                //查询条件
                ,data:{'userName':$("[name=shortName]").val()
                	  ,'phone':$("[name=name]").val()}
                ,cloumns:[
					 {name:'属性名称',value:'propertyName'}
                    ,{name:'所属分类',value:'categoryName'}
                    ,{name:'所属类型',value:'propertyType'}
                    ,{name:'更新时间',value:'updateTime'}
                    ,{name:'操作',value:'id',type:"function", fun : function(obj){
                    	var html="";
	                		html += "  <a href='javascript:void(0)' class='btn-link' onclick='toUpdatePage("+obj.id+")'>编辑</a>"
	                		html += "  <a href='javascript:void(0)' class='btn-link' onclick='delObj("+obj.id+")'>删除</a>";
	                		html += "  <a href='javascript:void(0)' class='btn-link' onclick='propertyValObj("+obj.id+")'>属性值维护</a>";
	                	return html;
                      }
                    }
                ]
                ,buttons:buttonsArr
            };
            // grid(param1,param2);参数1分页数据，参数2table类名如.area_table_content
            $(".area_table_content").grid(_options,".area_table_content");
        }
		//条件查询
		$("#searchBtn").click(function(){
			getData();
			
		});
		//条件重置
		$("#resetBtn").click(function (){
			$("input[name=userName]").val("");
			$("input[name=phone]").val("");
		});
		
    });
    
  //点击：删除
    function delObj(id) {
    	callmodalFun('您确认删除该记录吗？',function(){
    		$.ajax({
    			type : "post",
    			url :_path+"/invoicing/goods/property/page/del",
    			data : {
    				'id':id
    			},
    			beforeSend: function () {
                    //加载中
                    waitload();
                },
    			success : function(data) {
    				closewait();
    				//若执行成功的话，则隐藏进度条提示
    				if (data.code== 1) {
    					alert("属性删除成功！")
    					var url = _path+"/invoicing/goods/property/page/list";
    					goBackPage(url);
    				} else if (data == 0) {
    					timedTaskFun(1000,'属性删除失败','','err');
    				} else if(data == -2) {
    					timedTaskFun(1000,'该属性，已关联其他业务，故无法删除！','','err');
    				}
    				
    			}
    		 });
    	});
    };
    //属性角色维护
    function toUserRole(propertyId){
  	  var url=_path+"/invoicing/goods/property/role?propertyId="+propertyId;
		$.get(url,function(data){
			$("#mian_div").html(data);
		});    	
    }
    
    //到新增页面
    $("#addBtn").click(function(){
    	var url=_path+"/invoicing/goods/property/add";
		$.get(url,function(data){
			$("#mian_div").html(data);
		});    
    });
    //编辑属性信息
    function toUpdatePage(propertyId){
    	 var url=_path+"/invoicing/goods/property/update?propertyId="+propertyId;
		 //调用跳转方法
		 goBackPage(url);
    }
    //属性值维护
    function propertyValObj(propertyId){
    	var url=_path+"/invoicing/goods/property/value/page/list?propertyId="+propertyId;
    	$.get(url,function(data){
			$("#mian_div").html(data);
		});    
    }
    
    
</script>