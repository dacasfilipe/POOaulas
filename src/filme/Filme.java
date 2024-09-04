package filme;

import java.util.Scanner;

public class Filme {
    String nome;
    String classificacao;
    String genero;
    boolean incluidoNoPlano;
    int duracaoEmMinutos;

    public void imprimirDados(){
        System.out.println("filme.Filme: " + nome);
        System.out.println("Duração: " + duracaoEmMinutos + " Min");
        System.out.println("Classificação: " + classificacao);
        System.out.println("Genero: " + genero);
        System.out.println("Incluido no Plano: " + incluidoNoPlano);
    }

    public void lerDados(){
        Scanner ler =  new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        nome = ler.nextLine();
        System.out.println("Digite a classificação do filme: ");
        classificacao = ler.nextLine();
        System.out.println("Digite o genero do filme: ");
        genero = ler.nextLine();
        System.out.println("Digite a duração do filme em minutos: ");
        duracaoEmMinutos = ler.nextInt();
        System.out.println("Digite se o filme esta incluso no plano: ");
        incluidoNoPlano = ler.nextBoolean();
    }
}