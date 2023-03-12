public class TesteZoologico {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        Mamifero elefante = new Mamifero("Dumbo", 10, "Elefante", 22);
        Ave pinguim = new Ave("Tux", 5, "Pinguim", "Longo");
        Reptil cobra = new Reptil("Kaa", 3, "Cobra", 30.5);

        zoo.adicionarAnimal(elefante);
        zoo.adicionarAnimal(pinguim);
        zoo.adicionarAnimal(cobra);

        zoo.listarAnimais();

        zoo.alimentarAnimais();

        zoo.listarAnimais();
    }
}
