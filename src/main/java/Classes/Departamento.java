package Classes;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ClassesAux.Data;

public class Departamento {

    private String nome;
    private int codigo;
    public static int NDeps = 0;
    private int gerenteResponsavel;

    public Departamento(String nome, int gerenteResponsavel) {
        NDeps++;
        this.nome = nome;
        this.codigo = NDeps;
        this.gerenteResponsavel = gerenteResponsavel;
    }
    
    public Departamento(Departamento dep) {
        NDeps++;
        this.nome = dep.getNome();
        this.codigo = NDeps;
        this.gerenteResponsavel = dep.getGerenteResponsavel();
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(int gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }
    
    public static Departamento buscarDepartamentoPorCodigo(List<Departamento> listaDepartamentos, int codigoBusca) {
        for (Departamento departamento : listaDepartamentos) {
            if (departamento.getCodigo() == codigoBusca) {
                return departamento; // Retorna o departamento encontrado
            }
        }
    return null; // Retorna null se nenhum departamento for encontrado
    }
}