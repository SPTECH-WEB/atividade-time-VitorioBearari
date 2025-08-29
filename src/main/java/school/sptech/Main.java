package school.sptech;

public class Main {
    public static void main(String[] args) {
        Time corinthians = new Time();

        corinthians.registrarVitoria();
        corinthians.registrarVitoria();
        corinthians.registrarEmpate();
        corinthians.registrarEmpate();
        corinthians.registrarEmpate();
        corinthians.registrarEmpate();
        corinthians.registrarDerrota();

        System.out.println(corinthians.getPontos());
        System.out.println(corinthians.getTotalPartidas());
        System.out.println(corinthians.getAproveitamento());

    }
}