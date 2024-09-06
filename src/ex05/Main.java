package ex05;

public class Main {

    public static void main(String[] args) {

        Aluno novoAluno = new Aluno();
        novoAluno.nome = "Guilherme";
        novoAluno.idade = 16;
        novoAluno.exibirInformacoes();
        novoAluno.informeAnoNascimento();
    }
}
