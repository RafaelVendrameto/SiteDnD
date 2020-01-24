package br.com.mastertech.dnd;

import java.util.List;

public class Resultado {
    private List<Integer> numeros;
    private int soma;

    public Resultado(List<Integer> numerosInformados){
        numeros = numerosInformados;

        for(int numero : numeros){
            soma += numero;
        }
    }

    public int getSoma() {
        return soma;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}
