
package Classes;

import ClassesAux.Data;

public class Estagiario extends Funcionario {

    private int duracaoEstagio;
    private String departamento;

   /*  public Estagiario(String nome, String email, int idade, String cpf, Data dataN, Data dataAdmissao, String cargo, int duracaoEstagio, String departamento) {
        super(nome, email, idade, cpf, dataN, dataAdmissao, cargo);
        this.duracaoEstagio = duracaoEstagio;
        this.departamento = departamento;
    }
*/
    public Estagiario(String nome, int idade, String telefone, String cpf, Data dataN, Data dataAdmissao, String cargo, int duracaoEstagio, String departamento) {
        super(nome, idade, telefone, cpf, dataN, dataAdmissao, cargo);
        this.duracaoEstagio = duracaoEstagio;
        this.departamento = departamento;
    }

    public Estagiario(String nome, int idade, String telefone, String email, String cpf, Data dataN, Data dataAdmissao, String cargo, int duracaoEstagio, String departamento) {
        super(nome, idade, telefone, email, cpf, dataN, dataAdmissao, cargo);
        this.duracaoEstagio = duracaoEstagio;
        this.departamento = departamento;
    }

      public int getIdade() {
        return super.idade;
    }

    public String getTelefone() {
        return super.telefone;
    }

     public String getEmail() {
        return super.email;
    }

     public String getCPF() {
        return super.cpf;
    }

    public int getDuracaoEstagio() {
        return duracaoEstagio;
    }

    public void setDuracaoEstagio(int duracaoEstagio) {
        this.duracaoEstagio = duracaoEstagio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioBruto = super.getSalarioBase() / 2.0; // Metade do salário base
        double salarioLiquido = salarioBruto - (salarioBruto * 0.1) - (salarioBruto * 0.05);
        return salarioLiquido;
    }

    @Override
    public void calculoSalarial(int horas) {
        if (horas > 80) {
            // A cada hora extra trabalhada, o estagiário recebe 1% a mais do salário
            System.out.println("O salário fica em R$" + ((super.getSalarioBase() / 1.6) + (super.getSalarioBase() / 1.6) * ((horas - 160) * 0.01)));
        } else if (horas < 80) {
            System.out.println("O salário fica em R$" + (super.getSalarioBase() / 1.6) * 0.8);
        } else {
            System.out.println("O salário fica em R$" + (super.getSalarioBase() / 1.6));
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuração do Estágio: " + duracaoEstagio + " meses" + "\nDepartamento: " + departamento;
    }
    @Override
    public float getSalarioBase() {
         //  O SALARIO DO ESTAGIARIO É DE 750 REAIS 
        return super.getSalarioBase() / 1.6f; // Half of the base salary
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }
}
