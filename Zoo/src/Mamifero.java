public class Mamifero extends Animal implements Alimentavel {
    private int tempoGestacao;

    public Mamifero(String nome, int idade, String especie, int tempoGestacao) {
        super(nome, idade, especie);
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero está emitindo um som característico...");
    }

    @Override
    public void alimentar() {
        setAlimentado(true);
        System.out.println("O mamífero foi alimentado.");
    }
}
