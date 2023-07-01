package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ClassesAux.Data;

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

    public void carregaEmpregado(String arquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0].trim();
                int idade = Integer.parseInt(dados[1].trim());
                String telefone = dados[2].trim();
                String cpf = dados[3].trim();
                String email = dados[4].trim();
                Data dataNascimento = parseData(dados[5].trim());
                Data dataAdmissao = parseData(dados[6].trim());
                String cargo = dados[7].trim();
                String departamento = dados[8].trim();

                Empregado empregado = new Empregado(nome, idade, telefone, email, cpf, dataNascimento, dataAdmissao, cargo, departamento);
                adicionarEmpregado(empregado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregaEstagiario(String arquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0].trim();
                int idade = Integer.parseInt(dados[1].trim());
                String telefone = dados[2].trim();
                String cpf = dados[3].trim();
                String email = dados[4].trim();
                Data dataNascimento = parseData(dados[5].trim());
                Data dataAdmissao = parseData(dados[6].trim());
                String cargo = dados[7].trim();
                int duracao = Integer.parseInt(dados[8].trim());
                String departamento = dados[9].trim();

                Estagiario estagiario = new Estagiario(nome, idade, telefone, email, cpf, dataNascimento, dataAdmissao, cargo, duracao, departamento);
                adicionarEstagiario(estagiario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Data parseData(String dataStr) {
        String[] partes = dataStr.split(":");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        return new Data(dia, mes, ano);
    }

    public String toEstringEmpregado(Empregado empregado) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: ").append(empregado.getNome()).append("\n");
        stringBuilder.append("Idade: ").append(empregado.getIdade()).append("\n");
        stringBuilder.append("Telefone: ").append(empregado.getTelefone()).append("\n");
        stringBuilder.append("Email: ").append(empregado.getEmail()).append("\n");
        stringBuilder.append("CPF: ").append(empregado.getCPF()).append("\n");
        stringBuilder.append("Data de Nascimento: ").append(empregado.getDataNascimento()).append("\n");
        stringBuilder.append("Data de Admissão: ").append(empregado.getDataAdmissao()).append("\n");
        stringBuilder.append("Cargo: ").append(empregado.getCargo()).append("\n");
        stringBuilder.append("Departamento: ").append(empregado.getDepartamento()).append("\n");

        return stringBuilder.toString();
    }

    public String toEstringEstagiario(Estagiario estagiario) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: ").append(estagiario.getNome()).append("\n");
        stringBuilder.append("Idade: ").append(estagiario.getIdade()).append("\n");
        stringBuilder.append("Telefone: ").append(estagiario.getTelefone()).append("\n");
        stringBuilder.append("Email: ").append(estagiario.getEmail()).append("\n");
        stringBuilder.append("CPF: ").append(estagiario.getCPF()).append("\n");
        stringBuilder.append("Data de Nascimento: ").append(estagiario.getDataNascimento()).append("\n");
        stringBuilder.append("Data de Admissão: ").append(estagiario.getDataAdmissao()).append("\n");
        stringBuilder.append("Cargo: ").append(estagiario.getCargo()).append("\n");
        stringBuilder.append("Tempo de Estagio: ").append(estagiario.getDuracaoEstagio()).append("\n");
        stringBuilder.append("Departamento: ").append(estagiario.getDepartamento()).append("\n");

        return stringBuilder.toString();
    }
}
