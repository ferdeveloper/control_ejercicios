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
import java.util.Date;
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
    public void insert(Ejercicio ejercicio) throws BussinessException {
        HibernateUtil.buildSessionFactory();
        
        try {
            Date date = new Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            ejercicio.setFechaCreacion(sqlDate);
            HibernateUtil.openSessionAndBindToThread();
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(ejercicio);
            session.getTransaction().commit();

        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }

        //HibernateUtil.closeSessionFactory();
    }

    @Override
    public void update(Ejercicio ejercicio) throws BussinessException {

        HibernateUtil.buildSessionFactory();

        try {
            HibernateUtil.openSessionAndBindToThread();
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.update(ejercicio);
            session.getTransaction().commit();

        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }

        //HibernateUtil.closeSessionFactory();
    }

    @Override
    public void delete(Ejercicio ejercicio) throws BussinessException {
        HibernateUtil.buildSessionFactory();

        try {
            HibernateUtil.openSessionAndBindToThread();
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.delete(ejercicio);
            session.getTransaction().commit();

        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }

        //HibernateUtil.closeSessionFactory();
    }

    @Override
    public List<Ejercicio> findAll() throws BussinessException {

        HibernateUtil.buildSessionFactory();
        List<Ejercicio> ejercicios = null;

        try {
            HibernateUtil.openSessionAndBindToThread();
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();

            Query query = session.createQuery("FROM Ejercicio");
            ejercicios = query.list();
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }

        return ejercicios;

    }
}
