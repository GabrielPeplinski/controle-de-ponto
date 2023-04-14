<%--
  Created by IntelliJ IDEA.
  User: GabrielPeplinski
  Date: 08/04/2023
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<t:template title="Listar Funcionários">
    <jsp:body>
        <main class="padding responsive">
            <c:if test="${employeeList.size() == 0}">
                <h3 class="center-align">
                    Não há funcionários cadastrados
                </h3>
            </c:if>
            <c:if test="${employeeList.size() >= 1}">
                <table class="border center-align">
                    <thead class="primary">
                    <tr>
                        <th>Nome</th>
                        <th>CPF</th>
                        <th>Setor</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="employee" items="${employeeList}">
                        <tr>
                            <td>${employee.name}</td>
                            <td>${employee.cpf}</td>
                            <td>${employee.name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </main>
    </jsp:body>
</t:template>