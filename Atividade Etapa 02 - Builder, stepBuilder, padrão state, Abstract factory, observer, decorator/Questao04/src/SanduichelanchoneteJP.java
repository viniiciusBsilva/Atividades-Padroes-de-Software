class SanduichelanchoneteJP implements SanduicheFactory{
    @Override
    public Sanduiche criarSanduiche() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.montaSanduiche(Pao.Frances,Queijo.Mussarela,Presento.Frango,Salada.ComVerdura);
        return sanduiche;
    }
}
