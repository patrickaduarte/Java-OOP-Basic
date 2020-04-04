package cev_aula5;

public class ContaBanco {
       public int numConta;
       protected String tipo;
       private String dono;
       private float saldo;
       private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo.toLowerCase());
        this.setStatus(true);
           switch (this.tipo) {
                case "cc":
                   this.setSaldo(50);
                   break;
                case "cp":
                   this.setSaldo(150);
                   break; 
           }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta(int numero){
        if(this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono() + ".");
        }
        else {
            System.out.println("Impossível depositar em conta fechada");
        }
    }
    
    public void sacar(float valor){
        if (this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono() + ".");
            } 
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    
    public void pagarMensal() {
        float mensalidade = 0;
        
        if("cc".equals(this.getTipo())){
            mensalidade = 12;
        } else {
            if("cp".equals(this.getTipo())){
                mensalidade = 20;
            }
        }
        if(this.getStatus()){
           if (this.getSaldo() > mensalidade){
               this.setSaldo(this.getSaldo() - mensalidade);
               System.out.println("Mensalidade da conta do " + this.getDono() + " paga com sucesso");
           }
           else {
               System.out.println("Saldo insuficiente");
           }
        }
        else {
            System.out.println("Impossível pagar a mensalidade em uma conta fechada");
        }
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float valor) {
        this.saldo = valor;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }    
}
