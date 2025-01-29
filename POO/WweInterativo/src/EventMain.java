public class EventMain {
    
    private Smackdown ladoAzul;
    private Raw ladoVermelho;
    private Boolean aprovada;
    
    
    public EventMain(Smackdown ladoAzul, Raw ladoVermelho) {
        this.ladoAzul = ladoAzul;
        this.ladoVermelho = ladoVermelho;
        this.aprovada = false;
    }


    public Smackdown getLadoAzul() {
        return ladoAzul;
    }
    public void setLadoAzul(Smackdown ladoAzul) {
        this.ladoAzul = ladoAzul;
    }

    public Raw getLadoVermelho() {
        return ladoVermelho;
    }
    public void setLadoVermelho(Raw ladoVermelho) {
        this.ladoVermelho = ladoVermelho;
    }

    public Boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

}
