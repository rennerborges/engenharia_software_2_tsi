package java_metrics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica alberto = new PessoaFisica("49868753619", "Alberto", "m", "alberto@mail.com");
        
        System.out.println(alberto.getNome());
        System.out.println(alberto.email);
        System.out.println(alberto.getCpf());
        System.out.println(alberto.sexo);
        
        PessoaJuridica maria = new PessoaJuridica("24577538000121", "Maria", "f", "maria@corp.com");
        
        System.out.println(maria.getNome());
        System.out.println(maria.email);
        System.out.println(maria.getCpnj());
        System.out.println(alberto.sexo);
	}

}
