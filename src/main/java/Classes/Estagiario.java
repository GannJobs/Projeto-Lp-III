
package Classes;

import ClassesAux.Data;

public class Estagiario extends Funcionario implements Pagamento {

    private int duracaoEstagio;
    private int departamento;
    private double salario = 700.00;
    private final double salarioBase = salario;
    private String funcao = "dar baixa na saida de produtos.";

    public Estagiario(String nome,String senha, String telefone, int idade, String cpf, Data dataN, Data dataAdmissao, String cargo, int duracaoEstagio, int departamento) {
        super(nome, senha,idade,telefone, cpf, dataN, dataAdmissao, cargo);
        this.duracaoEstagio = duracaoEstagio;
        this.departamento = departamento;
    }

    public Estagiario(String nome, String senha, int idade,String email, String telefone, String cpf, Data dataN, Data dataAdmissao, String cargo, int duracaoEstagio, int departamento) {
        super(nome, senha, idade, telefone,email, cpf, dataN, dataAdmissao, cargo);
        this.duracaoEstagio = duracaoEstagio;
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

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }
     
    public String getdatas(){
        return super.getData();
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuração do Estágio: " + duracaoEstagio + " meses" + "\nDepartamento: " + departamento
                + "\nFuncao: " + funcao + "\nSalario: " + salario;
    }

     public Data getDataNascimento() {
        return dataNascimento;
    }
    
}
