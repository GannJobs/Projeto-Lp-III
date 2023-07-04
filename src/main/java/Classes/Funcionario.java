package Classes;


import ClassesAux.Data;



public class Funcionario extends Pessoa{

    private int codigo;
    private String senha;
    public static int Nfuncionarios = 0;
    private Data dataAdmissao;
    private String cargo;

    public Funcionario(String nome, String senha, int idade, String telefone, String email, String cpf, Data dataAdmissao, Data data, String cargo) {
        super(nome, idade, telefone, email, cpf, data);
        Nfuncionarios++;
        this.codigo = Nfuncionarios;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.senha = senha;
    }
    
    public Funcionario(String nome, String senha, int idade, String telefone, String cpf, Data dataN, Data dataAdmissao, String cargo) {
        super(nome, idade, telefone, cpf, dataN);
        Nfuncionarios++;
        this.codigo = Nfuncionarios;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.senha = senha;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\nCargo: " + cargo;
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
    /**
     * @return int return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
    
    public String getSenha(){
        return senha;
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

    public String getdata(){
        return super.getData();
    }
    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(Data dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public String getAdmExtenso(){
        return dataAdmissao.imprimirDataExtenso();
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
}
