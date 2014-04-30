/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.auth;

import app.dao.UsuarioDAO;
import app.model.Usuario;
import app.zelper.Constantes;
import app.zelper.RolesEnum;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 *
 * @author SparKLes
 */
@Component
public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Autowired
    UsuarioDAO usuarioDAO;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication a) throws IOException, ServletException {
   
        //Persona u = new Persona();
        //u.setEmail(a.getName());
        Usuario autenticado = usuarioDAO.getUsuarioForAuthDAO(a.getName());    

        request.getSession().setAttribute(Constantes.SESSION_USUARIO, autenticado.getPersona());
        
        System.out.println("EN LOGINSUCCESSHANDLER");
        
        if (autenticado.getTipo_usuario()== RolesEnum.PCS.getValue()) {
            this.setDefaultTargetUrl("/pcs");

        } else if (autenticado.getTipo_usuario()== RolesEnum.ADMINISTRADOR.getValue()) {
            this.setDefaultTargetUrl("/adm");

        } else if (autenticado.getTipo_usuario()== RolesEnum.EMPLEADO.getValue()) {
            this.setDefaultTargetUrl("/emp");
        }
        super.onAuthenticationSuccess(request, response, a);
        
        
        /*
        Usuario usuario = usuarioDAO.getUsuarioForAuthDAO(a.getName());

        if (usuario == null) {
            this.setDefaultTargetUrl("/login");
        }

        request.getSession().setAttribute(Constantes.SESSION_USUARIO, usuario.getPersona());

        List<UsuarioRol> roles = usuario.getUsuarioRol();

        for (UsuarioRol rol : roles) {
            if (rol.getAuthority().equals(RolesEnum.ADMIN.getValue())) {
                this.setDefaultTargetUrl("/adm");
                break;
                
            } else if (rol.getAuthority().equals(RolesEnum.SOCIO.getValue())) {
                this.setDefaultTargetUrl("/socio");
                break;
            }
        }
        
        super.onAuthenticationSuccess(request, response, authentication);
        */
    }
}
