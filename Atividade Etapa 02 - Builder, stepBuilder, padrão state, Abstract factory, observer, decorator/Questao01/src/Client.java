public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder internetBuilder = new ContatoInternetBuilder();
        Builder telefoneBuilder = new ContatoTelefoneBuilder();
        Builder completoBuilder = new ContatoCompletoBuilder();

        Pessoa pessoa = new Pessoa("Vinícius", "Casa 2, 123", "(99)99999-9999", "vinicius@gmail.com");

        director.setBuilder(internetBuilder);
        director.contruirContatoIntenet(pessoa);
        ContatoInternet contatoInternet = (ContatoInternet) director.getContato();
        System.out.println(contatoInternet.toString());

        director.setBuilder(telefoneBuilder);
        director.contruirContatoTelefone(pessoa);
        ContatoTelefone contatoTelefone = (ContatoTelefone) director.getContato();
        System.out.println(contatoTelefone.toString());

        director.setBuilder(completoBuilder);
        director.contruirContatoCompleto(pessoa);
        ContatoCompleto contatoCompleto = (ContatoCompleto) director.getContato();
        System.out.println(contatoCompleto.toString());

    }
}
