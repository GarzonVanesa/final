/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.beans;

import aplicacion.model.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class MateriaBean {
    private List<Materia> listaMaterias;
    public MateriaBean() {
        listaMaterias = new ArrayList();
    }
    public List<Materia> listarMaterias(){
        listaMaterias = new ArrayList();
        
        listaMaterias.add(new Materia("123","Algebra","licenciatura","1"));
        listaMaterias.add(new Materia("124","Base de datos","licenciatura","2"));
        listaMaterias.add(new Materia("125","Historia","licenciatura","3"));
        return  listaMaterias;
    }
}
