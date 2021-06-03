package exercicio2;

import java.util.Date;

import exercicio3.ProdutoX;

public class Produto<T> extends ProdutoX{
    private T id;
    private float valor;
    private Date dataFabricacao;
    private Date dataVencimento;
    public T getId() {
        return id;
    }
    public void setId(T id) {
        this.id = id;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Date getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    public Date getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    @Override
    public String toString() {
        return "Produto [dataFabricacao=" + dataFabricacao + ", dataVencimento=" + dataVencimento + ", id=" + id
                + ", valor=" + valor +", nome="+getNome()+"]";
    }
    
}
