public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }
    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println(" Livro: " + this.titulo + "\n Autor: " + this.autor + "\n Total de páginas: " + this.totPaginas + ".");
        if (this.aberto == true) {
            System.out.println("-> Está aberto e em posse do leitor " + this.leitor + ".");
        } else {
            System.out.println("-> Está fechado e em posse do leitor " + this.leitor + ".");
        }
    }
    
    @Override
    public void abrir() {
        if (this.aberto == true) {
            System.out.println("O livro " + this.titulo + " já está aberto!");
        } else {
            this.aberto = true;
        }
    }
    @Override
    public void fechar() {
        if (this.aberto == false) {
            System.out.println("O livro" + this.titulo + " já está fechado!");
        } else {
            this.aberto = false;
        }
    }
    @Override
    public void folear(int pagina) {
        if (pagina > this.totPaginas) {
            System.out.println("A página que foi solicitada excede o tamanho do livro " + this.titulo + ", que tem um total de " + this.totPaginas + " páginas.");
        } else {
            this.pagAtual = pagina;
        }
    }
    @Override
    public void avancarPag() {
        if (this.pagAtual == this.totPaginas) {
            System.out.println("O leitor " + getLeitor() + " já está na última página do livro " + getTitulo() + ".");
        } else {
            this.pagAtual++;
        }
    }
    @Override
    public void voltarPag() {
        if (this.pagAtual == 0) {
            System.out.println("O leitor" + this.leitor + ", já está na primeira página do livro " + this.titulo + ".");
        } else {
            this.pagAtual--;
        }
    }

}
