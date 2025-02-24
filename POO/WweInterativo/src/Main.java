import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println(" WWE Fight - Interativo \n =======================");
        System.out.println("Aqui você pode cirar os seus superstars e marcar um evento para eles lutarem! ");
        int opcao = 1;
        int wr = 0;
        int ws = 0;
        int we = 0;
        EventMain e[] = new EventMain[20];
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
            input.nextLine();  // Limpa o buffer antes de ler a próxima linha
            switch (opcao) {

                case 1:
                    System.out.println(" Qual será o nome do seu Superstar?");
                    String name = input.nextLine();
                    System.out.println(" Qual a nacionalidade?");
                    String nationality = input.nextLine();
                    System.out.println(" Quantos anos tem o Superstar?");
                    int age = input.nextInt();
                    System.out.println(" Qual a altura do Superstar?");
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
                    System.out.println("\n Não tem lutadores do RAW!");
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
                    System.out.println( "\n Não tem lutadores do Smackdown!");
                }
                break;

                case 5:
                    int eventoOpcao;
                    System.out.println("\n Se o evento for um Main Event, digite 1. \n Se for com superstars de mesma categoria, digite 2.");
                    eventoOpcao = input.nextInt();
                    if (eventoOpcao == 1 ) {
                        if (ws > 0 && wr > 0) {
                            System.out.println(" Escreva o nome do superstar do Smackdown que irá participar do evento:");
                            String superstarSmack = input.next();
                            Boolean smackEspecif = false;
                            int numberSmack = 0;
                            int is = ws - 1;
                            while (is>=0) {                               
                                if (superstarSmack.equals(s[is].getNome())) {
                                    numberSmack = is;
                                    smackEspecif = true;
                                }
                                is--;
                            }
                            System.out.println(" Agora o nome do superstar do Raw:");
                            String superstarRaw = input.next();
                            Boolean rawEspecif = false;
                            int numberRaw = 0;
                            int ir = wr -1;
                            while (ir>=0) {
                                if (superstarRaw.equals(r[ir].getNome())) {
                                    numberRaw = ir;
                                    rawEspecif = true;
                                }
                                ir--;
                            }
                            if (smackEspecif && rawEspecif) {
                                e[we] = new EventMain(s[numberSmack], r[numberRaw]);
                                e[we].setAprovada(true);
                                we++;
                                System.out.println("\n > Main event entre " + s[numberSmack].getNome() + " e " + r[numberRaw].getNome() + " está marcada e pronta para acontecer!");
                            } else {
                                System.out.println(" Nome(s) do(s) superstar(s) inválido(s) ou não criado(s)!");
                            }
                            
                        } else {
                            System.out.println("\n> Não existe superstars criados o suficiente para marcar o evento escolhido! <");
                        }
                        

                    } else if (eventoOpcao == 2) {

                    } else {
                        System.out.println("Insira um número válido que represente o evento!");
                    }
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
