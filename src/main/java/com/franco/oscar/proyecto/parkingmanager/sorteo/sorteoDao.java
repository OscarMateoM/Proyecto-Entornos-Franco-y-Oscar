package com.franco.oscar.proyecto.parkingmanager.sorteo;

public class sorteoDao {

    private String descripcion;
    private String fecha;
    private String estado;

    public sorteoDao() {
        this("","","");
    }
    
    public sorteoDao (String descripcion, String fecha, String estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
