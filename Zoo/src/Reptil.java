public class Reptil extends Animal implements Alimentavel {
    private double temperaturaCorporal;

    public Reptil(String nome, int idade, String especie, double temperaturaCorporal) {
        super(nome, idade, especie);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }

    @Override
    public void alimentar() {
        setAlimentado(true);
        System.out.println(getNome() + " foi alimentado!");
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }
}
