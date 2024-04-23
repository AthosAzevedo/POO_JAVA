package Encapsulamento.aula03;

public class Main {
    public static void main(String[] args) {
         ControleRemoto c = new ControleRemoto(50,false,false);

         c.ligar();
         c.play();
         c.maisVolume();
         c.maisVolume();
         c.ligarMudo();
         c.abrirMenu();
         c.fecharMenu();


    }
}
