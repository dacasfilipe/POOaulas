package ex03;

import java.util.Scanner;

public class Musica {
// avaliar a música e calcular a média de avaliações.
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;
    double somatorioAvaliacoes;
    double mediaAvaliacoes;

    public void exibirFichaTecnica(){
        System.out.println("titulo:"+titulo);
        System.out.println("artista:"+artista);
        System.out.println("Ano de Lançamento:"+anoLancamento);
        System.out.println("Avaliação:"+avaliacao);
        System.out.println("número Avaliações:"+numAvaliacoes);
    }
    public void lerDadosMusica(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o titulo:");
        titulo = ler.nextLine();
        System.out.println("Informe o artista:");
        artista = ler.nextLine();
        System.out.println("Ano de Lançamento:");
        anoLancamento = ler.nextInt();
        System.out.println("Avaliação:");
        avaliacao = ler.nextDouble();
        //TRuque de Mestre =D atualizar a media sempre
        //chama o metodo atualizaMedia e passa o valor avaliacao
        atualizaMedia(avaliacao);
    }
    public void atualizaMedia(double avaliacao){
        numAvaliacoes++; //quantidade de avaliações
        somatorioAvaliacoes = somatorioAvaliacoes + avaliacao;
        mediaAvaliacoes = somatorioAvaliacoes / numAvaliacoes;
    }
}
