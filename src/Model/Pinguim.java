package Model;

import Interface.IComplementoAndar;
import Interface.IComplementoNadar;

public class Pinguim extends Ave implements IComplementoAndar, IComplementoNadar {
    String especie;

    public Pinguim(int quantidadeDePatas, int quantidadeDeAssas, String especie) {
        super(quantidadeDePatas, quantidadeDeAssas);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void andar() {
        System.out.println("Pinguim andou");
    }

    @Override
    public void nadar() {
        System.out.println("Pinguim nadou");
    }
}
