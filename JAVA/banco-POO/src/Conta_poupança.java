public class Conta_poupança extends Conta{

    public Conta_poupança(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    public void renderSaldo(){
        saldo += saldo * 0.1;
    }
}
