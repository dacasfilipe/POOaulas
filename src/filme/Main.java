package filme;

public class Main {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.lerDados();

        System.out.println("\n");

        System.out.println("*** Dados do filme.Filme ***");

        meuFilme.imprimirDados();


    }
}