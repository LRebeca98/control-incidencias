package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.entities.Usuario;
import java.util.List;
import org.japo.java.dll.usuario.DLLUsuario;
import org.japo.java.bll.commands.Command;

public final class CommandUsuarioGaleria extends Command {

    public void process() throws ServletException, IOException {
        String out = "usuario/usuario-galeria";
        if (validarSesion(request)) {
            CommandUsuarioValidation validator = new CommandUsuarioValidation(
                    config, request.getSession(false));
            if (validator.validarAccesoAdmin(request.getSession(false))) {
                // Capas de datos 
                DLLUsuario dllUsuario = new DLLUsuario(config);

                List<Usuario> usuarios = dllUsuario.listar();

                request.setAttribute("usuarios", usuarios);
            } else {
                out = "message/acceso-denegado";
            }
        } else {
            out = "message/sesion-invalida";
        }
        this.forward(out);
    }
}
