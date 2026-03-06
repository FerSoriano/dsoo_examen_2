package model;

public class Usuario {
    private int id;
    private TIPO_USUARIO tipo;
    private String categoria;
    private String nombre;
    private String email; // se cambia login por email
    private String password;

    public Usuario(int id, TIPO_USUARIO tipo, String categoria, String nombre, String email, String password) {
        this.id = id;
        this.tipo = tipo;
        this.categoria = categoria;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TIPO_USUARIO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO_USUARIO tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
