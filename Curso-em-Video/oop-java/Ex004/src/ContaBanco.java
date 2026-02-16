public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //---------------------

    //Métodos
    public void abrirConta(String nome, String t, int n){
        this.setStatus(true);
        this.setDono(nome);
        this.setTipo(t);
        this.setNumConta(n);
        if (t.equals("CC")){
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta criada com sucesso!");
        this.conta();
    }
    public void fecharConta(){
        if (this.status){
            if (this.saldo == 0){
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            } else if (this.saldo > 0) {
                System.out.println("Você precisa sacar tudo primeiro!");
            } else {
                System.out.println("Você não pode fechar a sua conta, você está devendo " + this.getSaldo());
            }
        } else {
            System.out.println("Você precisa ter uma conta para poder fecha-la");
        }


    }
    public void depositar(double v){
        if (this.status){
            if (v > 0){
                this.setSaldo(this.getSaldo()+ v);
                System.out.println("O valor " + v + " foi depositado!");
                this.conta();
            } else {
                System.out.println("O valor para depósito deve ser maior que 0");
            }

        } else{
            System.out.println("Você precisa criar uma conta para poder fazer um depósito!");
        }
    }
    public double sacar(double v){
        if (this.status){
            if (v < 0){
                v *= -1;
            }
            this.setSaldo(this.getSaldo() - v);
            System.out.println("O valor: " + v + " foi retirado!");
            this.conta();
            return v;
        } else {
            System.out.println("Você precisa criar uma conta para poder sacar!");
            return 0;
        }
    }
    public void pagarMensal(){
        if (this.status){
            double v = 0;
            if (this.tipo.equals("CC")){
                v = 12;
            } else if (this.tipo.equals("CP")) {
                v = 20;
            }
            if (this.saldo > v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga");
            } else {
                System.out.println("Saldo insuficiente");
            }
            this.conta();
        } else {
            System.out.println("Você precisa criar uma conta para poder pagar a mensalidade");
        }
    }

    public void conta(){
        System.out.println("-----Status da conta------");
        System.out.println("N. da Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo atual: " + this.getSaldo());
        System.out.println("--------------------------");
        System.out.println();

    }

}


