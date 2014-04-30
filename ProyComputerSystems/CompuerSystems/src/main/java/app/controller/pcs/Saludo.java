/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.pcs;

import app.model.Persona;
import app.zelper.Constantes;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SparKLes
 */
@Controller
@RequestMapping("/pcs")
public class Saludo {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String index(HttpSession session) {
        //logger.warn("LOG INTO INDEX");
        Persona persona = (Persona) session.getAttribute(Constantes.SESSION_USUARIO);
        
        return "PCS: "+ persona.getNombreCompleto();
    }
}
