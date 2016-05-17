package com.ferdeveloper.persistencia.dao;

import com.ferdeveloper.negocio.Usuario;

/*
 * @author Fernando Arenas Alapont
 * @ferdeveloper
 */
public interface UsuarioDAO extends GenericDAO<Usuario>{
    
    Usuario findRol(Usuario usuario) throws BussinessException;
    
}
