package java_metrics;

public class PessoaJuridica extends Pessoa{
    public String cpnj;

    public PessoaJuridica(String cpnj, String nome, String sexo, String email) {
        super(nome, sexo, email);
        this.cpnj = cpnj;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
}
