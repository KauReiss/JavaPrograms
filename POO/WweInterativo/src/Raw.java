public class Raw extends Superstar {
    
    private String divisao;


    public Raw(String nome, String nacionalidade, int idade, float altura, float peso, String divisao) {
        super(nome, nacionalidade, idade, altura, peso);
        this.divisao = "RAW";
    }

    @Override
    public void apresentar() {
        
    }

    @Override
    public void status() {
        
    }
    
}
