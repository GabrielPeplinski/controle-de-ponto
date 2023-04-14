# Controle de Ponto

### Projeto desenvolvido para a disciplina de WEB 4 do curso de TSI - UTFPR Guarapuava
<hr>

## Descrição:

Neste projeto será possível fazer o controle e 
registro de um sistema de ponto digital de 
funcionários em uma loja.

## Protótipo:
Protótipo elaborando utilizando a ferramenta QuantUX, disponível em:

https://app.quant-ux.com/#/test.html?h=a2aa10azbebhBpgyD6r6oyEcg7V7uqDWRFZihX0lF4hs55dO8i7PjyeTwe6q&ln=en

## Funcionalidades

- Cadastrar funcionários
- Cadastrar registro de horário dos funcionários
- Listar todos os funcionários
- Listar todos os registros

## Checklist:

- [ ] Encaminhamento e redirecionamento
    - [ ] Usar encaminhamento fora do modelo MVC (i.e. um servlet encaminhando a requisição para outro servlet). A dica é dividir um processamento complexo em duas etapas, ou seja, em dois servlets.
    - [x] Usar redirecionamento depois de requisições POST de um formulário para evitar o reenvio destes dados ao atualizar a página com F5.
    - [ ] Para uma mesma rota de um Servlet, usar doGet para encaminhar a uma página e doPost para recuperar os dados da página/formulário
- [ ] Escopo de requisição, sessão e aplicação
- [ ] Cookies
    - [ ] Cookie que dura apenas uma sessão do navegador
    - [ ] Cookie com tempo de vida customizado além de uma sessão do navegador
- [ ] Controle de erros e exceção via web.xml
    - [ ] Tratamento por código de status ou exceção específica
    - [ ] Tratamento de erros genérico
- [ ] Expression Language (EL) para acessar os objetos de domínio (beans) da camada de modelo do MVC
- [x] JSTL e TagLib
    - [x] forEach
    - [x] if
    - [x] Template com cabeçalho e rodapé
- [ ] JavaScript
    - [ ] Requisição AJAX
    - [ ] Armazenamento no LocalStorage
    - [ ] Uso de plugin JQuery
- [ ] JPA
    - [x] No mínimo 2 entidades.
    - [x] Operações de CRUD. 