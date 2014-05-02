/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.auth;

import app.model.Persona;
import app.zelper.Constantes;
import app.zelper.RolesEnum;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author SparKLes
 */
@Controller
public class AuthController {

    @RequestMapping("login")
    public String index(HttpServletRequest rq, @RequestParam(required = false) String error, Model model) throws Exception {

        Persona usuario = (Persona) rq.getSession().getAttribute(Constantes.SESSION_USUARIO);

        if (usuario != null) {
            if (usuario.getUsuario().getTipo_usuario()== RolesEnum.PCS.getValue()) {
                return ("redirect:/pcs/empresa");

            } else if (usuario.getUsuario().getTipo_usuario()== RolesEnum.ADMINISTRADOR.getValue()) {
                return ("redirect:/adm");

            } else if (usuario.getUsuario().getTipo_usuario()== RolesEnum.EMPLEADO.getValue()) {
                return ("redirect:/emp");

            }
        }

        if (error != null) {
            model.addAttribute("loginError", true);
        }

        return "login/login";
    }
}
