package Main;

import Model.Arrara;
import Model.Papagaio;
import Model.Pato;
import Model.Pinguim;

public class Main {
    public static void main(String[] args) {
        Pinguim ping = new Pinguim(2,2, "Pinguim Imperador");
        Arrara arara = new Arrara(2,2, true);
        Papagaio papagaio = new Papagaio(2,2);
        Pato pato = new Pato(2,2);

        System.out.println("---------------------------");
        ping.andar();
        ping.nadar();
        ping.bicar();
        System.out.println("---------------------------");

        arara.andar();
        arara.voar();
        arara.bicar();
        System.out.println("---------------------------");

        papagaio.andar();
        papagaio.voar();
        papagaio.falar();
        papagaio.bicar();
        System.out.println("---------------------------");

        pato.andar();
        pato.nadar();
        pato.voar();
        pato.bicar();
        System.out.println("---------------------------");
    }
}
