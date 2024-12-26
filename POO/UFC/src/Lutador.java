public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int v, int d, int e) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
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
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if (this.peso <= 52.5f) {
            this.categoria = "Inválido";
        } else if (this.peso <= 65.7f) {
            this.categoria = "Peso-Pena";
        } else if (this.peso <= 70.3f) {
            this.categoria = "Peso-Leve";
        } else if (this.peso <= 83.9f) {
            this.categoria = "Peso-Médio";
        } else if (this.peso <= 120.2f) {
            this.categoria = "Peso-Pesado";
        } else {
            this.categoria = "Inválido";
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
        System.out.println(
        "\n Lutador: " + getNome() + 
        "\n Nacionalidade: " + getNacionalidade() + 
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
        System.out.println( 
            getNome() + " é um " + getCategoria() + 
            "\n" + getVitorias() + " triunfos" +
            "\n" + getDerrotas() + " derrotas" +
            "\n" + getEmpates() + " empates"
            );
    }
    public void ganharLuta() {
        setVitorias(this.vitorias++);
    }
    public void perderLuta() {
        setDerrotas(this.derrotas++);
    }
    public void empatarLuta() {
        setEmpates(this.empates++);
    }
}
