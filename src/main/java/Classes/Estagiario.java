package Classes;


import ClassesAux.Data;

public class Estagiario extends Funcionario {
    //  O SALARIO DO ESTAGIARIO É DE 750 REAIS 
    private int duracaoEstagio;

    public Estagiario(String nome, String email, int idade, String cpf, Data dataN, Data dataAdmissao, String cargo, int duracaoEstagio) {
        super(nome, email, idade, cpf, dataN, dataAdmissao, cargo);
        this.duracaoEstagio = duracaoEstagio;
    }

    public Estagiario(String nome, int idade, String telefone, String cpf, Data dataN, Data dataAdmissao, String cargo, int duracaoEstagio) {
        super(nome, idade, telefone, cpf, dataN, dataAdmissao, cargo);
        this.duracaoEstagio = duracaoEstagio;
    }

    public Estagiario(String nome, int idade, String telefone, String email, String cpf, Data dataN, Data dataAdmissao, String cargo, int duracaoEstagio) {
        super(nome, idade, telefone, email, cpf, dataN, dataAdmissao, cargo);
        this.duracaoEstagio = duracaoEstagio;
    }

    public int getDuracaoEstagio() {
        return duracaoEstagio;
    }

    public void setDuracaoEstagio(int duracaoEstagio) {
        this.duracaoEstagio = duracaoEstagio;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioBruto = super.getSalarioBase() / 2.0; // Half of the base salary
        double salarioLiquido = salarioBruto - (salarioBruto * 0.1) - (salarioBruto * 0.05);
        return salarioLiquido;
    }

    @Override
    public void calculoSalarial(int horas) {
        //  O SALARIO DO ESTAGIARIO É DE 750 REAIS 
        if (horas > 80) {
            //a cada hora extra trabalhada vai receber 1% a mais do salario
            System.out.println("O salário fica em R$" + ((super.getSalarioBase()/1.6) + (super.getSalarioBase()/1.6) * ((horas - 160)*0.01)));
        } else if(horas < 80){
            System.out.println("O salário fica em R$" + (super.getSalarioBase()/1.6) * 0.8);
        }else{
            System.out.println("O salário fica em R$" + (super.getSalarioBase()/1.6));
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuração do Estágio: " + duracaoEstagio + " meses";
    }

    @Override
    public float getSalarioBase() {
         //  O SALARIO DO ESTAGIARIO É DE 750 REAIS 
        return super.getSalarioBase() / 1.6f; // Half of the base salary
    }
}
