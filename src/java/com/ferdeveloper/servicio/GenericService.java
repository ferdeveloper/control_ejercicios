/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdeveloper.servicio;

import com.ferdeveloper.persistencia.dao.BussinessException;
import java.util.List;

/**
 *
 * @author fernandoarenasdev
 */
public interface GenericService<T> {

    T get(int id) throws BussinessException;

    void insert(T t) throws BussinessException;

    void update(T t) throws BussinessException;

    void delete(T t) throws BussinessException;

    List<T> findAll() throws BussinessException;
}
