package com.ferdeveloper.negocio;
import java.io.Serializable;
import java.sql.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author fernandoarenasdev
 */
public class Ejercicio implements Serializable{
    private int idEjercicio;

    @NotNull
    @Size(min = 3, max = 50)
    private String nombreEjercicio;
    
    private String descripcionEjercicio;
    private String categoriaEjercicio;
    private String cursoEjercicio;
    private Date fechaEjercicio;
    private Date fechaCreacion;
    private String observacionesEjercicio;

    public Ejercicio() {
    }

    public Ejercicio(String nombreEjercicio, String descripcionEjercicio, String categoriaEjercicio, String cursoEjercicio, Date fechaEjercicio, Date fechaCreacion, String observacionesEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
        this.descripcionEjercicio = descripcionEjercicio;
        this.categoriaEjercicio = categoriaEjercicio;
        this.cursoEjercicio = cursoEjercicio;
        this.fechaEjercicio = fechaEjercicio;
        this.fechaCreacion = fechaCreacion;
        this.observacionesEjercicio = observacionesEjercicio;
    }

    public Ejercicio(int idEjercicio, String nombreEjercicio, String descripcionEjercicio, String categoriaEjercicio, String cursoEjercicio, Date fechaEjercicio, Date fechaCreacion, String observacionesEjercicio) {
        this.idEjercicio = idEjercicio;
        this.nombreEjercicio = nombreEjercicio;
        this.descripcionEjercicio = descripcionEjercicio;
        this.categoriaEjercicio = categoriaEjercicio;
        this.cursoEjercicio = cursoEjercicio;
        this.fechaEjercicio = fechaEjercicio;
        this.fechaCreacion = fechaCreacion;
        this.observacionesEjercicio = observacionesEjercicio;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public String getDescripcionEjercicio() {
        return descripcionEjercicio;
    }

    public void setDescripcionEjercicio(String descripcionEjercicio) {
        this.descripcionEjercicio = descripcionEjercicio;
    }

    public String getCategoriaEjercicio() {
        return categoriaEjercicio;
    }

    public void setCategoriaEjercicio(String categoriaEjercicio) {
        this.categoriaEjercicio = categoriaEjercicio;
    }

    public String getCursoEjercicio() {
        return cursoEjercicio;
    }

    public void setCursoEjercicio(String cursoEjercicio) {
        this.cursoEjercicio = cursoEjercicio;
    }

    public Date getFechaEjercicio() {
        return fechaEjercicio;
    }

    public void setFechaEjercicio(Date fechaEjercicio) {
        this.fechaEjercicio = fechaEjercicio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getObservacionesEjercicio() {
        return observacionesEjercicio;
    }

    public void setObservacionesEjercicio(String observacionesEjercicio) {
        this.observacionesEjercicio = observacionesEjercicio;
    }
}
