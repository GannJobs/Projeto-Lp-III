package Classes;


import ClassesAux.Data;
import java.util.List;

public class Diretor extends Funcionario{
   // private String setor;
    private double salarioDiretor = 5000.00;

    public Diretor(String nome, String senha, int i, String string, String cpf, String string2, Data dataAdmissao, Data data, String cargo) {
        super( nome, senha, i, string,cpf, string2, dataAdmissao, data, cargo);
    }
    
    public Diretor(Diretor diretor) {
        super(diretor.getNome(), diretor.getSenha(), diretor.getIdade(), diretor.getTelefone(),diretor.getEmail(), diretor.getCPF(), diretor.getDataAdmissao(), diretor.getDataN(), "Diretor");
    }
    
    public double getSalarioBaseDiretor() {
        return salarioDiretor;
    }
    
    public static Diretor buscarNome(List<Diretor> listaDiretor, String nome) {
        for (Diretor diretor : listaDiretor) {
            if (diretor.getNome() == nome) {
                return diretor; // Retorna o estagiario encontrado
            }
        }
    return null;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSalário Base Diretor: " + salarioDiretor;
    }
}
