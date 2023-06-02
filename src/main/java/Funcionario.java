
import Classes.Pessoa;
import ClassesAux.Data;

public class Funcionario extends Pessoa {

    private int codigo;
    private final float salarioBase = 1200;
    public static int Nfuncionarios = 0;

    public Funcionario(String nome, String email, int idade, String cpf, Data dataN) {
        super(nome, email, idade, cpf, dataN);
        Nfuncionarios++;
        this.codigo = Nfuncionarios;
    }

    public Funcionario(String nome, int idade, String telefone, String cpf, Data dataN) {
        super(nome, idade, telefone, cpf, dataN);
        Nfuncionarios++;
        this.codigo = Nfuncionarios;
    }
    
    public Funcionario(String nome, int idade, String telefone, String email, String cpf, Data dataN) {
        super(nome, idade, telefone, email, cpf, dataN);
        Nfuncionarios++;
        this.codigo = Nfuncionarios;
    }

    public void calculoSalarial(int horas){
        if (horas > 20){
            System.out.println("O salario fica em R#" + (salarioBase + salarioBase*0.2));
        } else {
            System.out.println("O salario fica em R#" + salarioBase*0.8);
        }
    }
}
