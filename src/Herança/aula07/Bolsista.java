package Herança.aula07;

public class Bolsista extends Aluno{
    private float bolsa;

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de bolsista "+this.getNome());
    }

    public void renovarBolsa(){
        System.out.println("renovando bolsa");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
