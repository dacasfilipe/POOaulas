package Carro;

import java.util.Scanner;

public class Carro {
    //CRiar os atributos da classe carro
    String nome;
    String marca;
    String modelo;
    int ano;
    // funções da classe Carro.Carro, ações do carro
    public void ligarCarro(){
        System.out.println("Carro ligado!!");
    }
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
    public void lerDados(){
        Scanner ler =  new Scanner(System.in);
        System.out.println("Digite o nome do carro: ");
        nome = ler.nextLine();
        System.out.println("Digite o modelo: ");
        modelo = ler.nextLine();
        System.out.println("Digite a marca: ");
        marca = ler.nextLine();
        System.out.println("Digite o ano: ");
        ano = ler.nextInt();
    }
} //fim da classe
