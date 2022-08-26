
package br.com.DAO;

import br.com.DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
    
    Connection con;
    // Preparando a conexão
    PreparedStatement pstm;
    
    public void CadastrarLivro(LivroDTO objLivroDTO) throws ClassNotFoundException {
        
        String sql = "insert into livro (nome_livro, qtdpaginas, autor, ano_fabricacao) values (?,?,?,?)";
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_livro());
            pstm.setInt(2, objLivroDTO.getQtdpaginas());
            pstm.setString(3, objLivroDTO.getAutor());
            pstm.setInt(4, objLivroDTO.getAno_fabricacao());
            
            // Executando a conexão
            pstm.execute();
            // Fechando a conexão
            pstm.close();
            
        }
        catch (SQLException e) {
            
        }
    }
    
}
