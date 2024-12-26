public class Caneta {
    private String modelo;
    private double ponta;
    private Boolean tampada;
    private String cor;

    public Caneta(String modelo, String cor, double ponta){  // Este é o método construtor
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;       
    }

    public double getPonta(){
        return this.ponta;
    }

    public void setPonta(double ponta){
        this.ponta = ponta;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("-----------------------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta da caneta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampada);
    }
}