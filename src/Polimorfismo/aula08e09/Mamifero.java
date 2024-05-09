package Polimorfismo.aula08e09;

public class Mamifero extends Animal {
    protected String corDePelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamamndo");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");

    }


}
