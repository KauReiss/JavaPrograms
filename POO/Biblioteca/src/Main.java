public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Diogo Jota", 28, "Masculino");
        Pessoa p2 = new Pessoa("Ana", 21, "Feminino");
        Livro l1 = new Livro("Sherlock Holmes", "Arthur Conan Doyle", 207, p1);
        Livro l2 = new Livro("O Mundo de Sofia", "Joestin Gaarder", 150, p2);

        l1.detalhes();
        l2.detalhes();
        l1.abrir();
        l1.detalhes();
        l2.fechar();
    }
}
