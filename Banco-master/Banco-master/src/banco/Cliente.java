
package banco;


public class Cliente implements Comparable<Cliente> {
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;
    private String endereco;
    private Conta conta;

    public Cliente(String nome, String sobrenome, String rg, String cpf, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Conta getConta() {
        return conta;
    }
    
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
     @Override
    public int compareTo(Cliente outroCliente) {
        int nomeComparison = this.nome.compareTo(outroCliente.nome);
        if (nomeComparison != 0) {
            return nomeComparison;
        }
        
        int sobrenomeComparison = this.sobrenome.compareTo(outroCliente.sobrenome);
        if (sobrenomeComparison != 0) {
            return sobrenomeComparison;
        }
        
        return this.cpf.compareTo(outroCliente.cpf);
    }
    
    
    
}
