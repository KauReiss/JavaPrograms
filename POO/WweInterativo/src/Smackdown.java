public class Smackdown extends Superstar {

    private String divisao;


    public Smackdown(String nome, String nacionalidade, int idade, double altura, double peso) {
        super(nome, nacionalidade, idade, altura, peso);
        this.divisao = "SMACKDOWN";
    }

    public String getDivisao() {
        return divisao;
    }
    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }


    @Override
    public void apresentar() {
        System.out.println(
        "\n Superstar: " + getNome() + 
        "\n Nacionalidade: " + getNacionalidade() +
        "\n Idade: " + getIdade() + " anos " + 
        "\n Altura: " + getAltura() + "m" +
        "\n Peso: " + getPeso() + "kg" + 
        "\n Divisão: " + getDivisao() +
        "\n Vitorias: " + getVitorias() +
        "\n Derrotas: " + getDerrotas()
        );
    }

    @Override
    public void status() {
        System.out.println( 
        "\n " + getNome() + " superstar do " + getDivisao() + 
        "\n " + getVitorias() + " triunfos" +
        "\n " + getDerrotas() + " derrotas"
        );
    }
    
    
}
