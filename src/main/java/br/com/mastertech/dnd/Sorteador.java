package br.com.mastertech.dnd;

import java.util.ArrayList;
import java.util.List;

public class Sorteador {
    private Dado dado;

    public Sorteador(Dado dadoInformado) {
        dado = dadoInformado;
    }

    public Resultado sortear(int vezes){
        List<Integer> lista = new ArrayList<>();

        for(int i = 0; i < vezes; i++) {
            lista.add(dado.jogar());
        }

        return new Resultado(lista);
    }
}
