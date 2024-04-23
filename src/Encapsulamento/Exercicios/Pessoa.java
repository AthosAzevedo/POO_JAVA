package Encapsulamento.Exercicios;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerNiver(){
        this.setIdade(this.getIdade()+1);
        System.out.println("==== "+getNome()+" Fez aniversario"+" ====");
        System.out.println("Parabêns "+ this.getNome()+" pelo seus "+this.getIdade()+" anos de idade,s Que Deus lhe abençoe");
    }
    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);

    }
    public void pessoaDetalhes(){
        System.out.println("===="+"Detalhes de "+this.getNome()+"====");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Sexo: "+ this.getSexo());
        System.out.println("============================");
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
