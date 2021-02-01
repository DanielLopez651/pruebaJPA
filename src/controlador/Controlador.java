/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import modelo.Garante;
import modelo.Propietario;
import util.JPAUtils;

/**
 *
 * @author user
 */
public class Controlador {

    private Propietario pp;
    private Garante garante;

    public void crear(long id, String cedula, String nombre, String apellido,
            String direccion, double sueldo, double precioCasa) {
        EntityManager em = JPAUtils.getEntityManager();
        pp = new Propietario(id, cedula, nombre, apellido, direccion, sueldo, precioCasa);
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        em.persist(pp);
        tr.commit();
        em.close();

    }

    public Propietario buscar(long id) {
        EntityManager em = JPAUtils.getEntityManager();
        try {
            return em.find(Propietario.class, id);
        } finally {
            em.close();
        }
    }

    public void crearGarante(long id, String cedula, String nombre, String apellido,
            String direccion,Propietario propietario) {
        EntityManager em = JPAUtils.getEntityManager();
        garante = new Garante(id, propietario, cedula, nombre, apellido, direccion);
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        em.persist(garante);
        tr.commit();
        em.close();

    }

    public Garante buscarG(long id) {
        EntityManager em = JPAUtils.getEntityManager();
        try {
            return em.find(Garante.class, id);
        } finally {
            em.close();
        }
    }
   
    
}
