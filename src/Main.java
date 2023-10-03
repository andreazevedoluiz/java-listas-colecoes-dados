import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o Limite do cartão ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0 ){
            System.out.println("Digite a descrição da compra");
            String descricao = leitura.next();

            System.out.println("Digite o valor da Compra");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lacacompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            }else{
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
        }

        System.out.println("****************************************************");
        System.out.println("Compras Realizadas: \n");
        Collections.sort(cartao.compras());

        for (Compra c : cartao.compras()){
            System.out.println(c.descricao() + " - " +c.valor());
        }
        System.out.println("*****************************************************");

        System.out.println("\n Saldo do cartao: " +cartao.saldo());
    }
}