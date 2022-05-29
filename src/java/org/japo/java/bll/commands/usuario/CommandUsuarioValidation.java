/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.bll.commands.usuario;

import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpSession;
import org.japo.java.entities.Usuario;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public class CommandUsuarioValidation {
    private final HttpSession sesion;
//    private final DLLProceso dalProceso;
    
    public CommandUsuarioValidation(final ServletConfig config, final HttpSession sesion) {
        this.sesion = sesion;
//        this.dalProceso = new DLLProceso(config);
    }
    
//    public final boolean validarAccesoComando(final HttpSession sesion, final String comando) {
//        boolean checkOK;
//        try {
//            final Usuario usuario = (Usuario)sesion.getAttribute("usuario");
//            final int perfil = usuario.getPerfil();
//            if (perfil >= 800) {
//                checkOK = true;
//            }
//            else {
//                Proceso proceso = this.dalProceso.consultar(comando);
//                checkOK = this.validarProcesoPermisoPerfil(permPerfil, proceso);
//                if (!checkOK) {
//                    final List<PermisoUsuario> permUsuario = (List<PermisoUsuario>)this.dalPermisoUsuario.listar(usuario.getId());
//                    checkOK = this.validarProcesoPermisoUsuario(permUsuario, proceso);
//                }
//            }
//        }
//        catch (Exception e) {
//            checkOK = false;
//        }
//        return checkOK;
//    }
//    
//    public final boolean validarAccesoDevel(final HttpSession sesion) {
//        boolean checkOK;
//        try {
//             Usuario usuario = (Usuario)sesion.getAttribute("usuario");
//             int perfil = usuario.getPerfil();
//            checkOK = (perfil >= 900);
//        }
//        catch (NullPointerException e) {
//            checkOK = false;
//        }
//        return checkOK;
//    }
    
    public final boolean validarAccesoAdmin(final HttpSession sesion) {
        boolean checkOK;
        try {
            final Usuario usuario = (Usuario)sesion.getAttribute("usuario");
            final int perfil = usuario.getPerfil();
            checkOK = (perfil >= 800);
        }
        catch (NullPointerException e) {
            checkOK = false;
        }
        return checkOK;
    }
    
    public final boolean validarAccesoBasic(final HttpSession sesion) {
        boolean checkOK;
        try {
            final Usuario usuario = (Usuario)sesion.getAttribute("usuario");
            final int perfil = usuario.getPerfil();
            checkOK = (perfil >= 100);
        }
        catch (NullPointerException e) {
            checkOK = false;
        }
        return checkOK;
    }
    
    public final boolean validarAccesoServicio(final String servicio) {
        return true;
    }
}
