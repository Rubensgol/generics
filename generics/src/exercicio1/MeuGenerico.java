package exercicio1;

public class MeuGenerico<T> {
    private T atribu;

    public MeuGenerico(T para) {
        this.atribu=para;
    }

    public T getAtribu() {
        return atribu;
    }

}
