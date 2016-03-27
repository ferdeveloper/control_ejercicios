/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdeveloper.presentacion.controller;

import com.ferdeveloper.common.json.JsonTransformer;
import com.ferdeveloper.common.json.JsonTransformerImplJackson;
import com.ferdeveloper.negocio.Ejercicio;
import com.ferdeveloper.persistencia.dao.BussinessException;
import com.ferdeveloper.persistencia.dao.EjercicioDAO;
import com.ferdeveloper.persistencia.dao.impl.hibernate.EjercicioDAOImplHibernate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ejercicioController {

//    @Autowired
//    JsonTransformer jsonTransformer;
//
//    @Autowired
//    SeguroMedicoDAO seguroMedicoDAO;
    
    EjercicioDAO ejercicioDAO = new EjercicioDAOImplHibernate();
    
    JsonTransformer jsonTransformer = new JsonTransformerImplJackson();

    @RequestMapping(value = "/Ejercicio/{idEjercicio}", method = RequestMethod.GET, produces = "application/json")
    public void read(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @PathVariable("idEjercicio") int idEjercicio) {
        try {
            Ejercicio ejercicio = ejercicioDAO.get(idEjercicio);
            String jsonSalida = jsonTransformer.toJson(ejercicio);

            httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            httpServletResponse.setContentType("application/json; charset=UTF-8");
            httpServletResponse.getWriter().println(jsonSalida);

        } catch (BussinessException ex) {
            httpServletResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);

        } catch (Exception ex) {
            httpServletResponse.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);

        }

    }
}
