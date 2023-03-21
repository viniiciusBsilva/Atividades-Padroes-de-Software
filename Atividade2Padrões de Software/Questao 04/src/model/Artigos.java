package model;

import model.modelos.Artigo;

import java.util.ArrayList;

public class Artigos {
    private ArrayList<Artigo> artigos = new ArrayList<>();

    public Artigos() {
    }

    public void adciona(Artigo artigo){
        artigos.add(artigo);
    }
    public void remove(Artigo artigo){
        artigos.remove(artigo);
    }
    public Artigo getArtigo(String nome){
        for(Artigo artigo1 : artigos){
            if(artigo1.getNome().equals(nome)){
                return artigo1;
            }
        }
        return null;
    }
}
