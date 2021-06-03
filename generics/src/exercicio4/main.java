package exercicio4;

public class main {
    public static void main(String[] args) throws Exception {
        Dicionario dic = new Dicionario<>();
        System.out.println(dic.add("chave1", 15));
        System.out.println(dic.add("2", "chave2"));
        System.out.println(dic.add("chave1", 13.2));
        System.out.println(dic.buscaForChave("2"));
    }
}
