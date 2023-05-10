import java.util.List;

public class Livro {
    private String nomeNacional;
    private int ano;
    private List<String> autores;
    private int edicao;
    private String cidade;
    private String editora;
    private String nomeOriginal;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    Livro(){

    }

    public String getNomeNacional() {
        return nomeNacional;
    }

    public int getAno() {
        return ano;
    }

    public List<String> getAutores() {
        return autores;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEditora() {
        return editora;
    }

    public String getNomeOriginal() {
        return nomeOriginal;
    }

    public List<String> getTradutores() {
        return tradutores;
    }

    public int getPaginas() {
        return paginas;
    }

    public long getIsbn() {
        return isbn;
    }

    void setNomeNacional(String nomeNacional) {
        this.nomeNacional = nomeNacional;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    void setAutores(List<String> autores) {
        this.autores = autores;
    }

    void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    void setCidade(String cidade) {
        this.cidade = cidade;
    }

    void setEditora(String editora) {
        this.editora = editora;
    }

    void setNomeOriginal(String nomeOriginal) {
        this.nomeOriginal = nomeOriginal;
    }

    void setTradutores(List<String> tradutores) {
        this.tradutores = tradutores;
    }

    void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}
