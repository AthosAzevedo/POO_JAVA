package Polimorfismo.aula08e09;

public class Reptil extends Animal{
    private String corDeEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    public String getCorDeEscama() {
        return corDeEscama;
    }
    public void setCorDeEscama(String corDeEscama) {
        this.corDeEscama = corDeEscama;
    }
}
