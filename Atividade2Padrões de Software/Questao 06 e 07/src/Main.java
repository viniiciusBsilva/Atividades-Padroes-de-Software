public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta("João", 2000.0);
        Requisicao requisicao = new Requisicao(Formato.CSV);
        AplicacaoBancaria aplicacaoBancaria = new AplicacaoBancaria();

        aplicacaoBancaria.sucessao(requisicao, conta);
    }


}
