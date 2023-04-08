<%--
  Created by IntelliJ IDEA.
  User: GabrielPeplinski
  Date: 08/04/2023
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Resultado">
    <jsp:body>
       <main class="padding responsive">
           <form action="funcionarios" method="post">
               <div class="field label border">
                   <input type="text">
                   <label>Nome</label>
                   <span class="helper">Nome do Funcionário</span>
               </div>
               <div class="field label border">
                   <input type="text">
                   <label>CPF</label>
                   <span class="helper">CPF do funcionário</span>
               </div>
               <div class="field label suffix border">
                   <select>
                       <option>Item 1</option>
                       <option>Item 2</option>
                       <option>Item 3</option>
                   </select>
                   <label class="active">Setor</label>
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