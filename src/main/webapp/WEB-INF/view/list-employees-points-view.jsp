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

<t:template title="Listar Registros">
    <jsp:body>
        <main class="padding responsive">
            <c:if test="${employeePointList.size() == 0}">
                <h3 class="center-align">
                    Não há registros cadastrados
                </h3>
            </c:if>
            <c:if test="${employeePointList.size() >= 1}">
                <table class="border center-align">
                    <thead class="primary">
                    <tr>
                        <th>Funcionario</th>
                        <th>Horário</th>
                        <th>Setor</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="employeePoint" items="${employeePointList}">
                        <tr>
                            <td>${employeePoint.getEmployee().name}</td>
                            <td>${employeePoint.getCreatedDate()}</td>
                            <td>${employeePoint.getEmployee().getDepartament().name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </main>
    </jsp:body>
</t:template>