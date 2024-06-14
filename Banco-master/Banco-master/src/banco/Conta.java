
package banco;


public abstract class Conta implements ContaI {
    protected Cliente dono;
    protected int numero;
    protected double saldo;
    
    public Conta (Cliente dono, int numero, double saldoInicial) {
        this.dono = dono;
        this.numero = numero;
        this.saldo = saldoInicial;
    }
    
    @Override
    public boolean deposita (double valor){
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        System.out.println("O valor do depósito deve ser poditivo.");
        return false;
    }
     
    @Override
    public boolean saca (double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        System.out.println("O valor do saque deve ser positivo.");
        return false;
    }
    
    @Override
    public Cliente getDono(){
        return dono;
    }
    
    @Override
    public int getNumero() {
        return numero;
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public abstract void remunera();
}
