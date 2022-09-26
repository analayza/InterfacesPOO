package Model;

import Interface.IComplementoAndar;
import Interface.IComportamentoVoar;
import jdk.swing.interop.SwingInterOpUtils;

public class Arrara extends Ave implements IComportamentoVoar, IComplementoAndar {

    boolean estaEmExtincao;


    public Arrara(int quantidadeDePatas, int quantidadeDeAssas, boolean estaEmExtincao) {
        super(quantidadeDePatas, quantidadeDeAssas);
    }

    public boolean isEstaEmExtincao() {
        return estaEmExtincao;
    }

    public void setEstaEmExtincao(boolean estaEmExtincao) {
        this.estaEmExtincao = estaEmExtincao;
    }

    @Override
    public void voar() {
        System.out.println("arara voou");
    }

    @Override
    public void andar() {
        System.out.println("arara andou");
    }
}
