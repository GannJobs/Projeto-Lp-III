package Classes;


import ClassesAux.Data;

public class Diretor extends Funcionario {
   // private String setor;
    private double salarioBaseDiretor;

    public Diretor(String nome, int idade, String telefone, String email, String cpf, Data dataN, Data dataAdmissao, String cargo) {
        super(nome, idade, telefone, email, cpf, dataN, dataAdmissao, cargo);
       // this.setor = setor;
        this.salarioBaseDiretor = super.getSalarioBase() * 4.0; // o salario vai ser 4 vezes o salario base

    }

    public void promoverEstagiarioParaEmpregado(Estagiario estagiario, Departamento departamento) {
        Empregado empregadoPromovido = new Empregado(
            estagiario.getNome(),
            estagiario.getIdade(),
            estagiario.getTelefone(),
            estagiario.getEmail(),
            estagiario.getCPF(),
            estagiario.getDataNascimento(),
            estagiario.getDataAdmissao(),
            estagiario.getCargo(),
            estagiario.getDepartamento()
        );

        empregadoPromovido.setSalarioBase(estagiario.getSalarioBase() * 1.5f);

        departamento.removerEstagiario(estagiario);
        departamento.adicionarEmpregado(empregadoPromovido);

        System.out.println("Estagiário " + estagiario.getNome() + " promovido para o cargo de Empregado.");
        System.out.println("Novo salário base: " + empregadoPromovido.getSalarioBase());
    }

    public void promoverEmpregadoParaGerente(Empregado empregado, Departamento departamento) {
        Gerente gerentePromovido = new Gerente(
            empregado.getNome(),
            empregado.getIdade(),
            empregado.getTelefone(),
            empregado.getEmail(),
            empregado.getCPF(),
            empregado.getDataNascimento(),
            empregado.getDataAdmissao(),
            empregado.getCargo(),
            empregado.getDepartamento()
        );

        gerentePromovido.setSalarioBase(empregado.getSalarioBase() * 1.5f);

        departamento.removerEmpregado(empregado);
        departamento.setGerenteResponsavel(gerentePromovido);

        System.out.println("Empregado " + empregado.getNome() + " promovido para o cargo de Gerente.");
        System.out.println("Novo salário base: " + gerentePromovido.getSalarioBase());
    }

   /*  public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    */
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
        return super.toString() + "\nSalário Base Diretor: " + salarioBaseDiretor;
    }
}
