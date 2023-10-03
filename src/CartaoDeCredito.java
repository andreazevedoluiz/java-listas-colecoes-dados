import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this. saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lacacompra(Compra compra){
        if(this.saldo > compra.valor()){
            this.saldo-= compra.valor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public List<Compra> compras() {
        return compras;
    }

    public double limite() {
        return limite;
    }

    public double saldo() {
        return saldo;
    }
}
