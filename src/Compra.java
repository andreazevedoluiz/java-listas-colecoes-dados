public class Compra implements Comparable<Compra> {

    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String descricao() {
        return descricao;
    }

    public double valor() {
        return valor;
    }

    @Override
    public String toString() {
        return "compra: descricao = " + descricao + "valor = " + valor;
    }

    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}
