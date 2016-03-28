/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdeveloper.persistencia.dao.impl.hibernate;

import com.ferdeveloper.negocio.Ejercicio;
import com.ferdeveloper.persistencia.dao.BussinessException;
import com.ferdeveloper.persistencia.dao.EjercicioDAO;
import com.ferdeveloper.persistencia.dao.GenericDAO;
import com.ferdeveloper.persistencia.dao.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author fernandoarenasdev
 */
public class EjercicioDAOImplHibernate implements EjercicioDAO {

    SessionFactory sessionFactory;

    @Override
    public Ejercicio get(int id) throws BussinessException {

        HibernateUtil.buildSessionFactory();
        Ejercicio ejercicio = null;

        try {
            HibernateUtil.openSessionAndBindToThread();
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            ejercicio = (Ejercicio) session.get(Ejercicio.class, id);
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }

        //HibernateUtil.closeSessionFactory();
        return ejercicio;
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
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Query query = session.createQuery("FROM Ejercicio");
        List<Ejercicio> ejercicios = query.list();

        return ejercicios;
    }

}