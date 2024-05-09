package Polimorfismo.aula08e09;

public class Ave extends Animal{
    private String corDePena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void fazerNinho(){
        System.out.println("Construiu ninho");
    }

    public String getCorDePena() {
        return corDePena;
    }
    public void setCorDePena(String corDePena) {
        this.corDePena = corDePena;
    }
}
