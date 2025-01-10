public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade, sexo;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //Construtor
    public Lutador(String nome, String nacionalidade, String sexo, int idade, float altura, float peso, int v, int d, int e) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.categoria = setCategoria(); //Já pegar o peso e setar a categoria do lutador
    }

    public String getCategoria() {
        return categoria;
    }
    private String setCategoria() {
        
        //A partir do peso ser estabelecido a categoria do lutador
        if (this.peso <= 52.5f) {
            return "Inválido";
        } else if (this.peso <= 70.3f) {
            return "Peso-Leve";
        } else if (this.peso <= 83.9f) {
            return "Peso-Médio";
        } else if (this.peso <= 120.2f) {
            return "Peso-Pesado";
        } else {
            return "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Métodos
    public void apresentar() {

        //Apresentação completa do lutador
        System.out.println(
        "\n Lutador: " + getNome() + 
        "\n Nacionalidade: " + getNacionalidade() +
        "\n Sexo: " + getSexo() + 
        "\n Idade: " + getIdade() + " anos " + 
        "\n Altura: " + getAltura() + "m" +
        "\n Peso: " + getPeso() + "kg" + 
        "\n Categoria: " + getCategoria() +
        "\n Vitorias: " + getVitorias() +
        "\n Derrotas: " + getDerrotas() +
        "\n Empates: " + getEmpates()
        );
    }
    public void status() {

        //Apresentação resumida do lutador
        if (this.getSexo().equals("Masculino")) {
            System.out.println( 
            "\n " + getNome() + " é um " + getCategoria() + 
            "\n " + getVitorias() + " triunfos" +
            "\n " + getDerrotas() + " derrotas" +
            "\n " + getEmpates() + " empates"
            );
        } else {
            System.out.println( 
            "\n " + getNome() + " é uma " + getCategoria() + 
            "\n " + getVitorias() + " triunfos" +
            "\n " + getDerrotas() + " derrotas" +
            "\n " + getEmpates() + " empates"
            );
        }
        
    }
    public void ganharLuta() {
        setVitorias(++this.vitorias);
    }
    public void perderLuta() {
        setDerrotas(++this.derrotas);
    }
    public void empatarLuta() {
        setEmpates(++this.empates);
    }
}
