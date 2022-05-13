package com.inatel.java.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        // DECLARANDO AS VARIÁVEIS
        int NUMERO_PERSONAGENS = 6;

        Scanner teclado = new Scanner(System.in);

        ArrayList<Personagem> listaPersonagens = new ArrayList<>();
        ArrayList<String> nomePersonagens = new ArrayList<>();

        Random random = new Random();

        // NOMES:
        // guerreiroHumano = Dorian
        // guerreiroAnao = Gortrak
        // magoElfo = Atenael
        // magoHumano = Elminster
        // druidaElfo = Malygos
        // druidaHumano = Lyrian
        
        // PEGANDO OS NOMES
        for(int i = 1; i <= NUMERO_PERSONAGENS; i++) {
            System.out.print("Digite o nome do personagem " + i + ": ");
            String nomePersonagem = teclado.nextLine();
            nomePersonagens.add(nomePersonagem);
        }
            
        // INSTANCIANDO OS PERSONAGENS
        Guerreiro guerreiroHumano = new Guerreiro(nomePersonagens.get(0), random.nextDouble() * 100);
        Guerreiro guerreiroAnao = new Guerreiro(nomePersonagens.get(1), random.nextDouble() * 100);
        Mago magoElfo = new Mago(nomePersonagens.get(2), random.nextDouble() * 100);
        Mago magoHumano = new Mago(nomePersonagens.get(3), random.nextDouble() * 100);
        Druida druidaElfo = new Druida(nomePersonagens.get(4), random.nextDouble() * 100);
        Druida druidaHumano = new Druida(nomePersonagens.get(5), random.nextDouble() * 100);

        // ADICIONANDO OS PERSONAGENS AO ARRAYLIST
        listaPersonagens.add(guerreiroHumano);
        listaPersonagens.add(guerreiroAnao);
        listaPersonagens.add(magoElfo);
        listaPersonagens.add(magoHumano);
        listaPersonagens.add(druidaHumano);
        listaPersonagens.add(druidaElfo);

        Collections.sort(listaPersonagens, Collections.reverseOrder());

        System.out.println("");
        System.out.println("Exibindo os personagens em ordem decrescente de vida:");

        for(Personagem personagem : listaPersonagens)
            System.out.println("Nome: " + personagem.nome + "\n" + "Vida: " + personagem.vida + "\n***********************************");

        teclado.close();


    }
}
