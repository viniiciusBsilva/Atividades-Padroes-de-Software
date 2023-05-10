package org.example.quest4;

public class Main {
    public static void main(String[] args) {
        SanduicheFactory integralComQueijoEFrangoFactory = new IntegralComQueijoEFrango();
        SanduicheFactory francesComMussarelaEFrangoFactory = new FrancesComMussarelaEFrango();
        SanduicheFactory bolaComCheddarEPeruFactory = new BolaComCheddarEPeru();

        Sanduiche integralComQueijoEFrango = integralComQueijoEFrangoFactory.criarSanduiche();
        Sanduiche francesComMussarelaEFrango = francesComMussarelaEFrangoFactory.criarSanduiche();
        Sanduiche bolaComCheddarEPeru = bolaComCheddarEPeruFactory.criarSanduiche();

        System.out.println("Sanduíche 1:");
        System.out.println("Pão: " + integralComQueijoEFrango.getPao());
        System.out.println("Queijo: " + integralComQueijoEFrango.getQueijo());
        System.out.println("Presunto: " + integralComQueijoEFrango.getPresento());
        System.out.println("Salada: " + integralComQueijoEFrango.getSalada());

        System.out.println("\nSanduíche 2:");
        System.out.println("Pão: " + francesComMussarelaEFrango.getPao());
        System.out.println("Queijo: " + francesComMussarelaEFrango.getQueijo());
        System.out.println("Presunto: " + francesComMussarelaEFrango.getPresento());
        System.out.println("Salada: " + francesComMussarelaEFrango.getSalada());

        System.out.println("\nSanduíche 3:");
        System.out.println("Pão: " + bolaComCheddarEPeru.getPao());
        System.out.println("Queijo: " + bolaComCheddarEPeru.getQueijo());
        System.out.println("Presunto: " + bolaComCheddarEPeru.getPresento());
        System.out.println("Salada: " + bolaComCheddarEPeru.getSalada());
    }
}
