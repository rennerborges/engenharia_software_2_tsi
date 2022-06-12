package java_metrics;

import cpf.ValidaCPF;

public class PessoaFisica extends Pessoa {
	private String cpf;

    public PessoaFisica(String cpf, String nome, String sexo, String email) {
        super(nome, sexo, email);
        ValidaCPF validador = new ValidaCPF();
        if(validador.isCPF(cpf)) {
        	this.cpf = cpf;        	
        }else {
        	throw new RuntimeException("Informe um cpf válido");
        }
    }

    public String getCpf() {
        return cpf;
    }
}
