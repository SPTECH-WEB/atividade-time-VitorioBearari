package school.sptech;

public class Time {
    String nome;
    Integer vitorias, empates, derrotas;

    public Time(){
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }

    public void registrarVitoria(){
        vitorias += 1;
    }

    public void registrarEmpate(){
        empates += 1;
    }

    public void registrarDerrota(){
        derrotas += 1;
    }

    public Integer getPontos(){
        return (vitorias*3) + empates;
    }

    public Integer getTotalPartidas(){
        int totalPartidas = vitorias + empates + derrotas;
        return totalPartidas;
    }

    public Integer getAproveitamento(){
        Integer aproveitamento = (vitorias*100 / getTotalPartidas());
        return aproveitamento;
    }

    public void compararAproveitamento(Time adversario){
        if(getAproveitamento() > adversario.getAproveitamento()){
            System.out.println("Time " +nome+ " tem um aproveitamento maior que o time "+adversario.nome+".");
        } else {
            System.out.println("Time " +adversario.nome+ " tem um aproveitamento maior que o time "+nome+".");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+nome+"\nNúmero de vitórias: "+vitorias+"\nNúmero de Empates: "+empates+"\nNúmero de Derrotas: "+derrotas+"\nTotal de partidas: "+(vitorias+empates+derrotas)+"\nAproveitamento: "+getAproveitamento());
    }
}
