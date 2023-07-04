package Classes;

import java.util.List;

import ClassesAux.Adicionar;
import ClassesAux.Data;
import ClassesAux.Remove;
import ClassesAux.carrega;

public class ExemploCarregaAdiciona {
    public static void main(String[] args) {
        String arquivoEmpregado = "C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Empregados.txt";
    String arquivoEstagiario = "C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Estagiarios.txt";

        // Criando objetos de exemplo
        Empregado empregado = new Empregado("Fulano", "senha123", 28, "11111111", "12345678901",
                "fulano@gmail.com", new Data(12, 6, 1995), new Data(1, 1, 2022), "Analista", 2);
        Estagiario estagiario = new Estagiario("Beltrano", "senha456", 22, "22222222", "98765432109",
                "beltrano@gmail.com", new Data(3, 4, 2001), new Data(1, 1, 2023), "Estagiário", 1, 3);
       
                 Empregado empregado1 = new Empregado("maykon", "senha123", 28, "11111111", "12345678901",
                "fulano@gmail.com", new Data(12, 6, 1995), new Data(1, 1, 2022), "Analista", 2);

                Empregado empregado2 = new Empregado("Bia", "senha123", 28, "11111111", "12345678901",
                "fulano@gmail.com", new Data(12, 6, 1995), new Data(1, 1, 2022), "Analista", 2);
        // Adicionando objetos ao arquivo
        Adicionar.adicionarEmpregado(empregado2, arquivoEmpregado);

        boolean adicionouEmpregado = Adicionar.adicionarEmpregado(empregado, arquivoEmpregado);

        Adicionar.adicionarEmpregado(empregado1, arquivoEmpregado);
        
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
        for (Empregado est : empregados) {
             System.out.println(est.getNome() + " - cargo: " + est.getCargo()+ "- CPF: "+ est.getCPF() + " - telefone: " + est.getTelefone()
            +" - idade: " + est.getIdade()+ "- DataAdimicao: "+ est.getDataAdmissao().getDia()+":" + est.getDataAdmissao().getMes()+":" +
            est.getDataAdmissao().getAno()+":" + "- DataNascimento: "+ est.getDataNascimento().getDia()+":" + est.getDataNascimento().getMes()+":" +
            est.getDataNascimento().getAno() );
        }

        System.out.println("Estagiários:");
        for (Estagiario est : estagiarios) {
            System.out.println(est.getNome() + " - cargo: " + est.getCargo()+ "- CPF: "+ est.getCPF() + " - telefone: " + est.getTelefone()
            +" - idade: " + est.getIdade()+ "- DataAdimicao: "+ est.getDataAdmissao().getDia()+":" + est.getDataAdmissao().getMes()+":" +
            est.getDataAdmissao().getAno()+":" + "- DataNascimento: "+ est.getDataNascimento().getDia()+":" + est.getDataNascimento().getMes()+":" +
            est.getDataNascimento().getAno() );
        }
    
 
        boolean removido = Remove.removerEmpregado(empregado.getCodigo(),arquivoEmpregado);
        if (removido) {
            System.out.println("Empregado removido com sucesso!");
        } else {
            System.out.println("Nenhum empregado encontrado com a chave especificada.");
        }

    }
}
