package Classes;


import ClassesAux.Data;



public class Gerente extends Funcionario implements Pagamento{

    private int departamento;
    private double salario = 2500.00;
    private final double salarioBase = salario;

    public Gerente(String nome, String senha, int i, String string, String cpf, String string2, Data dataAdmissao, Data data, String cargo, int departamento) {
        super(nome, senha, i, string,cpf, string2, dataAdmissao, data, cargo);
        this.departamento = departamento;
    }
    
    @Override
    public boolean Aumento(double valor){
        if(valor > (salarioBase + salarioBase*0.3)){
            return false;
        }else if(valor < (salarioBase + salarioBase*0.3) && valor > salarioBase){
            this.salario = valor;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean Desconto(double valor){
        if(valor < (salarioBase - salarioBase*0.3)){
            return false;
        }else if(valor < salarioBase && valor > (salarioBase - salarioBase*0.3)){
            this.salario = valor;
            return true;
        } 
        return false;
    }
    
    public int getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(int nDep){
        this.departamento = nDep;
    }
    
    public double getSalario(){
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento + "\nSalário Gerente: " + salario;
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
    }

     public int getIdade(){
        return idade;
    } 
    public String getTelefone(){
        return telefone;
    }
     public String getCPF(){
        return cpf;
    }
     public String getEmail(){
        return email;
    }

    public Data getDataNascimento(){
        return dataNascimento;
    }
}
