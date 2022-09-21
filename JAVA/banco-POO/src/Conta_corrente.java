public class Conta_corrente extends Conta {

    public Conta_corrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    public void renderSaldo(){
        saldo += saldo * 0.02;
    }
    
}
