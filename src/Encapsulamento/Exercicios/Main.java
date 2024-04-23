package Encapsulamento.Exercicios;

public class Main {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Jonas", 19, "Masculino");
        p[1] = new Pessoa("Chiriro",7,"Feminino");

        l[0] = new Livro("Maquiavel","Maquialico", 500, p[0]);
        l[1] = new Livro("Java","Notch", 240, p[1]);
        l[2] = new Livro("Biblie","Deus", 1000, p[0]);


        l[1].folhear(240);






    }
}
