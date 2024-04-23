package Encapsulamento.aula01;

public class Caneta {
    private String cor;
    private String modelo;
    private float ponta;
    private boolean tampada;

    public Caneta(String cor, String modelo, float ponta) {
        setCor(cor);
        setPonta(ponta);
        setModelo(modelo);

        tampar();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void escrever() {
        if (tampada) {
            System.out.println("Caneta tampada\n-----\n");
        } else {
            System.out.println("Escrevendo...\n-----\n");
        }
    }


    public void status() {
        System.out.println(" -- Status da Caneta --");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Está tampada?: " + this.tampada);
    }
}
