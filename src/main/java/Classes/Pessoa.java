package Classes;

import ClassesAux.Data;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String telefone;
    protected String email;
    protected String cpf;  
    protected Data dataNascimento;
    
    public Pessoa(String nome, int idade, String cpf, Data dataN){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataN;
    }
       
    public Pessoa(String nome, int idade, String telefone, String cpf, Data dataN){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataNascimento = dataN;
    }
    
    public Pessoa(String nome, String email, int idade, String cpf, Data dataN){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataN;
    }
    
    public Pessoa(String nome, int idade, String telefone, String email, String cpf, Data dataN){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataN;
    }
    
    public String toString(){
        return "nome: " + nome + "\nidade: " + idade + 
                "\nData de Nascimento: " + dataNascimento.imprimirDataExtenso() 
                + "\ntelefone: " + telefone + "\nemail: " + email + "\ncpf: " + cpf;
    }
}
