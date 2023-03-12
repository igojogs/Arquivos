import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal.getNome() + " (" + animal.getEspecie() + ") - " + animal.getIdade() + " anos");
        }
    }

    public void alimentarAnimais() {
        for (Animal animal : animais) {
            if (!animal.isAlimentado()) {
                animal.alimentar();
                System.out.println(animal.getNome() + " foi alimentado.");
            } else {
                System.out.println(animal.getNome() + " já foi alimentado.");
            }
        }
    }
}
