public class Main {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("Jubileu");
        p1.setNumConta(111);
        p1.abrirConta("cc"); 
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
