public class ControleRemoto implements Controlador{
    
    // Atributos
    private int volume;
    private Boolean ligado;
    private Boolean tocando;

    //Construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    // Getters e Setters
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    private Boolean getligado(){
        return this.ligado;
    }
    private void setligado(Boolean ligado){
        this.ligado = ligado;
    }
    private Boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(Boolean tocando){
        this.tocando = tocando;
    }

    // Métodos
    @Override
    public void ligar() {
        this.setligado(true);
    }
    @Override
    public void desligar() {
        this.setligado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("---------MENU---------");
        System.out.println("Está ligado? " + this.getligado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for ( int i = 0; i <= getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println(" ");
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisVolume() {
        if (this.ligado == true) {
            this.volume += 5;
        } else {
            System.out.println("A TV está desligada!");
        }
    }
    @Override
    public void menosVolume() {
        if (this.ligado == true) {
            this.volume -= 5;
        } else {
            System.out.println("A TV está desligada!");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.ligado == true && this.volume > 0){
            this.volume = 0;
        } else {
            System.out.println("Erro ao colocar no mudo!");
        }
    }
    @Override
    public void desligarMudo() {
        if (this.ligado == true && this.volume == 0){
            this.volume = 50;
        } else {
            System.out.println("Erro ao desligar mudo!");
        }
    }
    @Override
    public void play() {
        if (this.ligado == true && this.tocando == false){
            this.tocando = true;
        } else {
            System.out.println("Erro ao dar play!");
        }
    }
    @Override
    public void pause() {
        if (this.ligado == true && this.tocando == true){
            this.tocando = false;
        } else {
            System.out.println("Erro ao dar pause!");
        }
     }

}