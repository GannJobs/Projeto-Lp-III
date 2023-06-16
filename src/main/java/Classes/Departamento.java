package Classes;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private String codigo;
    private Gerente gerenteResponsavel;
    private List<Empregado> empregados;
    private List<Estagiario> estagiarios;

    public Departamento(String nome, String codigo, Gerente gerenteResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.gerenteResponsavel = gerenteResponsavel;
        this.empregados = new ArrayList<>();
        this.estagiarios = new ArrayList<>();
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

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }

    public List<Estagiario> getEstagiarios() {
        return estagiarios;
    }

    public void setEstagiarios(List<Estagiario> estagiarios) {
        this.estagiarios = estagiarios;
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void removerEmpregado(Empregado empregado) {
        empregados.remove(empregado);
    }

    public void adicionarEstagiario(Estagiario estagiario) {
        estagiarios.add(estagiario);
    }

    public void removerEstagiario(Estagiario estagiario) {
        estagiarios.remove(estagiario);
    }

    public List<Empregado> listarEmpregados() {
        return empregados;
    }

    public List<Estagiario> listarEstagiarios() {
        return estagiarios;
    }

    public double calcularMediaSalarialEmpregados() {
        double totalSalarios = 0;
        for (Empregado empregado : empregados) {
            totalSalarios += empregado.getSalarioBase();
        }
        if (!empregados.isEmpty()) {
            return totalSalarios / empregados.size();
        } else {
            return 0;
        }
    }

    public double calcularMediaSalarialEstagiarios() {
        double totalSalarios = 0;
        for (Estagiario estagiario : estagiarios) {
            totalSalarios += estagiario.getSalarioBase();
        }
        if (!estagiarios.isEmpty()) {
            return totalSalarios / estagiarios.size();
        } else {
            return 0;
        }
    }

    public void promoverEstagiario(Estagiario estagiario) {
    Empregado empregadoPromovido = new Empregado(estagiario.getNome(), estagiario.getIdade(), estagiario.getTelefone(), estagiario.getEmail(), estagiario.getCPF(),
                estagiario.getDataNascimento(), estagiario.getDataAdmissao(), estagiario.getCargo(), estagiario.getDepartamento());

    // Define o salário base do empregado promovido
    empregadoPromovido.setSalarioBase(estagiario.getSalarioBase() * 1.5f);

    // Exibe informações sobre a promoção
    System.out.println("Estagiário " + estagiario.getNome() + " promovido para o cargo de Empregado.");
    System.out.println("Novo salário base: " + empregadoPromovido.getSalarioBase());

    // Remove o estagiário e adiciona o empregado promovido à equipe do gerente
    estagiarios.remove(estagiario);
    empregados.add(empregadoPromovido);
    }


    public void darAumentoEmpregado(Empregado empregado, double aumentoPercentual) {
        double salarioAtual = empregado.getSalarioBase();
        double aumentoValor = salarioAtual * (aumentoPercentual / 100);
        double novoSalario = salarioAtual + aumentoValor;
        
        empregado.setSalarioBase((float) novoSalario);
        System.out.println("Aumento aplicado para o empregado " + empregado.getNome());
        System.out.println("Salário anterior: R$" + salarioAtual);
        System.out.println("Novo salário: R$" + novoSalario);
    }
}
