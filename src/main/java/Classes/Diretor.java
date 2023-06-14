package Classes;


import ClassesAux.Data;

public class Diretor extends Funcionario {
    private String setor;
    private double salarioBaseDiretor;

    public Diretor(String nome, int idade, String telefone, String email, String cpf, Data dataN, Data dataAdmissao, String cargo, String setor) {
        super(nome, idade, telefone, email, cpf, dataN, dataAdmissao, cargo);
        this.setor = setor;
        this.salarioBaseDiretor = super.getSalarioBase() * 4.0; // o salario vai ser 4 vezes o salario base

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalarioBaseDiretor() {
        return salarioBaseDiretor;
    }

    public void setSalarioBaseDiretor(double salarioBaseDiretor) {
        this.salarioBaseDiretor = salarioBaseDiretor;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioBruto = salarioBaseDiretor;
        double salarioLiquido = salarioBruto - (salarioBruto * 0.1) - (salarioBruto * 0.05);
        return salarioLiquido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSetor: " + setor + "\nSalário Base Diretor: " + salarioBaseDiretor;
    }
}
