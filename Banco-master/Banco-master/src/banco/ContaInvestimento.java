
package banco;

public class ContaInvestimento extends Conta{
    private double depositoMinimo;
    private double montanteMinimo;
    
    public ContaInvestimento (Cliente dono, int numero, double saldoInicial, double depositoMinimo, double montanteMinimo) {
        super(dono, numero, saldoInicial);
        this.depositoMinimo = depositoMinimo;
        this.montanteMinimo = montanteMinimo;
    }
    
    @Override
    public boolean deposita(double valor) {
        if (valor >= depositoMinimo) {
            return super.deposita(valor);
        } else {
            System.out.println("Deposito insuficiente. O valor minimo do deposito e " + depositoMinimo);
            return false;
        }
    }

    @Override
    public boolean saca(double valor) {
        if ((getSaldo() - valor) >= montanteMinimo) {
            return super.saca(valor);
        } else {
            System.out.println("Saldo insuficiente após saque. O saldo mínimo exigido é " + montanteMinimo);
            return false;
        }
    }

    @Override
    public void remunera() {
        double saldoAtual = getSaldo();
        double remuneracao = saldoAtual * 0.02;
        super.deposita(remuneracao);
    }
    
    
}
