package Classes;


import ClassesAux.Data;



public class Funcionario extends Pessoa {

    private int codigo;
    private float salarioBase = 1200;
    public static int Nfuncionarios = 0;
    private Data dataAdmissao;
    private String cargo;

    public Funcionario(String nome, int i, String string, String cpf, String string2, Data dataAdmissao, Data data) {
        super(nome, i, string, cpf, string2, data);
        Nfuncionarios++;
        this.codigo = Nfuncionarios;
        this.dataAdmissao = dataAdmissao;
        this.cargo = "Empregado";
    }
    
    public Funcionario(String nome, int idade, String telefone, String cpf, Data dataN, Data dataAdmissao, String cargo) {
        super(nome, idade, telefone, cpf, dataN);
        Nfuncionarios++;
        this.codigo = Nfuncionarios;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }
    
    public Funcionario(String nome, int idade, String telefone, String email, String cpf, Data dataN, Data dataAdmissao, String cargo) {
        super(nome, idade, telefone, email, cpf, dataN);
        Nfuncionarios++;
        this.codigo = Nfuncionarios;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\nCargo: " + cargo + "\nCódigo: " + codigo + "\nSalário Base: " + salarioBase + "\n";
    }


    /*No calcularSalarioLiquido() método, assumi uma dedução fixa de 10% para impostos
     e 5% para seguro saúde do salário base para calcular o salário líquido. */
    public double calcularSalarioLiquido() {
        double salarioBruto = salarioBase;
        double salarioLiquido = salarioBruto - (salarioBruto * 0.1) - (salarioBruto * 0.05);
        return salarioLiquido;
    }

    /* calcula o tempo na empresa, a partir da admissão até a data atual */
    public int calcularTempoServico() {
        Data dataAtual = new Data(); // Obtenha a data atual usando a implementação da classe Data
        int anos = dataAtual.getAno() - dataAdmissao.getAno();
        int meses = dataAtual.getMes() - dataAdmissao.getMes();
        int dias = dataAtual.getDia() - dataAdmissao.getDia();
    
        // Verifique se a diferença de meses é negativa ou se a diferença de dias é negativa
        if (meses < 0 || (meses == 0 && dias < 0)) {
            anos--; // Subtraia um ano, pois o funcionário ainda não completou o último ano de serviço
            meses += 12; // Adicione 12 meses para compensar a diferença negativa de meses
        }
    
        // Verifique se a diferença de dias é negativa
        if (dias < 0) {
            meses--; // Subtraia um mês, pois o funcionário ainda não completou o último mês de serviço
        }
    
        return anos;
    }
    public void calculoSalarial(int horas) {

        if (horas > 160) {
            //a cada hora extra trabalhada vai receber 1% a mais do salario
            System.out.println("O salário fica em R$" + (salarioBase + salarioBase * ((horas - 160)*0.01)));
        } else if(horas < 160){
            System.out.println("O salário fica em R$" + salarioBase * 0.8);
        }else{
            System.out.println("O salário fica em R$" + salarioBase);
        }
    }

    /**
     * @return int return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return Data return the dataAdmissao
     */
    public Data getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(Data dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return String return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float novoSalario) {
        this.salarioBase =  novoSalario;
    }

    public String getNome() {
        return nome;
    }

}
