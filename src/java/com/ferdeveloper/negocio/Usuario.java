package com.ferdeveloper.negocio;
/**
 *
 * @author Fernando Arenas Alapont
 */
public class Usuario {
    private int idUsuario;
    private String rolUsuario;
    private String nombreUsuario;
    private String passwordUsuario;

    public Usuario() {
    }

    public Usuario(String rolUsuario, String nombreUsuario, String passwordUsuario) {
        this.rolUsuario = rolUsuario;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public Usuario(int idUsuario, String rolUsuario, String nombreUsuario, String passwordUsuario) {
        this.idUsuario = idUsuario;
        this.rolUsuario = rolUsuario;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }
}
