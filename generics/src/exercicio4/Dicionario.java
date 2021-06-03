package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Dicionario<T> {
    List<String> chaves;
    List<T> valores;

    public Dicionario() {
        chaves = new ArrayList<String>();
        valores = new ArrayList<>();
    }

    public boolean add(String chave, T valor) {
        for (String schave : this.chaves) {
            if (schave.equals(chave))
                return false;
        }

        this.chaves.add(chave);
        this.valores.add(valor);
        return true;
    }
    public String buscaForChave(String chave){
        for (int i = 0; i < chaves.size(); i++) {
            if(chave.equals(chaves.get(i))){
                return chaves.get(i)+" " +valores.get(i);
            }
        }
        return "Chave nao encontrada";
    }
}
/*
 *Outro método necessário é o de busca pela chave, este deve retornar chave e valor. 
Crie também o Main testando todas as condições.
 */