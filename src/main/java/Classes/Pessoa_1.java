package Classes;

import ClassesAux.Data;


public abstract class Pessoa_1 {
    protected String nome;
    protected int idade;
    protected String telefone;
    protected String email;
    protected String cpf;  
    protected Data dataNascimento;
    
    public Pessoa_1(String nome, int idade, String cpf, Data dataN){
        this(nome,idade, "sem celular","sem email",cpf,dataN);
    }
       
    public Pessoa_1(String nome, int idade, String telefone, String cpf, Data dataN){
        this(nome,idade,telefone,"sem email",cpf,dataN);
    }
    
    public Pessoa_1(String nome, String email, int idade, String cpf, Data dataN){
        this(nome,idade,"sem celular", email, cpf,dataN);
    }
    
    public Pessoa_1(String nome, int idade, String telefone, String email, String cpf, Data dataN){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataN;
    }
    
    @Override
    public String toString(){
        return "nome: " + nome + "\nidade: " + idade + 
                "\nData de Nascimento: " + dataNascimento.imprimirDataExtenso() 
                + "\ntelefone: " + telefone + "\nemail: " + email + "\ncpf: " + cpf;
    }
}