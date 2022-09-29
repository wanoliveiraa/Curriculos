package model;

import java.util.ArrayList;

public class Curriculos {
    private String id;
    private String nome;
    private ArrayList <Setor> setor;
    
   
    public Curriculos(String id, String nome) {
        this.id = id;
        this.nome = nome;
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
    
    
}
