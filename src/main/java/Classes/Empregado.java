package Classes;

import ClassesAux.Data;

public class Empregado extends Funcionario implements Pagamento{
    private String funcao = "Dar entrada nos produtos.";
    private double salario = 2000.00;
    private final double salarioBase = salario;
    private int departamento;

    public Empregado(String nome, String senha, int i, String string, String cpf, String string2, Data dataAdmissao, Data data, String cargo, int departamento) {
        super( nome, senha, i, string,cpf, string2, dataAdmissao, data, cargo);
        this.departamento = departamento;
    }
    
    @Override
    public boolean Aumento(double valor){
        if(valor > (salarioBase + salarioBase*0.3)){
            return false;
        }else if(valor < (salarioBase + salarioBase*0.3) && valor > salarioBase){
            this.salario = valor;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean Desconto(double valor){
        if(valor < (salarioBase - salarioBase*0.3)){
            return false;
        }else if(valor < salarioBase && valor > (salarioBase - salarioBase*0.3)){
            this.salario = valor;
            return true;
        } 
        return false;
    }
    
    public String getFuncao(){
        return funcao;
    }
    
    public void setFuncao(String nFuncao){
        this.funcao = nFuncao;
    }

    public int getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(int nDep){
        this.departamento = nDep;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFunção: " + funcao + "\nDepartamento: " + departamento + "\nSalario: " + salario;
    }
    
    public double getSalario(){
        return salario;
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
        return super.dataNascimento;
    }
    @Override
    public String getCargo() {
        return super.getCargo();
    }
    //data nascimento
    public String getData() {
        return super.getdata();
    }
}
