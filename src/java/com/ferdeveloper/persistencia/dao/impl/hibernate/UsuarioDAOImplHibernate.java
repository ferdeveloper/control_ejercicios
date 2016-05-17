package com.ferdeveloper.persistencia.dao.impl.hibernate;

import com.ferdeveloper.negocio.Ejercicio;
import com.ferdeveloper.negocio.Usuario;
import com.ferdeveloper.persistencia.dao.BussinessException;
import com.ferdeveloper.persistencia.dao.HibernateUtil;
import com.ferdeveloper.persistencia.dao.UsuarioDAO;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author fernandoarenasdev
 */
public class UsuarioDAOImplHibernate implements UsuarioDAO {

    @Override
    public Usuario get(int id) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Usuario t) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usuario t) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario t) throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findAll() throws BussinessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario findRol(Usuario usuario) throws BussinessException {
        HibernateUtil.buildSessionFactory();

        List<Usuario> usuarios = null;

        try {
            HibernateUtil.openSessionAndBindToThread();
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();

            Query query = session.createQuery("SELECT * FROM Usuarios WHERE nombreUsuario =: nombreUsuario AND passwordUsuario =: passwordUsuario;");
            query.setString("nombreUsuario", usuario.getNombreUsuario());
            query.setString("passwordUsuario", usuario.getPasswordUsuario());
            usuarios = query.list();
            return usuarios.get(1);
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
    }

}
