public abstract class Superstar {
    
    protected String nome;
    protected String nacionalidade;
    protected int idade;
    protected float altura;
    protected float peso;
    protected int vitorias;
    protected int derrotas;


    protected Superstar(String nome, String nacionalidade, int idade, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }


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

    public float getAltura() {
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
    }

    public int getVitorias() {
        return vitorias;
    }
    protected void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    protected void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    
    public abstract void apresentar();
    public abstract void status();
    public void naoCalouro(int vitorias, int derrotas) {
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
    }
}
