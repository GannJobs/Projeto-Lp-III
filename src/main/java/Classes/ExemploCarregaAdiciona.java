package Classes;

import java.util.List;


import ClassesAux.Arquivo;
import ClassesAux.Data;


public class ExemploCarregaAdiciona {
    public static void main(String[] args) {
        String arquivoEmpregado = "C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Empregados.txt";
     String arquivoEstagiario = "C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Estagiarios.txt";
        Empregado empregado1 = new Empregado("maykon", "senha123", 28, "11111111", "12345678901",
                "fulano@gmail.com", new Data(12, 6, 1995), new Data(1, 1, 2022), "Analista", 2);


        // Criando objetos de exemplo
        Empregado empregado = new Empregado("Fulano", "senha123", 28, "11111111", "12345678901",
                "fulano@gmail.com", new Data(12, 6, 1995), new Data(1, 1, 2022), "Analista", 2);
        Estagiario estagiario = new Estagiario("Beltrano", "senha456", 22, "22222222", "98765432109",
                "beltrano@gmail.com", new Data(3, 4, 2001), new Data(1, 1, 2023), "Estagiário", 1, 3);
       
              
                Empregado empregado2 = new Empregado("Bia", "senha123", 28, "11111111", "12345678901",
                "fulano@gmail.com", new Data(12, 6, 1995), new Data(1, 1, 2022), "Analista", 2);
        // Adicionando objetos ao arquivo
        Arquivo.adicionarEmpregado(empregado2, arquivoEmpregado);

        boolean adicionouEmpregado = Arquivo.adicionarEmpregado(empregado, arquivoEmpregado);

        Arquivo.adicionarEmpregado(empregado1, arquivoEmpregado);
        
        boolean adicionouEstagiario = Arquivo.adicionarEstagiario(estagiario, arquivoEstagiario);
        

        // Verificando se a adição foi bem-sucedida
        if (adicionouEmpregado && adicionouEstagiario) {
            System.out.println("Os objetos foram adicionados com sucesso ao arquivo.");
        } else {
            System.out.println("Ocorreu um erro ao adicionar os objetos ao arquivo.");
        }

        // Carregando objetos do arquivo
        List<Empregado> empregados = Arquivo.carregaEmpregado(arquivoEmpregado);
        List<Estagiario> estagiarios = Arquivo.carregaEstagiario(arquivoEstagiario);

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
    
 
        boolean removido = Arquivo.removerEmpregado(empregado1.getCodigo(),arquivoEmpregado);
        if (removido) {
            System.out.println("Empregado removido com sucesso!");
        } else {
            System.out.println("Nenhum empregado encontrado com a chave especificada."+ "chave: "+empregado1.getCodigo());
        }

    }
}
