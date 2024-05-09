package Polimorfismo.aula08e09;

public class Peixe extends Animal{
    private String corDeEscama;

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    @Override
    public void locomover() {
        System.out.println("Nadar");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public String getCorDeEscama() {
        return corDeEscama;
    }
    public void setCorDeEscama(String corDeEscama) {
        this.corDeEscama = corDeEscama;
    }
}
