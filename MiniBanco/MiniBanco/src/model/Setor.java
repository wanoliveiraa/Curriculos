
package model;

import java.util.ArrayList;


public class Setor {
    private String id;
    private String nome;
    private String sigla;
    private ArrayList<Curriculos> curriculos;
     

    public Setor(String id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    
    
}
