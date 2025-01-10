public class Main {
    public static void main(String[] args) throws Exception {

        
        Lutador m[] = new Lutador[6];
        m[0] = new Lutador("Koundé", "França", "Masculino", 31, 1.69f, 68.9f, 11, 2, 1);
        m[1] = new Lutador("Charles", "Brasil", "Masculino", 29, 1.78f, 57.8f, 14, 2, 3); 
        m[2] = new Lutador("Speed", "EUA", "Maculino", 35, 1.81f, 80.9f, 12, 2, 1); 
        m[3] = new Lutador("Tim Cahill", "Australia", "Masculino", 28, 1.80f, 81.6f, 13, 0, 2);
        m[4] = new Lutador("Walter", "Brasil", "Masculino", 37, 1.93f, 119.3f, 5, 4, 3); 
        m[5] = new Lutador("Mark Henry", "EUA", "Masculino", 30, 1.91f, 105.7f, 12, 2, 4); 

        Lutador f1 = new Lutador("Ronda Rousey", "EUA", "Feminino", 37, 1.71f, 61, 8, 0, 2);
        Lutador f2 = new Lutador("Amanda Nunes", "Brasil", "Feminino", 36, 1.71f, 61, 12, 2, 1);


        System.out.println("       < PRIMEIRA LUTA >");
        Luta lutaf = new Luta();
        lutaf.marcarLuta(f1, f2);
        lutaf.lutar();
        f1.status();
        f2.status();
        


        System.out.println("\n       < SEGUNDA LUTA >");
         Luta luta01 = new Luta();
         luta01.marcarLuta(m[1], m[0]);
         luta01.lutar();
         m[0].status();
         m[1].status();
        





        /* 
        Lutador kounde = new Lutador("Koundé", "França", 31, 1.69f, 68.9f, 11, 2, 1); 
        Lutador charles = new Lutador("Charles", "Brasil", 29, 1.78f, 57.8f, 14, 2, 3); 
        Lutador speed = new Lutador("Speed", "EUA", 35, 1.81f, 80.9f, 12, 2, 1); 
        Lutador cahill = new Lutador("Tim Cahill", "Australia", 28, 1.80f, 81.6f, 13, 0, 2); 
        Lutador walter = new Lutador("Walter", "Brasil", 37, 1.93f, 119.3f, 5, 4, 3); 
        Lutador mark = new Lutador("Mark Henry", "EUA", 30, 1.91f, 105.7f, 12, 2, 4); 
        
        kounde.apresentar();
        charles.status();
        walter.apresentar();
        walter.ganharLuta();
        walter.apresentar();
        */

    }
}
