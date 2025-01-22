import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("WWE Fight - Interativo \n =======================");
        System.out.println("Aqui você pode cirar os seus superstars e marcar um evento para eles lutarem!");
        int opcao = 1;
        int i = 0;
        while (opcao != 0) {
            System.out.println("--------- Comece escolhendo uma opção---------");
            System.out.println(" > 1- Criar um Superstar");
            System.out.println(" > 2- Listar Superstars criados");
            System.out.println(" > 3- Marcar Evento");
            System.out.println(" > 4- Listar Eventos criados");
            System.out.println(" > 5- Fazer Evento acontecer");
            System.out.println(" > 6- Limpar a lista de Superstars ou Eventos");
            System.out.println(" > 0- Para encerrar.");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:               //ideia: criar o objeto e ir setando as características depois
                    System.out.println("Qual será o nome do seu Superstar?");
                    String name = input.nextLine();
                    System.out.println(" Qual a nacionalidade?");
                    String nationality = input.nextLine();
                    System.out.println(" Quantos anos tem o Superstar?");
                    int age = input.nextInt();
                    System.out.println(" Qual a altura o Superstar?");
                    float height = input.nextFloat();
                    System.out.println(" Qual o peso?");
                    float weight = input.nextFloat();
                    System.out.println("Pra finalizar, de qual divisão ele será, Raw ou Smackdown ?");
                    String division = input.nextLine();
                    if (division.equals("Raw")) {
                        Raw r = new Raw(name, nationality, age, height, weight);
                        System.out.println(" Superstar do Raw criado com sucesso!");
                    } else if (division.equals("Smackdown")) {
                        Smackdown s = new Smackdown(name, nationality, age, height, weight);
                        System.out.println(" Superstar do Smackdown criado com sucesso!");
                    } else {
                        System.out.println(" Divisão inválida!");
                    }
                    break;
            
                default:
                    break;
            }
        }


        Raw s1 = new Raw("Dolph Zigler", "Canadá", 32, 1.79f, 78.3f);
        Smackdown s2 = new Smackdown("Undertaker", "EUA", 48, 1.93f, 98.3f);



        s1.apresentar();
        s2.apresentar();
    }
}
