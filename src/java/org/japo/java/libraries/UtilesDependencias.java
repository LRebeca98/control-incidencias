/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public final class UtilesDependencias {

   // Valores predeterminados
    public static final int DEF_ID = 0;
    public static final  String DEF_NOMBRE = "Indefinida";
    public static final  String DEF_INFO = "Dependencia Indefinida";

    // Expresiones regulares
    public static final String REG_NOMBRE = "[\\w áéíóúÁÉÍÓÚçÇñÑ]{3,50}";
    public static final String REG_INFO = "[\\w áéíóúÁÉÍÓÚçÇñÑ]{3,50}";

    private UtilesDependencias() {
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
}
