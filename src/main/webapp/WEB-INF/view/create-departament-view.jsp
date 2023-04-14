<%--
  Created by IntelliJ IDEA.
  User: GabrielPeplinski
  Date: 08/04/2023
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Setores">
    <jsp:body>

        <c:if test="${name}">
            <c:redirect url="pagina-de-destino.jsp"/>
        </c:if>

       <main class="padding responsive">
           <form action="setores" method="post">
               <div class="field label border">
                   <input type="text" name="name">
                   <label>Nome</label>
                   <span class="helper">Nome do setor</span>
               </div>
               <div class="field label border">
                   <input type="text" name="code">
                   <label>Código</label>
                   <span class="helper">Código do Setor</span>
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