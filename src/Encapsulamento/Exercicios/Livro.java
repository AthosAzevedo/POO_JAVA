package Encapsulamento.Exercicios;

import java.util.Scanner;

public class Livro implements Publicacao {
    Scanner scan = new Scanner(System.in);
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    private String lineLivro = "======================Livro===============================";

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setLeitor(leitor);

    }


    public void detalhes() {
        System.out.println("==== Detalhes do livro ====");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        if (this.isAberto()) {
            System.out.println(this.getLeitor().getNome() + " Está lendo");
            System.out.println("Livro aberto");
            System.out.println("Total de paginas: " + this.getTotPaginas());
            System.out.println("\n              Pagina: " + this.getPagAtual());
        } else {
            System.out.println("Livro fechado");
        }
        System.out.println("===========================");
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
        if ((this.pagAtual > 0) && this.pagAtual <= getTotPaginas()) {
            this.pagAtual = pagAtual;
        } else {
            this.pagAtual = 0;
            System.out.println("Numero incopativel com quantidade total de paginas");
        }
    }

    public boolean isAberto() {
        return aberto;

    }

    public void setAberto(boolean aberto) {

        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        System.out.println(lineLivro);
        System.out.println("blablalba\n  blablabla\nblblablabla");
        System.out.println("       p: " + this.getPagAtual());
        System.out.println(lineLivro);
        setAberto(true);
        System.out.println("Leitura - (1) Detalhes - (2) Fechar Livro - (3)");
        int ver = scan.nextInt();
        switch (ver) {
            case 1:
                leitura();
                break;
            case 2:
                detalhes();
                break;
            case 3:
                fechar();
                break;
        }
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void leitura() {
        System.out.println("Proxima Pagina - (1) Voltar Pagina - (2) Fechar Livro - (3)\n" + lineLivro);
        int l = scan.nextInt();
        switch (l) {
            case 1:
                avancarPag();
                break;
            case 2:
                voltarPag();
                break;
            case 3:
                fechar();
                break;
            default:
                System.out.println("error");
        }


    }

    @Override
    public void folhear(int p) {
        if ((p <= this.getTotPaginas()) && (p > 0)) {
            this.setPagAtual(this.getPagAtual() + p);
            this.abrir();
        }
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() < this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
            abrir();
        } else {
            System.out.println("Livro Finalizado");
            this.setPagAtual(this.getPagAtual());
            abrir();
        }
    }

    @Override
    public void voltarPag() {
        if ((this.getPagAtual() <= this.getPagAtual()) && this.getPagAtual() >= 1) {
            this.setPagAtual(this.getPagAtual() - 1);
            abrir();
        }
    }


}


