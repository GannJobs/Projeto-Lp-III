package Classes;


import ClassesAux.Data;

public class Diretor extends Funcionario{
   // private String setor;
    private double salarioDiretor = 5000.00;

    public Diretor(String nome, String senha, int i, String string, String cpf, String string2, Data dataAdmissao, Data data, String cargo) {
        super( nome, senha, i, string,cpf, string2, dataAdmissao, data, cargo);
    }

    public void promoverEstagiarioParaEmpregado(Estagiario estagiario, Departamento departamento) {
        Empregado empregadoPromovido = new Empregado(
            estagiario.getNome(),
            estagiario.getSenha(),
            estagiario.getIdade(),
            estagiario.getTelefone(),
            estagiario.getEmail(),
            estagiario.getCPF(),
            estagiario.getDataNascimento(),
            estagiario.getDataAdmissao(),
            estagiario.getCargo(),
            estagiario.getDepartamento()
        );
        
        //apagar estagiario

        System.out.println("Estagiário " + estagiario.getNome() + " promovido para o cargo de Empregado.");
        System.out.println("Novo salário base: " + empregadoPromovido.getSalario());
        System.out.println("\n---- Lista de Estagiários ----");
    }

    public void promoverEmpregadoParaGerente(Empregado empregado, Departamento departamento) {
        Gerente gerentePromovido = new Gerente(
            empregado.getNome(),
            empregado.getSenha(),
            empregado.getIdade(),
            empregado.getTelefone(),
            empregado.getEmail(),
            empregado.getCPF(),
            empregado.getDataNascimento(),
            empregado.getDataAdmissao(),
            empregado.getCargo(),
            empregado.getDepartamento()
        );
        
        //apagar empregado

        departamento.setGerenteResponsavel(gerentePromovido);

        System.out.println("Empregado " + empregado.getNome() + " promovido para o cargo de Gerente.");
        System.out.println("Novo salário base: " + gerentePromovido.getSalario());
    }
    
    public double getSalarioBaseDiretor() {
        return salarioDiretor;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSalário Base Diretor: " + salarioDiretor;
    }
}
