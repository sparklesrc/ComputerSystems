/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller.pcs;

import app.controller.pcs.empresa.EmpresaService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SparKLes
 */
@Controller
@SessionAttributes("empresa")
//@RequestMapping("/pcs")
public class Saludo {

    @Autowired
    EmpresaService service;
    /*
     @ResponseBody
     @RequestMapping(method = RequestMethod.GET)
     public String index(HttpSession session) {
     //logger.warn("LOG INTO INDEX");
     Persona persona = (Persona) session.getAttribute(Constantes.SESSION_USUARIO);
        
     return "PCS: "+ persona.getNombreCompleto();
     }
     */

    //@RequestMapping(method = RequestMethod.GET)
    public ModelAndView index(HttpSession session) {
        //logger.warn("LOG INTO INDEX");
        return new ModelAndView("pcs/empresa/list", "empresas", service.getEmpresas());
    }

}
