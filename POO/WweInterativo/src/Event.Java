public class MainEvent {

    private Smackdown ladoAzul;
    private Raw ladoVermelho;
    private Boolean aprovada;


    // Getter e Setter para ladoAzul
    public Smackdown getLadoAzul() {
        return ladoAzul;
    }
    public void setLadoAzul(Smackdown ladoAzul) {
        this.ladoAzul = ladoAzul;
    }

    // Getter e Setter para ladoVermelho
    public Raw getLadoVermelho() {
        return ladoVermelho;
    }
    public void setLadoVermelho(Raw ladoVermelho) {
        this.ladoVermelho = ladoVermelho;
    }

    // Getter e Setter para aprovada
    public Boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

}