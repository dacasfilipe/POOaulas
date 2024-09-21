package Conta;

public class Main {
    public static void main(String[] args) {
        //criando o objeto C1
        Conta c1 = new Conta();
        //c1.saldo = 300;
        c1.setSaldo(300);
        c1.sacar(100);
        System.out.println("Saldo = "+ c1.getSaldo());
    }
}
