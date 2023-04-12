package com.franco.oscar.proyecto.parkingmanager.sorteo;

/**
 * @author Franco y Oscar
 * @version 0.1
 * Contiene la informacion de sorteo para la creacion de formulario
 */

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
    
    /** 
     *Devuelve descripcion
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /** 
     * Asigna descripcion
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /** 
     * Devuelve fecha
     * @return String
     */
    public String getFecha() {
        return fecha;
    }
    
    /** 
     * Asigna fecha
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    /** 
     * Devuelve estado
     * @return String
     */
    public String getEstado() {
        return estado;
    }
    
    /** 
     * Asigna estado
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
