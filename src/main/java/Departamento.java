import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String codigo;
    private Gerente gerenteResponsavel;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome, String codigo, Gerente gerenteResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.gerenteResponsavel = gerenteResponsavel;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Gerente getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(Gerente gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public ArrayList<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public double calcularMediaSalarial() {
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalarioBase();
        }
        if (!funcionarios.isEmpty()) {
            return totalSalarios / funcionarios.size();
        } else {
            return 0;
        }
    }

    //vai receber o funcionario que vai receber o aumento
    //e qual vai ser a porcentagem de aumento a ser recebido
    public void darAumento(Funcionario funcionario, double aumentoPercentual) {
        double salarioAtual = funcionario.getSalarioBase();
        double aumentoValor = salarioAtual * (aumentoPercentual / 100);
        double novoSalario = salarioAtual + aumentoValor;
        
        funcionario.setSalarioBase((float)novoSalario);
        System.out.println("Aumento aplicado para o funcionário " + funcionario.getNome());
        System.out.println("Salário anterior: R$" + salarioAtual);
        System.out.println("Novo salário: R$" + novoSalario);
    }

}
