<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:include value="Banner.jsp" />

<a class="back-link img-report-small" href="listCharts.action"><s:text name="link.back.charts"/></a>
 
<br/>

<div align="center">
  
	<div class="important img-chart" id="instructions" style="width: 70%;"><s:text name="deleteChart.title"/></div>
     
  <form action="deleteChart.action" class="dialog-form" style="width: 75%;">
  
  <table class="dialog" >   
    <tr class="a">
      <td class="boldText" width="20%"><s:text name="label.name"/></td>
      <td><s:property value="name"/></td>
    </tr>
    <tr class="b">
      <td class="boldText"><s:text name="label.description"/></td>
      <td><s:property value="description"/></td>
    </tr>   
   </table>
  
   <br>
    
   <div class="button-bar" id="buttons">
        <input class="standardButton" type="submit" name="submitDelete" value="<s:text name="button.delete"/>">
        <input class="standardButton" type="submit" name="submitCancel" value="<s:text name="button.cancel"/>">
         <input type="hidden" name="id" value="<s:property value="id"/>"> 
   </div>   
   
  </form>
  <br> 
  
 <div class="error"><s:actionerror/></div> 
  
</div>

<s:include value="Footer.jsp" /> 


