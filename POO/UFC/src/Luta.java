import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private Boolean aprovada = false;


    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public Boolean marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            setAprovada(true);
            setDesafiante(l1);
            setDesafiado(l2);
            return aprovada;
        } else {
            return aprovada;
        }
    }
    public void lutar() {
        if (this.aprovada == true) {
            System.out.println("         O desafiante: \n ----------------------------- ");
            desafiante.apresentar();
            System.out.println("\n ~~~~~~~~~~ VERSUS ~~~~~~~~~~ \n");
            System.out.println("         O desafiado: \n ----------------------------- ");
            desafiado.apresentar();
            double vencedor = (Math.random()) * 10;
            Random random = new Random();
            rounds = random.nextInt(6) + 1;
            if(vencedor <= 3) {
                desafiante.ganharLuta();
                desafiado.perderLuta();
                System.out.println(" \n ==================================== \n E o vencedor da luta é o -> " + this.desafiante.getNome());
                if (rounds == 6) {
                    System.out.println(" Uma vitória vinda da decisão dos juízes ao final da luta");
                } else {
                    System.out.println(" Com uma vitória por nocaute no round " + rounds);
                }
                System.out.println(" " + this.desafiante.getNome() + " soma agora " + this.desafiante.getVitorias() + " triunfos !!! \n ====================================");
            
            } else if ( vencedor <= 7) {
                desafiado.ganharLuta();
                desafiante.perderLuta();
                System.out.println(" \n ==================================== \n E o vencedor da luta é o -> " + this.desafiado.getNome());
                System.out.println(" > Somando agora " + this.desafiado.getVitorias() + " triunfos < \n ====================================");
                
            } else {
                System.out.println(" \n ==================================== \n         Tivemos um EMPATE !!! \n ====================================");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            }
        } else {
            System.out.println(" A luta não pode acontecer!");
        }
    }
}
