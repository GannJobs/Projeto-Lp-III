package Classes;

import java.util.List;

import ClassesAux.Data;

public class ExemploCarregaAdiciona {
    public static void main(String[] args) {
        String arquivoEmpregado = "C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Empregados.txt";
        String arquivoEstagiario = "C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Estagiarios.txt";

        // Criando objetos de exemplo
        Empregado empregado = new Empregado("Fulano", "senha123", 28, "11111111", "12345678901",
                "fulano@gmail.com", new Data(12, 6, 1995), new Data(1, 1, 2022), "Analista", 2);
        Estagiario estagiario = new Estagiario("Beltrano", "senha456", 22, "22222222", "98765432109",
                "beltrano@gmail.com", new Data(3, 4, 2001), new Data(1, 1, 2023), "Estagiário", 1, 3);

        // Adicionando objetos ao arquivo
        boolean adicionouEmpregado = Adicionar.adicionarEmpregado(empregado, arquivoEmpregado);
        boolean adicionouEstagiario = Adicionar.adicionarEstagiario(estagiario, arquivoEstagiario);

        // Verificando se a adição foi bem-sucedida
        if (adicionouEmpregado && adicionouEstagiario) {
            System.out.println("Os objetos foram adicionados com sucesso ao arquivo.");
        } else {
            System.out.println("Ocorreu um erro ao adicionar os objetos ao arquivo.");
        }

        // Carregando objetos do arquivo
        List<Empregado> empregados = carrega.carregaEmpregado(arquivoEmpregado);
        List<Estagiario> estagiarios = carrega.carregaEstagiario(arquivoEstagiario);

        // Exibindo os objetos carregados
        System.out.println("Empregados:");
        for (Empregado e : empregados) {
            System.out.println(e.getNome() + " - " + e.getCargo());
        }

        System.out.println("Estagiários:");
        for (Estagiario est : estagiarios) {
            System.out.println(est.getNome() + " - " + est.getCargo());
        }
    }
}
