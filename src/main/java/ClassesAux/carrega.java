package ClassesAux;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Classes.Diretor;
import Classes.Empregado;
import Classes.Estagiario;
import Classes.Gerente;

public class carrega {
    private static List<Empregado> empregados;
    private static List<Estagiario> estagiarios;


    public static List<Empregado> carregaEmpregado(String arquivo) {
        empregados = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[1].trim();
                String senha = dados[2].trim();
                int idade = Integer.parseInt(dados[3].trim());
                String telefone = dados[4].trim();
                String cpf = dados[5].trim();
                String email = dados[6].trim();
                Data dataNascimento = parseData(dados[7].trim());
                Data dataAdmissao = parseData(dados[8].trim());
                String cargo = dados[9].trim();
                int departamento = Integer.parseInt(dados[10].trim());

                Empregado empregado = new Empregado(nome, senha, idade, telefone, cpf, email, dataNascimento , dataAdmissao, cargo, departamento);
                empregados.add(empregado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return empregados;
    }

     public static List<Estagiario> carregaEstagiario(String arquivo) {
        estagiarios = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[1].trim();
                String senha = dados[2].trim();
                int idade = Integer.parseInt(dados[3].trim());
                String telefone = dados[4].trim();
                String cpf = dados[5].trim();
                String email = dados[6].trim();
                Data dataNascimento = parseData(dados[7].trim());
                Data dataAdmissao = parseData(dados[8].trim());
                String cargo = dados[9].trim();
                int duracao = Integer.parseInt(dados[10].trim());
                int departamento = Integer.parseInt(dados[11].trim());

                Estagiario estagiario = new Estagiario(nome, senha, idade, email, telefone, cpf, dataNascimento, dataAdmissao, cargo, duracao, departamento);
                estagiarios.add(estagiario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return estagiarios;
    }

     private static Data parseData(String dataStr) {
        String[] partes = dataStr.split(":");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        return new Data(dia, mes, ano);
    }
    
    public static List<Gerente> carregaGerente(String arquivo) {
    List<Gerente> gerentes = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] dados = linha.split(",");
            String nome = dados[1].trim();
            String senha = dados[2].trim();
            int idade = Integer.parseInt(dados[3].trim());
            String telefone = dados[4].trim();
            String cpf = dados[5].trim();
            String email = dados[6].trim();
            Data dataNascimento = parseData(dados[7].trim());
            Data dataAdmissao = parseData(dados[8].trim());
            String cargo = dados[9].trim();
            int departamento = Integer.parseInt(dados[10].trim());

            Gerente gerente = new Gerente(nome, senha, idade, telefone, cpf, email, dataAdmissao, dataNascimento, cargo, departamento);
            gerentes.add(gerente);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return gerentes;
    }

     public static List<Diretor> carregaDiretor(String arquivo) {
        List<Diretor> diretores = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[1].trim();
                String senha = dados[2].trim();
                int idade = Integer.parseInt(dados[3].trim());
                String telefone = dados[4].trim();
                String cpf = dados[5].trim();
                String email = dados[6].trim();
                Data dataNascimento = parseData(dados[7].trim());
                Data dataAdmissao = parseData(dados[8].trim());
                String cargo = dados[9].trim();

                Diretor diretor = new Diretor(nome, senha, idade, telefone, cpf, email, dataAdmissao, dataNascimento, cargo);
                diretores.add(diretor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return diretores;
    }

}
