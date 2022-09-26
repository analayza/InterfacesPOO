package Model;

public class Ave {
    int quantidadeDePatas;
    int quantidadeDeAssas;

    public Ave(int quantidadeDePatas, int quantidadeDeAssas) {
        this.quantidadeDePatas = quantidadeDePatas;
        this.quantidadeDeAssas = quantidadeDeAssas;
    }

    public void bicar(){
        System.out.println("A ave bicou");
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public int getQuantidadeDeAssas() {
        return quantidadeDeAssas;
    }

    public void setQuantidadeDeAssas(int quantidadeDeAssas) {
        this.quantidadeDeAssas = quantidadeDeAssas;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "quantidadeDePatas=" + quantidadeDePatas +
                ", quantidadeDeAssas=" + quantidadeDeAssas +
                '}';
    }
}
