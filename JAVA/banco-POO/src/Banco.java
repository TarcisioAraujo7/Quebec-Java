import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome_banco;
    private List<Conta> contas = new ArrayList<Conta>();
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Banco(String nome_banco) {
        this.nome_banco = nome_banco;
    }

    public void cadastrarCliente(String nome){
        Cliente cliente_novo = new Cliente(nome);
        clientes.add(cliente_novo);
    }

    public void criarContaCorrente(Cliente cliente){
        Conta conta_nova = new Conta_corrente(cliente);
        contas.add(conta_nova);
    }

    public void criarContaPoupanca(Cliente cliente){
        Conta conta_nova = new Conta_poupança(cliente);
        contas.add(conta_nova);
    }

    public void dadosBanco(){
        System.out.println("Nome do banco: " + nome_banco);
        System.out.println("Quantidade de clientes: " + clientes.size() +
                        "\nQuantidade de contas: " + contas.size());
    }
}
