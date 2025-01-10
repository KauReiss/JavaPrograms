import java.util.Random;

public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private Boolean aprovada = false; //A luta precisa ser aprovada através do método 'marcarLuta()'


    //Getters e Setters
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
    private void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
    

    //Métodos
    public Boolean marcarLuta(Lutador l1, Lutador l2) {

        //Se os lutadores forem da mesma categoria, forem diferentes, do mesmo sexo e não estiver Inválido na categoria, a luta será marcada (return true)
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 && l1.getSexo().equals(l2.getSexo()) && !l1.getCategoria().equals("Inválido")) {          
            setAprovada(true);
            setDesafiante(l1);
            setDesafiado(l2);
        }
        return aprovada; 
    }
    public void lutar() {

        //Verificação se o atributo aprovada é igual a true, para a luta acontecer
        if (this.aprovada) {

            //Apresentação dos lutadores
            System.out.println("         O desafiante: \n ----------------------------- ");
            desafiante.apresentar();
            System.out.println("\n ~~~~~~~~~~ VERSUS ~~~~~~~~~~ \n");
            System.out.println("         O desafiado: \n ----------------------------- ");
            desafiado.apresentar();

            //Sorteio de um número ramdomico para definir o resultado da luta
            double vencedor = (Math.random()) * 10;

            //Número randomico para ser apresentado em qual round foi encerrada a luta
            Random random = new Random();
            rounds = random.nextInt(6) + 1;
            
            if(vencedor <= 3) {
                desafiante.ganharLuta();
                desafiado.perderLuta();
                if (desafiante.getSexo().equals("Masculino")) {
                    System.out.println(" \n ==================================== \n E o vencedor da luta é o -> " + this.desafiante.getNome());
                } else {
                    System.out.println(" \n ==================================== \n E a vencedora da luta é a -> " + this.desafiante.getNome());
                }
                
                //A luta tem 5 rounds, se sair o numero 6 para a variável rounds, quer dizer que luta foi até o final, sem nocaute
                if (rounds == 6) {
                    System.out.println(" + Vitória vinda da decisão dos juízes ao final da luta");
                } else {
                    System.out.println(" Com uma vitória por nocaute no round " + rounds);
                }
                System.out.println(" > " + this.desafiante.getNome() + " soma agora " + this.desafiante.getVitorias() + " triunfos < \n ====================================");
            
            } else if ( vencedor <= 7) {
                desafiado.ganharLuta();
                desafiante.perderLuta();
                if (desafiado.getSexo().equals("Masculino")) {
                    System.out.println(" \n ==================================== \n E o vencedor da luta é o -> " + this.desafiado.getNome());
                } else {
                    System.out.println(" \n ==================================== \n E a vencedora da luta é a -> " + this.desafiado.getNome());
                }
                
                //A luta tem 5 rounds, se sair o numero 6 para a variável rounds, quer dizer que luta foi até o final, sem nocaute
                if (rounds == 6) {
                    System.out.println(" + Vitória vinda da decisão dos juízes ao final da luta.");
                } else {
                    System.out.println(" Com uma vitória por nocaute no round " + rounds);
                }
                System.out.println(" > " + this.desafiado.getNome() + " soma agora " + this.desafiado.getVitorias() + " triunfos < \n ====================================");
                
            } else {
                System.out.println(" \n ==================================== \n         Tivemos um EMPATE !!! \n ====================================");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            }
        } else {

            //A luta não está aprovada
            System.out.println(" A luta não pode acontecer!");
        }
    }
}
