/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
@Entity
public class Propietario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    @OneToMany(mappedBy="propietario", cascade = CascadeType.ALL)
    private List<Garante> listaGarante;
    
    
    @Column
    private String cedula;
    @Column
    
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String direccion;
    @Column

    private double sueldo;
    @Column
    private double precioCasa;
    

    public Propietario() {
    }
    

    public Propietario(Long id, String cedula, String nombre, String apellido,
            String direccion,  double sueldo, double precioCasa) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
       
        this.sueldo = sueldo;
        this.precioCasa = precioCasa;
    }

    public List<Garante> getListaGarante() {
        return listaGarante;
    }

    public void setListaGarante(List<Garante> listaGarante) {
        this.listaGarante = listaGarante;
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPrecioCasa() {
        return precioCasa;
    }

    public void setPrecioCasa(double precioCasa) {
        this.precioCasa = precioCasa;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propietario)) {
            return false;
        }
        Propietario other = (Propietario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + ", cedula=" + 
                cedula + ", nombre=" + nombre + ", apellido=" + apellido +
                ", direccion=" + direccion + ", sueldo=" + sueldo + ", precioCasa=" + precioCasa + '}';
    }

   

  
    
}
