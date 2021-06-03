package exercicio3;

import exercicio2.Produto;

public class main {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido();
        Produto p = new Produto();
        p.setId(15);
        p.setValor((float)15.2);

        pedido.adicionar(p);
        p=new Produto();
        p.setId("23");
        p.setValor((float)23.3);
        pedido.adicionar(p);

        System.out.println(pedido.mostrar());

    }
}
