package Questão08;

public class Artigos {
    private String nome;
    private TipoArtigo tipo;
    private Double preço;

    public Artigos(String nome, TipoArtigo tipo, double preço) {
        if(preço>0) {
            this.nome = nome;
            this.tipo = tipo;
            this.preço = preço;
        }else{
            System.out.println("preço inexistente!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArtigo getTipo() {
        return tipo;
    }

    public void setTipo(TipoArtigo tipo) {
        this.tipo = tipo;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }
}
