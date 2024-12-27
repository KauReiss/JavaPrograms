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
        if (l1.getCategoria() == l1.getCategoria() && l1 != l2) {
            this.aprovada = true;
            setDesafiado(l1);
            setDesafiante(l2);
            return aprovada;
        } else {
            return aprovada;
        }
    }
    public void lutar() {
        if (this.aprovada == true) {
            System.out.println(" O desafiante: \n ----------------------------- \n ");
            desafiante.apresentar();
            System.out.println("\n ---------------------------------- \n ~~~~~~~~~~~~ VERSUS ~~~~~~~~~~~~ \n");
            System.out.println(" O desafiado: \n ----------------------------- \n ");
            desafiado.apresentar();
            double vencedor = (Math.random()) * 10;
            if(vencedor <= 3) {
                System.out.println(" \n ==================================== \n E o vencedor da luta é o ");
                desafiante.getNome();
                System.out.print(" !!! \n ====================================");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            } else if ( vencedor <= 7) {
                System.out.println(" \n ==================================== \n E o vencedor da luta é o -> ");
                desafiado.getNome();
                System.out.print(" !!! \n ====================================");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else {
                System.out.println(" \n ==================================== \n Tivemos um EMPATE !!! \n ====================================");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            }
        } else {
            System.out.println(" A luta não pode acontecer!");
        }
    }
}
