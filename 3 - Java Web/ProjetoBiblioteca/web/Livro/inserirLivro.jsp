<%-- 
    Document   : inserirLivro
    Created on : 26/08/2022, 04:53:27
    Author     : thiag
--%>

<%@page import="br.com.DAO.LivroDAO"%>
<%@page import="br.com.DTO.LivroDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try {
                // Instanciando a classe
                LivroDTO objLivroDTO = new LivroDTO();
                // Setando os conteudos digitados do arquivo frmLivroVIEW.html
                objLivroDTO.setNome_livro(request.getParameter("name"));
                //objLivroDTO.setQtdpaginas(qtdpaginas);
                objLivroDTO.setAutor("autor");
                //objLivroDTO.setAno_fabricacao("ano");

                LivroDAO objLivroDAO = new LivroDAO();
                objLivroDAO.CadastrarLivro(objLivroDTO);
            } catch (Exception e) {

            };

        %>
    </body>
</html>


























