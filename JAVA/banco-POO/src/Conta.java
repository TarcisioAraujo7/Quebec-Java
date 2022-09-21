public class Conta {
    protected Cliente cliente;
    protected double saldo;
    protected static Integer conta = 1;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        conta ++;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double quantidade){
        saldo -= quantidade;
    }

    public void depositar(double quantidade){
        saldo += quantidade;
    }

    public void transferencia(double quantidade, Conta conta){
        if (quantidade >= saldo){
            saldo -= quantidade;
            conta.depositar(quantidade);
            System.out.println("Voce transferiu " + "R$ para a conta " + conta);
        }
        
    }

    public static Integer getConta() {
        return conta;
    }

    
}
