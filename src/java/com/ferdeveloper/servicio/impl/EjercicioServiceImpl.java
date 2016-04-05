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
    public void insert(Ejercicio ejercicio) throws BussinessException {
        ejercicioDAO.insert(ejercicio);
    }

    @Override
    public void update(Ejercicio ejercicio) throws BussinessException {
        ejercicioDAO.update(ejercicio);
    }

    @Override
    public void delete(Ejercicio ejercicio) throws BussinessException {
        ejercicioDAO.delete(ejercicio);
    }

    @Override
    public List<Ejercicio> findAll() throws BussinessException {
        return ejercicioDAO.findAll();
    }
    
}
