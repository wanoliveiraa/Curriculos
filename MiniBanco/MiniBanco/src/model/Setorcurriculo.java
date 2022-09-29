
package model;

public class Setorcurriculo {
    private String id;
    private String curriculoid;
    private String setorid;

    public Setorcurriculo(String id, String curriculoid, String setorid) {
        this.id = id;
        this.curriculoid = curriculoid;
        this.setorid = setorid;
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

    public String getSetorid() {
        return setorid;
    }

    public void setSetorid(String setorid) {
        this.setorid = setorid;
    }
    
}
