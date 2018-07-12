/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.model;

/**
 *
 * @author Alumno
 */
public class Materia {
    
    private String codigo;

    private String denominacion;

    private String carrera;

    private String añocursado;

    public Materia(String codigo, String denominacion, String carrera, String añocursado) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.carrera = carrera;
        this.añocursado = añocursado;
    }

    
    /**
     * Get the value of añocursado
     *
     * @return the value of añocursado
     */
    public String getAñocursado() {
        return añocursado;
    }

    /**
     * Set the value of añocursado
     *
     * @param añocursado new value of añocursado
     */
    public void setAñocursado(String añocursado) {
        this.añocursado = añocursado;
    }

    /**
     * Get the value of carrera
     *
     * @return the value of carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Set the value of carrera
     *
     * @param carrera new value of carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Get the value of denominacion
     *
     * @return the value of denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * Set the value of denominacion
     *
     * @param denominacion new value of denominacion
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set the value of codigo
     *
     * @param codigo new value of codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
