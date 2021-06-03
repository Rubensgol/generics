package exercicio3;

import java.util.ArrayList;
import java.util.List;

import exercicio2.Produto;

/*3 - Uma classe de Pedido deve conter uma lista de Produtos
 ter os métodos de adicionar e mostrar lista de Produtos. 
 Mas os produtos desta lista só podem ser produtos que herdam características da classe ProdutoX
 Crie a classe ProdutoX, Pedido 
 Main demonstrando a utilização dos dois métodos de Pedido*/
public class Pedido {
    protected List<ProdutoX> produtos;

    public Pedido() {
        produtos = new ArrayList<ProdutoX>();
    }

    public boolean adicionar(ProdutoX p) {
        return produtos.add(p);

    }

    public String mostrar() {
        String produtosS = "";
        for (ProdutoX produtoX : produtos) {
            produtosS += produtoX + " ";
        }
        return produtosS;
    }
}
