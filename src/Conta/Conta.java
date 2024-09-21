package Conta;

public class Conta {
    private double saldo;

    public void sacar(double valor) { //100
        // lógica de saque...
        if (saldo >= valor){ //300
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    //pegar o valor do saldo
    public double getSaldo(){
        return this.saldo;
    }
    //serve para setar o valor do saldo
    public void setSaldo(double valor){
        this.saldo = valor;
    }
}
