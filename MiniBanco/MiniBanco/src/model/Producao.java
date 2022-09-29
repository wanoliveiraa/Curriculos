
package model;


public class Producao {
    private String id;
    private String curriculoid;
    private String tipo;
    private String titulo;
    private String identidade;
    private String veiculo;

    public Producao(String id, String curriculoid, String tipo, String titulo, String identidade, String veiculo) {
        this.id = id;
        this.curriculoid = curriculoid;
        this.tipo = tipo;
        this.titulo = titulo;
        this.identidade = identidade;
        this.veiculo = veiculo;
    }
   
   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurriculoid() {
        return curriculoid;
    }

    public void setCurriculoid(String curriculoid) {
        this.curriculoid = curriculoid;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    
}
