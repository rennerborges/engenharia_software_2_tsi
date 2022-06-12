package java_metrics;

public class Pessoa {
	private String nome;
    protected String sexo;
    public String email;

    public Pessoa(String nome, String sexo, String email ) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    protected String getSexo(){
        return formatarSexo(sexo);
    }
    
    private String formatarSexo(String sexo){
        if(sexo.equals("m")){
            return "Masculino";
        }
        
        return "Feminino";
    }
}
