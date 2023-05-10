class SanduicheLanchoneteCG implements SanduicheFactory{
    @Override
    public Sanduiche criarSanduiche() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.montaSanduiche(Pao.Integral,Queijo.Prato,Presento.Frango,Salada.SemVerdura);
        return sanduiche;
    }
}
