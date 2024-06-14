
package banco;


public class ContaCorrente extends Conta {
    private double limite;
    
    public ContaCorrente(Cliente dono, int numero, double saldoInicial, double limite) {
        super (dono, numero, saldoInicial);
        this.limite = limite;
    }
    
    @Override
    public boolean saca (double valor){
        if (valor > 0) {
            if (saldo - valor >= -limite) {
                saldo -= valor;
                return true;
            } else {
                System.out.println("O valor do saque não pode ultrapassar o limite da conta.");
                return false;
            }
        }
        System.out.println("O valor do saque deve ser positivo.");
        return false;
    }
    
    @Override
    public void remunera() {
        saldo += saldo * 0.01;
    }
    
      
}
