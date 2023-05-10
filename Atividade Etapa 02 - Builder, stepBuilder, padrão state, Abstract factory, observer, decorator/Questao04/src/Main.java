public class Main {
    public static void main(String[] args) {
        SanduicheFactory sanduicheLanchoneteCG = new SanduicheLanchoneteCG();
        SanduicheFactory sanduichelanchoneteJP = new SanduichelanchoneteJP();
        SanduicheFactory sanduicheLanchoneteRT = new SanduicheLanchoneteRT();

        Sanduiche sanduiche = sanduicheLanchoneteCG.criarSanduiche();
        Sanduiche sanduiche2 = sanduichelanchoneteJP.criarSanduiche();
        Sanduiche sanduiche3 = sanduicheLanchoneteRT.criarSanduiche();

        System.out.println(sanduiche.toString());
        System.out.println(sanduiche2.toString());
        System.out.println(sanduiche3.toString());

    }
}
