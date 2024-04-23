package Encapsulamento.aula04;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private Float peso;
    private Float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){
        String apresentacao = "Seu país é "+getNacionalidade()+"\nDa categoria "+getCategoria()+", pesando "+getPeso()+" kg"+" Com "+ getIdade()+" anos de idade"+"\nPossuindo "+getVitorias()+" vtorias, "+getDerrotas()+" derrotas e "+ getEmpates()+" empates"+"\nSeu nome é "+getNome()+"!!!\n";
        System.out.println("--- Apresentação ---");
        System.out.println(apresentacao);
    }

    public void status(){
        System.out.println("--- Status do Lutador ---");
        System.out.println(getNome());
        System.out.println("É um "+ getCategoria());
        System.out.println(getVitorias()+" vitórias");
        System.out.println(getDerrotas()+" Derrotas");
        System.out.println(getEmpates()+" Empates");
    }

    public void ganharLuta(){

        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }



    public Lutador(String nome, String nacionalidade,int idade,
                   Float peso, Float altura, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
        setCategoria();
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso()< 52.2){
            this.categoria = "Inválido";
        }else if(getPeso() <= 70.3){
            this.categoria = "Peso Leve";
        }else if(getPeso()<=83.9){
            this.categoria = "Peso Medio";
        }else if (getPeso()<=120.2){
            this.categoria = "Peso Pesado";
        }else{
            this.categoria = "Inválido";
        }


    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}


