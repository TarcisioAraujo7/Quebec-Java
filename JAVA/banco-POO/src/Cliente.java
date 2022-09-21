public class Cliente {
    private String nome;
    private static int codigo = 1;

    public Cliente(String nome){
        this.nome = nome;
        codigo ++;
    }

    public String getNome() {
        return nome;
    }

    public static int getCodigo() {
        return codigo;
    }
    
}
