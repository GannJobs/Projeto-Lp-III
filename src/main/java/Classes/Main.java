package Classes;

import ClassesAux.Data;

public class Main {
    public static void main(String[] args) {
        // Criar um diretor
        Data data = new Data(01, 01, 1980);
        Data dataAdmicao = new Data(01, 01, 2023);
        Diretor diretor = new Diretor("John Doe", 40, "1234567890", "john.doe@example.com", "123456789", data, dataAdmicao, "Diretor");
         // Criar um gerente
          Data datagerente = new Data(15, 01, 1985);
        Data dataAdmicaogerente = new Data(01, 03, 2020);
        Gerente gerente01 = new Gerente("Maykon de Souza", 20, "89224002", "mssantos@gmai.com", "12345678", datagerente, dataAdmicaogerente,"Gerente", "Desenvolvimento");
        // Criar um departamento
        Departamento departamento = new Departamento("Desenvolvimento", "001", gerente01);

        // Criar um estagiário
        Data dataEstagiario = new Data(15, 07, 1995);
        Data dataAdmicaoEstagiario = new Data(8, 03, 2023);
        Estagiario estagiario = new Estagiario("Jane Smith", 25, "0987654321", "123456789" ,dataEstagiario, dataAdmicaoEstagiario, "Estagiario", 1, "Desenvolvimento");
        estagiario.setSalarioBase(1200.0f);

        // Adicionar o estagiário ao departamento
        departamento.adicionarEstagiario(estagiario);
//================================================================================================================
   // Criar um estagiário
        Data dataEstagiario1 = new Data(15, 07, 1989);
        Data dataAdmicaoEstagiario1 = new Data(8, 03, 2020);
        Estagiario estagiario1 = new Estagiario("Jane Smith", 25, "0987654321", "123456789" ,dataEstagiario1, dataAdmicaoEstagiario1, "Estagiario", 1, "Desenvolvimento");
        estagiario1.setSalarioBase(1200.0f);

        // Adicionar o estagiário ao departamento
        departamento.adicionarEstagiario(estagiario1);
        // Promover o estagiário para empregado
        diretor.promoverEstagiarioParaEmpregado(estagiario, departamento);
       //   diretor.promoverEstagiarioParaEmpregado(estagiario1, departamento);

        // Criar um empregado
        Data dataEmpregado = new Data(13, 12, 1985);
        Data dataAdmicaoEmpregado = new Data(2, 5, 2022);
        Empregado empregado = new Empregado("Bob Johnson", 35, "5678901234", "bob.johnson@example.com", "567890123", dataEmpregado, dataAdmicaoEmpregado, "Empregado", "Desenvolvimento");
        empregado.setSalarioBase(2000.0f);

        // Adicionar o empregado ao departamento
        departamento.adicionarEmpregado(empregado);

        // Promover o empregado para gerente
        diretor.promoverEmpregadoParaGerente(empregado, departamento);

        // Imprimir informações do departamento
        System.out.println("Departamento: " + departamento.getNome());
        System.out.println("Gerente: " + departamento.getGerenteResponsavel().getNome());
        System.out.println("Empregados: " + departamento.listarEmpregados().size());
        System.out.println("Estagiários: " + departamento.listarEstagiarios().size());
        System.out.println("Salário Médio dos Empregados: " + departamento.calcularMediaSalarialEmpregados());
        System.out.println("Salário Médio dos Estagiários: " + departamento.calcularMediaSalarialEstagiarios());

        // Criar uma empresa
        Empresa empresa = new Empresa("Empresa ABC", "Rua Principal, 123", departamento, diretor);

        // Adicionar um departamento à empresa
        empresa.adicionarDepartamento(departamento);
    }
}
