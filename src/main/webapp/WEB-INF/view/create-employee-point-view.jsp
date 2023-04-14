<%--
  Created by IntelliJ IDEA.
  User: GabrielPeplinski
  Date: 08/04/2023
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<t:template title="Novo Registro">
    <jsp:body>
       <main class="padding responsive">
           <form action="registros-funcionarios" method="post">
               <div class="field label suffix border">
                   <select name="employee">
                       <c:forEach var="employee" items="${employeeList}">
                           <option value="${employee.id}">${employee.name}</option>
                       </c:forEach>
                   </select>
                   <label class="active">Selecione o funcionário</label>
                   <i>arrow_drop_down</i>
                   <span class="helper">Setor que o funcionário trabalha</span>
               </div>
               <div class="center-align">
                   <button class="round primary large-elevate">
                       <i>add_circle</i>
                       <span>Adicionar</span>
                   </button>
               </div>
           </form>
       </main>
    </jsp:body>
</t:template>