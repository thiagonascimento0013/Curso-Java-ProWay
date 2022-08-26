package br.com.DTO;

public class LivroDTO {
    private int id_livro;
    private String nome_livro;
    private int qtdpaginas;
    private String autor;
    private int ano_fabricacao;

    public int getId_livro() {
        return id_livro;
    }

     public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public int getQtdpaginas() {
        return qtdpaginas;
    }

    public void setQtdpaginas(int qtdpaginas) {
        this.qtdpaginas = qtdpaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

}
