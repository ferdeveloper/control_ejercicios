/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdeveloper;

import com.ferdeveloper.negocio.Ejercicio;
import com.ferdeveloper.persistencia.dao.BussinessException;
import com.ferdeveloper.persistencia.dao.EjercicioDAO;
import com.ferdeveloper.persistencia.dao.impl.hibernate.EjercicioDAOImplHibernate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernandoarenasdev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjercicioDAO ejercicioDAO = new EjercicioDAOImplHibernate();
        
        try {
            Ejercicio ejercicio = (Ejercicio) ejercicioDAO.get(7);
            System.out.println("n:" + ejercicio.getNombreEjercicio());
        } catch (BussinessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
