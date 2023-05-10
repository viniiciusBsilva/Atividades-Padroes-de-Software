public class TesteLivroStepBuilder {
    public static void main(String[] args) {

        LivroStepBuilder.newBuilder()
                .livroBuilder("Java, como programar")
                .publicadeEm(2003)
                .dosAutores("H. M. Deitei", "P. J. Deitei")
                .edicao(4).cidade("Porto Alegre")
                .editora("Bookman")
                .nomeOriginal("Java How to Program")
                .tradutores("Carlos Arthur Lang Lisboa")
                .paginas(1386).isbn(9788536301235L)
                .build();

        Livro livro = LivroStepBuilder.newBuilder()
                .livroBuilder("Java, como programar")
                .publicadeEm(2003)
                .dosAutores("H. M. Deitei", "P. J. Deitei")
                .edicao(4).cidade("Porto Alegre")
                .editora("Bookman")
                .nomeOriginal("Java How to Program")
                .tradutores("Carlos Arthur Lang Lisboa")
                .paginas(1386).isbn(9788536301235L)
                .build();

        System.out.println(livro.getNomeNacional());
        System.out.println(livro.getAutores());
    }
}