import java.util.List;

public class LivroStepBuilder {

    private LivroStepBuilder(){

    }

    public static NomeNacionalStep newBuilder(){
        return new Steps();
    }

    public static interface NomeNacionalStep{
        anoStep livroBuilder(String nomeNacional);
    }

    public static interface anoStep{
        autoresStep publicadeEm(int ano);
    }

    public static interface autoresStep{
        edicaoStep dosAutores(String... autores);
    }

    public static interface edicaoStep{
        cidadeStep edicao(int edicao);
    }

    public static interface cidadeStep{
        editoraStep cidade(String cidade);
    }

    public static interface editoraStep{
        nomeOriginalStep editora(String editora);
    }

    public static interface nomeOriginalStep{
        tradutoresStep nomeOriginal(String nomeOriginal);
    }

    public static interface tradutoresStep{
        paginasStep tradutores(String... tradutores);
    }

    public static interface paginasStep{
        isbnStep paginas(int paginas);
    }

    public static interface isbnStep{
        constroiStep isbn(Long isbn);
    }

    public static interface constroiStep{
        Livro build();
    }

    private static class Steps implements NomeNacionalStep, anoStep, autoresStep,
            edicaoStep, cidadeStep, editoraStep, nomeOriginalStep, tradutoresStep,paginasStep, isbnStep, constroiStep{

        private Livro livro;

        @Override
        public anoStep livroBuilder(String nomeNacional) {
            this.livro = new Livro();
            this.livro.setNomeNacional(nomeNacional);
            return this;
        }

        @Override
        public autoresStep publicadeEm(int ano) {
            this.livro.setAno(ano);
            return this;
        }

        @Override
        public edicaoStep dosAutores(String... autores) {
            this.livro.setAutores(List.of(autores));
            return this;
        }

        @Override
        public cidadeStep edicao(int edicao) {
            this.livro.setEdicao(edicao);
            return this;
        }

        @Override
        public editoraStep cidade(String cidade) {
            this.livro.setCidade(cidade);
            return this;
        }

        @Override
        public nomeOriginalStep editora(String editora) {
            this.livro.setEditora(editora);
            return this;
        }

        @Override
        public tradutoresStep nomeOriginal(String nomeOriginal) {
            this.livro.setNomeOriginal(nomeOriginal);
            return this;
        }

        @Override
        public paginasStep tradutores(String... tradutores) {
            this.livro.setTradutores(List.of(tradutores));
            return this;
        }

        @Override
        public isbnStep paginas(int paginas) {
            this.livro.setPaginas(paginas);
            return this;
        }

        @Override
        public constroiStep isbn(Long isbn) {
            this.livro.setIsbn(isbn);
            return this;
        }

        @Override
        public Livro build() {
            return livro;
        }
    }

}
