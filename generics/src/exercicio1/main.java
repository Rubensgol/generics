package exercicio1;

public class main {
    public static void main(String[] args) throws Exception {
        MeuGenerico str= new MeuGenerico(10);
        System.out.println(str.getAtribu());
        
        str=new MeuGenerico("para");
        System.out.println(str.getAtribu());

        str=new MeuGenerico(11.2);
        System.out.println(str.getAtribu());

        Pessoa pessoa=new Pessoa();
        pessoa.setNome("Rubens");
        str=new MeuGenerico(pessoa);
        System.out.println(str.getAtribu());
    }
}
