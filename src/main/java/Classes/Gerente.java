package Classes;


import ClassesAux.Data;



public class Gerente extends Funcionario {

    private String departamento;
    private final float salarioBaseGerente;

/*    public Gerente(String nome, String email, int idade, String cpf, Data dataN, Data dataAdmissao, String cargo, String departamento) {
        super(nome, email, idade, cpf, dataN, dataAdmissao, cargo);
        this.departamento = departamento;
        this.salarioBaseGerente = super.getSalarioBase() * 2.0f; // Salário base do gerente é 200% maior que o do funcionário
    }
*/
    public Gerente(String nome, int idade, String telefone, String cpf, Data dataN, Data dataAdmissao, String cargo, String departamento) {
        super(nome, idade, telefone, cpf, dataN, dataAdmissao, cargo);
        this.departamento = departamento;
        this.salarioBaseGerente = super.getSalarioBase() * 2.0f; // Salário base do gerente é 200% maior que o do funcionário
    }

    public Gerente(String nome, int idade, String telefone, String email, String cpf, Data dataN, Data dataAdmissao, String cargo, String departamento) {
        super(nome, idade, telefone, email, cpf, dataN, dataAdmissao, cargo);
        this.departamento = departamento;
        this.salarioBaseGerente = super.getSalarioBase() * 2.0f; // Salário base do gerente é 200% maior que o do funcionário
    }

    public void realizarPlanejamento() {
        System.out.println("Realizando o planejamento do departamento: " + departamento);
    }

    public void gerenciarEquipe() {
        System.out.println("Gerenciando a equipe do departamento: " + departamento);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento + "\nSalário Base Gerente: " + salarioBaseGerente;
    }
}
