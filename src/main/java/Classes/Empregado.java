package Classes;

import ClassesAux.Data;
import java.util.List;

public class Empregado extends Funcionario implements Pagamento{
    private String funcao = "Dar entrada nos produtos.";
    private double salario = 2000.00;
    private final double salarioBase = salario;
    private int departamento;

    public Empregado(String nome, String senha, int i, String telefone, String email, String cpf, Data dataAdmissao, Data dataN, String cargo, int departamento) {
        super( nome, senha, i, telefone,email, cpf, dataAdmissao, dataN, cargo);
        this.departamento = departamento;
    }
    
    public Empregado(Empregado empregado){
        super(empregado.getNome(), empregado.getSenha(), empregado.getIdade(),empregado.getTelefone(),empregado.getEmail(),empregado.getCPF(),empregado.getDataAdmissao(),empregado.getDataNascimento(), empregado.getCargo());
        this.departamento = empregado.getDepartamento();
    }
    
    public static Empregado buscarDepartamentoPorCodigo(List<Empregado> listaEmpregados, int codigoBusca) {
        for (Empregado empregado : listaEmpregados) {
            if (empregado.getCodigo() == codigoBusca) {
                return empregado; // Retorna o Empregado encontrado
            }
        }
    return null;
    }
    
    public static Empregado buscarNome(List<Empregado> listaEmpregados, String nome) {
        for (Empregado empregado : listaEmpregados) {
            if (empregado.getNome() == nome) {
                return empregado; // Retorna o empregado encontrado
            }
        }
    return null;
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
