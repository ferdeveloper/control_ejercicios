/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdeveloper.servicio.impl;

import com.ferdeveloper.negocio.Ejercicio;
import com.ferdeveloper.persistencia.dao.BussinessException;
import com.ferdeveloper.persistencia.dao.EjercicioDAO;
import com.ferdeveloper.persistencia.dao.impl.hibernate.EjercicioDAOImplHibernate;
import com.ferdeveloper.servicio.EjercicioService;
import java.util.List;

/**
 *
 * @author fernandoarenasdev
 */
public class EjercicioServiceImpl implements EjercicioService{
    EjercicioDAO ejercicioDAO = new EjercicioDAOImplHibernate();

    @Override
    public Ejercicio get(int id) throws BussinessException {
        return ejercicioDAO.get(id);
    }

    @Override
    public Ejercicio create() throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ejercicio save(Ejercicio t) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ejercicio update(Ejercicio t) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ejercicio> findAll() throws BussinessException {
        return ejercicioDAO.findAll();
    }
    
}
