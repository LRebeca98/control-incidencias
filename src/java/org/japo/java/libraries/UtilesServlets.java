/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public final class UtilesServlets {
    // Lapso Inactividad por Defecto
    private static final int DEF_LAPSO = 1800;
  

    private UtilesServlets() {
    }
    
    public static DataSource obtenerDataSource(ServletConfig config) {
        //dataSource
        DataSource ds;
        try {
            // Contexto Inicial Nombres JNDI
            Context iniCtx = new InitialContext();
            
            // Situar Contexto Inicial
             Context envCtx = (Context) iniCtx.lookup("java:/comp/env");
             
             // Contexto Inicial > DataSource
             ds = (DataSource) envCtx.lookup("jdbc/" + obtenerNombreBD(config));
        } catch (NamingException ex) {
            ds = null;
        }
        
        //Retorno
        return ds;
        
    } 
    
    private static String obtenerNombreBD(ServletConfig config) {
        // Parámetro de Contexto (web.xml)
        String paramName = "base-datos";
        
        // Servlet Config
        ServletContext context = config.getServletContext();
        
        // Retorno: nombre base de datos
        return context.getInitParameter(paramName);
    } 
    
    public static final int obtenerLapsoInactividad(ServletConfig config) {
        // Tiempo Máximo de Inactividad de sesión
        int lapso;
        
        // Nombre del Parámetro
        String paramName = "lapso-inactividad";
        
        //Contexto de la aplicación
        ServletContext context = config.getServletContext();
        
        // Contexto > Valor Parámetro
        String paramValue = context.getInitParameter(paramName);
        
        try {
             // String > int
        lapso = Integer.parseInt(paramValue);
        } catch (NumberFormatException e){
            lapso = DEF_LAPSO;
        }
       
        // Retorno
        return lapso;
    }

   
}
