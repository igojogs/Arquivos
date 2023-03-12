public class Ave extends Animal implements Alimentavel {
    private String tipoBico;

    public Ave(String nome, int idade, String especie, String tipoBico) {
        super(nome, idade, especie);
        this.tipoBico = tipoBico;
    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave está emitindo um som característico...");
    }

    @Override
    public void alimentar() {
        setAlimentado(true);
        System.out.println("A ave foi alimentada.");
    }
}
