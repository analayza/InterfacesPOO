package Model;

import Interface.IComplementoAndar;
import Interface.IComplementoFalar;
import Interface.IComportamentoVoar;

public class Papagaio extends Ave implements IComplementoAndar, IComportamentoVoar, IComplementoFalar {
    public Papagaio(int quantidadeDePatas, int quantidadeDeAssas) {
        super(quantidadeDePatas, quantidadeDeAssas);
    }

    @Override
    public void andar() {
        System.out.println("Papagaio andou");
    }

    @Override
    public void falar() {
        System.out.println("Papagaio falou");
    }

    @Override
    public void voar() {
        System.out.println("Papagaio voou");
    }
}
