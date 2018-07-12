/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans.forms;

import aplicacion.beans.MateriaBean;
import aplicacion.model.Alumno;
import aplicacion.model.Materia;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class AlumnoFormBean implements Serializable {
    
    @ManagedProperty(value = "#{materiaBean}")
    private MateriaBean materiaBean;
    private Alumno alumno;
    private List<Alumno> listaAlumnos;
    private List<Materia> ListaMaterias;
    public AlumnoFormBean() {
        materiaBean = new MateriaBean();
        materiaBean.listarMaterias();
        
    }
    public void listarMaterias() {
        materiaBean = new MateriaBean();
        setListaMaterias(getMateriaBean().listarMaterias());
    }
    public void establecerAlumno(Alumno alu){
        setAlumno(alu);
    }
    
    public void agregarAlumno(){
        listaAlumnos.add(getAlumno());
    }
    public void modificarAlumno(){
        
    }
    public void eliminarAlumno(){
        
    }
    /**
     * @return the materiaBean
     */
    public MateriaBean getMateriaBean() {
        return materiaBean;
    }

    /**
     * @param materiaBean the materiaBean to set
     */
    public void setMateriaBean(MateriaBean materiaBean) {
        this.materiaBean = materiaBean;
    }

    /**
     * @return the alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the listaAlumnos
     */
    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * @param listaAlumnos the listaAlumnos to set
     */
    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * @return the ListaMaterias
     */
    public List<Materia> getListaMaterias() {
        return ListaMaterias;
    }

    /**
     * @param ListaMaterias the ListaMaterias to set
     */
    public void setListaMaterias(List<Materia> ListaMaterias) {
        this.ListaMaterias = ListaMaterias;
    }
    
}
