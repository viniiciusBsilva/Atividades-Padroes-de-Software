public class AplicacaoBancaria {
    public AplicacaoBancaria() {
    }

    public static void sucessao(Requisicao requisicao, Conta conta){
        Processador processadorXML = new ProcessadorXML();
        Processador processadorCSV = new ProcessadorCSV();
        Processador processadorJSON = new ProcessadorJSON();

        processadorJSON.setSucessor(processadorXML);
        processadorXML.setSucessor(processadorCSV);
        processadorCSV.setSucessor(new ProcessadorCSV());

        processadorJSON.processar(requisicao, conta);
    }
}
