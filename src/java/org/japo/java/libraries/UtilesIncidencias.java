/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.Date;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public final class UtilesIncidencias {

    // Valores predeterminados
    public static final int INCIDENCIA_CERRADA = 0;
    public static final int INCIDENCIA_ABIERTA = 1;
    
   // Valores predeterminados
    public static final int DEF_ID = 0;
    public static final  String DEF_NOMBRE = "Indefinida";
//    public static final  int DEF_INCIDENCIA = UtilesIncidencias.DEF_ID;
    public static final  String DEF_INFO = "Dependencia Indefinida";

    // Expresiones regulares
    public static final String REG_INFO = "[\\w áéíóúÁÉÍÓÚçÇñÑ]{3,255}";

    private UtilesIncidencias() {
    }

    public static final boolean validarId(int id) {
        return id >= DEF_ID;
    }

    public static final boolean validarNombre(String nombre) {
        return nombre.matches(REG_NOMBRE);
    }

    public static final boolean validarInfo(String info) {
        return info.matches(REG_INFO);
    }
    
    public static final boolean validarEstado(int estado) {
        return estado == INCIDENCIA_CERRADA || estado == INCIDENCIA_ABIERTA;
    }
    
    public static final boolean validarCreacion(Date creacion) {
        // Hace 20 años : ms
        long millis = 29 * 365 * 24 * 3600 * 1000;
        return true
                && creacion != null
                && creacion.after(new Date(new Date().getTime() - millis))
                && creacion.before(new Date(new Date() .getTime() + 3600 * 1000));

//return creacion != null;
    }
}
