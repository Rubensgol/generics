package exercicio2;

public class main {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto<>();
        p.setId(15);
        p.setValor((float)15.2);
        System.out.println(p.toString());
        
        p=new Produto<>();
        p.setId("23");
        p.setValor((float)23.3);
        System.out.println(p.toString());
    }
}
