package Encapsulamento.aula01;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Preta", "BIC", 0.5f);

        c1.status();
        c1.escrever();

        Caneta c2 = new Caneta("Vermelha", "BIC", 0.8f);

        c2.status();
        c2.escrever();

    }
}