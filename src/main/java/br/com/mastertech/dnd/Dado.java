package br.com.mastertech.dnd;

import java.util.Random;

public class Dado {
    private int lados;
    private Random random;

    public Dado(int ladosInformados) throws DadoInvalidoException {
        lados = ladosInformados;

        if(lados != 4 && lados != 6 && lados != 8 &&
                lados != 10 && lados != 12 && lados != 20){
            throw new DadoInvalidoException();
        }

        random = new Random();
    }

    public int jogar(){
        return random.nextInt(lados) + 1;
    }
}
