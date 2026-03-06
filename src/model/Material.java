package model;

public class Material {
    private int id;
    private String enlace;
    private String documento;

    public Material(int id, String enlace, String documento) {
        this.id = id;
        this.enlace = enlace;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}