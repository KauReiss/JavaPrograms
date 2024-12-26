public class App {
    public static void main(String[] args) throws Exception {

        /* 
        Lutador lutador[] = {};
        lutador[0] = new Lutador("Koundé", "França", 31, 1.69f, 68.9f, 11, 2, 1);
        lutador[1] = new Lutador("Charles", "Brasil", 29, 1.78f, 57.8f, 14, 2, 3); 
        lutador[2] = new Lutador("Speed", "EUA", 35, 1.81f, 80.9f, 12, 2, 1); 
        lutador[3] = new Lutador("Tim Cahill", "Australia", 28, 1.80f, 81.6f, 13, 0, 2);
        lutador[4] = new Lutador("Walter", "Brasil", 37, 1.93f, 119.3f, 5, 4, 3); 
        lutador[5] = new Lutador("Mark Henry", "EUA", 30, 1.91f, 105.7f, 12, 2, 4); 

        lutador[0].apresentar();
        */
        
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

    }
}
