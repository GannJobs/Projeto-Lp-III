package Classes;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String endereco;
    private Departamento departamentoPrincipal;
    private ArrayList<Departamento> departamentos;
    private Diretor diretor;

    public Empresa(String nome, String endereco, Departamento departamentoPrincipal, Diretor diretor) {
        this.nome = nome;
        this.endereco = endereco;
        this.diretor = diretor;
        this.departamentoPrincipal = departamentoPrincipal;
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void removerDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public ArrayList<Departamento> listarDepartamentos() {
        return departamentos;
    }

    public double calcularFolhaPagamento() {
        double folhaPagamento = 0;
        for (Departamento departamento : departamentos) {
            for (Funcionario funcionario : departamento.listarEmpregados()) {
                folhaPagamento += funcionario.getSalarioBase();
            }
        }
        return folhaPagamento;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
    // Getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    public Departamento getDepartamentoPrincipal() {
        return departamentoPrincipal;
    }

    public void setDepartamentoPrincipal(Departamento departamentoPrincipal) {
        this.departamentoPrincipal = departamentoPrincipal;
    }
}
