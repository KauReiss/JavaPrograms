public class ContaBanco {
   
    // Atributos
    public int numConta;
    protected String tipo; //cc = conta corrente  cp = conta poupança
    private String dono;
    private double saldo;
    private Boolean status;

    // Métodos Personalizados
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("ID da conta: " +this.numConta);
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Status: " + this.status);
    }
    // Construtor
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }

    // Getters e Setters
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public Boolean getStatus(){
        return this.status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    // Métodos
    public void abrirConta(String tipo){
        this.status = true;
        if (tipo == "cp"){
            this.tipo = "cp";
            this.saldo += 150;
        } else {
            this.tipo = "cc";
            this.saldo += 50;
        }
    }
    public void fecharConta(){
        if (this.saldo > 0) {
            System.out.println("Não foi possível fechar conta pois tem saldo");
        } else if (this.saldo < 0) {
            System.out.println("Não foi possível fechar conta pois conta está em débito com o banco");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(double valor){
        if (this.status == true){
            this.saldo += valor;
            System.out.println("Foi feito um depósito de R$" + valor +" na conta de " + this.dono);
        } else {
            System.out.println("Erro! A conta precisa estar aberta para ser feito o depósito.");
        }
        
    }
    public void sacar(double valor){
        if (this.status == true && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Foi realizado um saque de R$" + valor + " na conta de " + this.dono);
        } else {
            System.out.println("Erro! A conta precisa estar aberta para ser feito o saque e com saldo suficiente.");
        }

    }
    public void pagarMensal() {
        if (this.status == true){
            if (this.tipo == "cc" && this.saldo > 15){
                    this.saldo -= 15;
                    System.out.println("Mensalidade paga com sucesso pelo dono " + this.dono);
            } if (this.tipo == "cp" && this.saldo > 20){
                this.saldo -= 20;
                System.out.println("Mensalidade paga com sucesso pelo dono " + this.dono);
            }
        } else {
            System.out.println("Conta desativada ou saldo insuficiente!");
        }
    }
}
