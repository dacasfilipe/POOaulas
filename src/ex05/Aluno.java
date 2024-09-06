package ex05;

import java.util.Scanner;

public class Aluno {

    String nome;
    int idade;

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    public void informeAnoNascimento(){
        int anoAtual = 2024;
        int anoNascimento = anoAtual - idade;
        System.out.println("Ano Nasc:"+anoNascimento);
    }
}
