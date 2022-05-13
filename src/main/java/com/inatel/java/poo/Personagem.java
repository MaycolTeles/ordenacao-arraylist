package com.inatel.java.poo;

public abstract class Personagem implements Comparable<Personagem> {

    // DECLARANDO OS ATRIBUTOS
    public String nome;
    public double vida;


    // DEFININDO OS MÉTODOS
    public Personagem(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    @Override
    public int compareTo(Personagem o) {
        // ORDENANDO EM ORDEM CRESCENTE DE VIDA
        if(this.vida < o.vida)
            return -1;

        if(this.vida > o.vida)
            return 1;

        return 0;
    }
    
}
