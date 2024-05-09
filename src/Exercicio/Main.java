package Exercicio;

public class Main {
    public static void main(String[] args) {
        Video vi[] = new Video[3];
        vi[0] = new Video("Michael Jackson - Billie Jean");
        vi[1] = new Video("Elvis Presley - Fever");
        vi[2] = new Video("Justin Bieber - Company");

        Subscribed s[] = new Subscribed[2];
        s[0]= new Subscribed("Athos Azevedo",24,"M","Athos");

        View vw[] = new View[3];
        vw[0] = new View(s[0], vi[0]);
        vw[0].rate(100f);
        System.out.println(vw[0].toString());

        vw[1] = new View(s[0],vi[2]);
        vw[1].rate();
        System.out.println(vw[1].toString());
    }
}
