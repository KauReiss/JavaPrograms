import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println(" WWE Fight - Interativo \n =======================");
        System.out.println("Aqui você pode cirar os seus superstars e marcar um evento para eles lutarem! ");
        int opcao = 1;
        int wr = 0;
        int ws = 0;
        Raw r[] = new Raw[20];
        Smackdown s[] = new Smackdown[20];
        while (opcao != 0) {
            System.out.println("\n--------- Comece escolhendo uma opção---------");
            System.out.println(" > 1- Criar um Superstar");
            System.out.println(" > 2- Listar todos os Superstars criados");
            System.out.println(" > 3- Listar os Superstars do RAW");
            System.out.println(" > 4- Listar os Superstars do Smackdown");
            System.out.println(" > 5- Marcar Evento");
            System.out.println(" > 6- Listar Eventos criados");
            System.out.println(" > 7- Fazer Evento acontecer");
            System.out.println(" > 8- Limpar a lista de Superstars ou Eventos");
            System.out.println(" > 0- Para encerrar.");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:               //ideia: criar o objeto e ir setando as características depois
                    System.out.println(" Qual será o nome do seu Superstar?");
                    String name = input.next();
                    System.out.println(" Qual a nacionalidade?");
                    String nationality = input.next();
                    System.out.println(" Quantos anos tem o Superstar?");
                    int age = input.nextInt();
                    System.out.println(" Quantos centímetros de altura tem o Superstar?");
                    double height = input.nextDouble();
                    System.out.println(" Qual o peso?");
                    double weight = input.nextDouble();
                    System.out.println(" Pra finalizar, de qual divisão ele será, Raw ou Smackdown ?");
                    String division = input.next();
                    if (division.equals("Raw")) {
                        r[wr] = new Raw(name, nationality, age, height, weight);
                        System.out.println(" Superstar do Raw criado com sucesso!");
                        wr++;
                    } else if (division.equals("Smackdown")) {
                        s[ws] = new Smackdown(name, nationality, age, height, weight);
                        System.out.println(" Superstar do Smackdown criado com sucesso!");
                        ws++;
                    } else {
                        System.out.println(" Divisão inválida!");
                    }
                    break;

                case 2:
                if (wr > 0) {
                    int ir = wr - 1;
                    while (ir>=0) {
                        r[ir].apresentar();
                        ir--;
                    }
                }
                if (ws > 0) {
                    int is = ws - 1;
                    while (is>=0) {
                        s[is].apresentar();
                        is--;
                    }
                }
                break;
                
                case 3:
                if (wr > 0) {
                    int ir = wr - 1;
                    while (ir>=0) {
                        r[ir].apresentar();
                        ir--;
                    }
                } else {
                    System.out.println(" Não tem lutadores do RAW!");
                }
                break;

                case 4: 
                if (ws > 0) {
                    int is = ws - 1;
                    while (is>=0) {
                        s[is].apresentar();
                        is--;
                    }
                } else {
                    System.out.println( " Não tem lutadores do Smackdown!");
                }
                break;

                default:
                    break;
            }
        }


        /* Raw s1 = new Raw("Dolph Zigler", "Canadá", 32, 1.79f, 78.3f);
        Smackdown s2 = new Smackdown("Undertaker", "EUA", 48, 1.93f, 98.3f);



        s1.apresentar();
        s2.apresentar(); */

    }
}
