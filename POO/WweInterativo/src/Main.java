import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("WWE Fight - Interativo \n =======================");
        System.out.println("Aqui você pode cirar os seus superstars e marcar um evento para eles lutarem!");
        int opcao = 1;
        while (opcao != 0) {
            System.out.println("--------- Comece escolhendo uma opção---------");
            System.out.println(" > 1- Criar um Superstar");
            System.out.println(" > 2- Listar Superstars criados");
            System.out.println(" > 3- Marcar Evento");
            System.out.println(" > 4- Listar Eventos criados");
            System.out.println(" > 5- Fazer Evento acontecer");
            System.out.println(" > 6- Limpar a lista de Superstars ou Eventos");
            System.out.println(" > 0- Para encerrar.");
        }


        Raw s1 = new Raw("Dolph Zigler", "Canadá", 32, 1.79f, 78.3f);
        Smackdown s2 = new Smackdown("Undertaker", "EUA", 48, 1.93f, 98.3f);



        s1.apresentar();
        s2.apresentar();
    }
}
