package Classes;

import ClassesAux.Data;

public class Empregado extends Funcionario {
    private String funcao;
    private String departamento;

    public Empregado(String nome, int i, String string, String cpf, String string2, Data dataAdmissao, Data data, String funcao, String departamento) {
        super(nome, i, string, cpf, string2, dataAdmissao, data);
        this.funcao = funcao;
        this.departamento = departamento;
    }

    public Empregado(String nome, int idade, String telefone, String cpf, Data dataN, Data dataAdmissao, String cargo, String funcao, String departamento) {
        super(nome, idade, telefone, cpf, dataN, dataAdmissao, cargo);
        this.funcao = funcao;
        this.departamento = departamento;
    }

    public Empregado(String nome, int idade, String telefone, String email, String cpf, Data dataN, Data dataAdmissao, String cargo, String funcao, String departamento) {
        super(nome, idade, telefone, email, cpf, dataN, dataAdmissao, cargo);
        this.funcao = funcao;
        this.departamento = departamento;
    }

    public void realizarFuncao() {
        System.out.println("Realizando a função: " + funcao);
    }

    public void realizarTarefaAdicional() {
        System.out.println("Realizando tarefa adicional como empregado.");
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFunção: " + funcao + "\nDepartamento: " + departamento;
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

    public Data getDataNascimento() {
        return dataNascimento;
    }

}
