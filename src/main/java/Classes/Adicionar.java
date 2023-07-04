package Classes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Adicionar {
    public static boolean adicionarEstagiario(Estagiario estagiario, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String linha = estagiario.getNome() + "," +
                           estagiario.getSenha() + "," +
                           estagiario.getIdade() + "," +
                           estagiario.getTelefone() + "," +
                           estagiario.getCPF() + "," +
                           estagiario.getEmail() + "," +
                           estagiario.getDataNascimento().getDia() + ":" +
                           estagiario.getDataNascimento().getMes() + ":" +
                           estagiario.getDataNascimento().getAno() + "," +
                           estagiario.getDataAdmissao().getDia() + ":" +
                           estagiario.getDataAdmissao().getMes() + ":" +
                           estagiario.getDataAdmissao().getAno() + "," +
                           estagiario.getCargo() + "," +
                           estagiario.getDuracaoEstagio() + "," +
                           estagiario.getDepartamento();

            writer.write(linha);
            writer.newLine();
            writer.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean adicionarEmpregado(Empregado empregado, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String linha = empregado.getNome() + "," +
                           empregado.getSenha() + "," +
                           empregado.getIdade() + "," +
                           empregado.getTelefone() + "," +
                           empregado.getCPF() + "," +
                           empregado.getEmail() + "," +
                           empregado.getDataNascimento().getDia() + ":" +
                           empregado.getDataNascimento().getMes() + ":" +
                           empregado.getDataNascimento().getAno() + "," +
                           empregado.getDataAdmissao().getDia() + ":" +
                           empregado.getDataAdmissao().getMes() + ":" +
                           empregado.getDataAdmissao().getAno() + "," +
                           empregado.getCargo() + "," +
                           empregado.getDepartamento();

            writer.write(linha);
            writer.newLine();
            writer.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

     public static boolean adicionarGerente(Gerente gerente, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String linha = gerente.getNome() + "," +
                           gerente.getSenha() + "," +
                           gerente.getIdade() + "," +
                           gerente.getTelefone() + "," +
                           gerente.getCPF() + "," +
                           gerente.getEmail() + "," +
                           gerente.getDataNascimento().getDia() + "/" +
                           gerente.getDataNascimento().getMes() + "/" +
                           gerente.getDataNascimento().getAno() + "," +
                           gerente.getDataAdmissao().getDia() + "/" +
                           gerente.getDataAdmissao().getMes() + "/" +
                           gerente.getDataAdmissao().getAno() + "," +
                           gerente.getCargo() + "," +
                           gerente.getDepartamento();

            writer.write(linha);
            writer.newLine();
            writer.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean adicionarDiretor(Diretor diretor, String arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String linha = diretor.getNome() + "," +
                           diretor.getSenha() + "," +
                           diretor.getIdade() + "," +
                           diretor.getTelefone() + "," +
                           diretor.getCPF() + "," +
                           diretor.getEmail() + "," +
                           diretor.getDataNascimento().getDia() + "/" +
                           diretor.getDataNascimento().getMes() + "/" +
                           diretor.getDataNascimento().getAno() + "," +
                           diretor.getDataAdmissao().getDia() + "/" +
                           diretor.getDataAdmissao().getMes() + "/" +
                           diretor.getDataAdmissao().getAno() + "," +
                           diretor.getCargo();
                           

            writer.write(linha);
            writer.newLine();
            writer.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
