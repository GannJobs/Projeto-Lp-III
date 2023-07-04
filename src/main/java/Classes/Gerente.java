package Classes;


import ClassesAux.Data;
import java.util.List;

public class Gerente extends Funcionario{

    private int departamento;
    private double salario = 2500.00;
    private final double salarioBase = salario;

    public Gerente(String nome, String senha, int i, String telefone, String email, String cpf, Data dataAdmissao, Data data, String cargo, int departamento) {
        super(nome, senha, i, telefone,email, cpf, dataAdmissao, data, cargo);
        this.departamento = departamento;
    }
    
    public Gerente(Gerente gerente, Departamento dep){
        super(gerente.getNome(), gerente.getSenha(), gerente.getIdade(), gerente.getTelefone(),gerente.getEmail(), gerente.getCPF(), Data.getDataAtual(), gerente.getDataN(), gerente.getCargo());
        this.departamento = dep.getCodigo();
    }
    
    public Gerente(Gerente gerente){
        super(gerente.getNome(), gerente.getSenha(), gerente.getIdade(), gerente.getTelefone(),gerente.getEmail(), gerente.getCPF(), gerente.getDataAdmissao(), gerente.getDataN(), gerente.getCargo());
        this.departamento =  gerente.getDepartamento();
    }
    
    public static  Gerente buscarNome(List<Gerente> listaGerentes, String nome) {
        for (Gerente gerente : listaGerentes) {
            if (gerente.getNome().equals(nome)) {
                return gerente; // Retorna o gerente encontrado
            }
        }
    return null;
    }
    
    public static  Gerente buscarCod(List<Gerente> listaGerentes, int cod) {
        for (Gerente gerente : listaGerentes) {
            if (gerente.getCodigo()== cod) {
                return gerente; // Retorna o gerente encontrado
            }
        }
    return null;
    }
    
    public int getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(int nDep){
        this.departamento = nDep;
    }
    
    public double getSalario(){
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento + "\nSalário Gerente: " + salario;
    }
}
