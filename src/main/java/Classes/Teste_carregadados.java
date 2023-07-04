package Classes;

import java.util.List;

import ClassesAux.Data;

public class Teste_carregadados {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Departamento A", "123", new Gerente("João", 35, "123456789", "11111111111",
                new Data(10, 5, 1990), new Data(1, 1, 2022), "Gerente", "RH"));

        departamento.carregaEmpregado("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Empregados.txt");
        departamento.carregaEstagiario("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Estagiarios.txt");

        System.out.println("---- Lista de Empregados ----");
        List<Empregado> empregados = departamento.listarEmpregados();
        for (Empregado empregado : empregados) {
            System.out.println(departamento.toEstringEmpregado(empregado));
        }

        System.out.println("\n---- Lista de Estagiários ----");
        List<Estagiario> estagiarios = departamento.listarEstagiarios();
        for (Estagiario estagiario : estagiarios) {
            System.out.println(departamento.toEstringEstagiario(estagiario));
        }
    }
}
