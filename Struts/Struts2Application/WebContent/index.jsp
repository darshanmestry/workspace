<%@ taglib uri="/struts-tags"  prefix="s" %>
<s:form action="product">

  <s:textfield name="id" label="product Id" > </s:textfield>
  <s:textfield name="name" label="product name"></s:textfield>
  <s:textfield name="price" label="Product price"></s:textfield>
  
  <s:submit value="save"></s:submit>
</s:form>