package Model;

import Interface.IComplementoAndar;
import Interface.IComplementoNadar;
import Interface.IComportamentoVoar;

public class Pato extends Ave implements IComplementoAndar, IComplementoNadar, IComportamentoVoar {
    public Pato(int quantidadeDePatas, int quantidadeDeAssas) {
        super(quantidadeDePatas, quantidadeDeAssas);
    }

    @Override
    public void andar() {
        System.out.println("Pato andou");
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadou");
    }

    @Override
    public void voar() {
        System.out.println("Pato voou");
    }
}
